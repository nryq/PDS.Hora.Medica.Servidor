package webService;

import java.util.ArrayList;
import java.util.List;

import json.Json;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import orm.Horamedica2;
import orm.Medico2;
import orm.Reserva2;

public class PacienteService {
	final int ROW_COUNT = 100;
	int length;
	json.Json j = new Json();
	ArrayList<String[][]> arr = new ArrayList<String[][]>();
	
	public String bucarHoraAPS(int med, String crit1, String crit2) throws PersistentException{
		
		String out = "";
		String[] label = {"id", "Fecha", "Hora"};
		String condicion;
		if(crit1!=null && crit1.equals("")!=false && crit2!=null && crit2.equals("")!=false && med>0){
			condicion = "medicoid = "+med+"AND esAPS = 1 AND fecha BETWEEN \'"+crit1+"\' AND \'"+crit2+"\'";
		}else if (crit2!=null && crit2.equals("")!=false && med>0){
			condicion = "medicoid = "+med+"AND esAPS = 1 AND fecha > \'"+crit1+"\'";
		}else if(crit1!=null && crit1.equals("")!=false && med>0){
			condicion = "medicoid = "+med+"AND esAPS = 1 AND fecha < \'"+crit2+"\'";
		}else if(med>0){
			condicion = "medicoid = "+med+"AND esAPS = 1";
		}else{
			condicion = null;
		}
		
		
		orm.Horamedica2[] ormHoramedica2s = orm.Horamedica2DAO.listHoramedica2ByQuery(condicion, null);
		length = Math.min(ormHoramedica2s.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			String[][] o = {label,{
				""+ormHoramedica2s[i].getId(),
				""+ormHoramedica2s[i].getFecha().toString(),
				""
			}};
			arr.add(o);
		}
		System.out.println(length + " record(s) retrieved.");
		
		out = j.arrayJson(arr, "Resultados");
		
		return out;
	}
	
//	ReservarHoraAps Id HoraMedicaAps, IdPaciente
	public String reservarHoraAps(int idHora, int idPac) throws PersistentException{
		String condicion = "id = "+idPac,
				condicionHr = "id = "+idHora,
				condicionRes = "horamedicaid = "+idHora;
				
		orm.Paciente2[] ormPaciente2s = orm.Paciente2DAO.listPaciente2ByQuery(condicion, null);
		orm.Horamedica2[] ormHoramedica2s = orm.Horamedica2DAO.listHoramedica2ByQuery(condicionHr, null);
		orm.Reserva2[] ormRes = orm.Reserva2DAO.listReserva2ByQuery(condicionRes, null);
		
		PersistentTransaction t = orm.PDSTallerPersistentManager.instance().getSession().beginTransaction();
		try {
			
			if(ormRes.length == 0){
				orm.Paciente_hora lormPaciente_Entidad = orm.Paciente_horaDAO.createPaciente_hora();
				
				lormPaciente_Entidad.setPaciente(ormPaciente2s[0]);
				lormPaciente_Entidad.setHoramedica(ormHoramedica2s[0]);
				
				orm.Paciente_horaDAO.save(lormPaciente_Entidad);
				
				
				orm.Reserva2 lormReserva2 = orm.Reserva2DAO.createReserva2();
				lormReserva2.setHoramedica(ormHoramedica2s[0]);
				lormReserva2.setPaciente(ormPaciente2s[0]);
				lormReserva2.setPersona(ormPaciente2s[0].getPersona());
				
				orm.Reserva2DAO.save(lormReserva2);
				
				t.commit();
			}else{
				return "Problema de horario";
			}
			
		}
		catch (Exception e) {
			t.rollback();
		}
		
		Reserva2[] ormReserva = orm.Reserva2DAO.listReserva2ByQuery("pacienteid = "+idPac+" AND horamedicaid = "+idHora, null);
		
		return ""+ormReserva[0].getId();
	}


}
