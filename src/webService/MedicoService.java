/**
 * 
 */
package webService;

import java.util.ArrayList;
import java.util.List;

import json.Json;
import model.Horamedica2;
import model.Medico2;
import model.Reserva2;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

/**
 * @author Enrique
 *
 */
public class MedicoService {
	final int ROW_COUNT = 100;
	int length;
	json.Json j = new Json();
	ArrayList<String[][]> arr = new ArrayList<String[][]>();
	
	public String getMedicos() throws PersistentException{
		String out = "";
		System.out.println("Listing Medico2...");
		model.Medico2[] ormMedico2s = model.Medico2DAO.listMedico2ByQuery(null, null);
		
		String[] label = {"idMedico", "idPersona", "RUT", "Nombre", 
				"Apellido", "Edad", "Fono", "Direccion", "Ciudad", "Comuna",
				"Email", "Status", "Especialidad"};
		
		length = Math.min(ormMedico2s.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			
			String[][] o = {label,{
				""+ormMedico2s[i].getId(),
				""+ormMedico2s[i].getPersona().getId(),
				""+ormMedico2s[i].getPersona().getRut(),
				""+ormMedico2s[i].getPersona().getNombre(),
				""+ormMedico2s[i].getPersona().getApellido(),
				""+ormMedico2s[i].getPersona().getEdad(),
				""+ormMedico2s[i].getPersona().getFono(),
				""+ormMedico2s[i].getPersona().getDireccion(),
				""+ormMedico2s[i].getPersona().getCiudad(),
				""+ormMedico2s[i].getPersona().getComuna(),
				""+ormMedico2s[i].getPersona().getEmail(),
				""+ormMedico2s[i].getPersona().getStatus(),
				""+ormMedico2s[i].getEspecialidad().getEspecialidad()
			}};
			
			arr.add(o);
		}
		System.out.println(length + " record(s) retrieved.");
		
		out = j.arrayJson(arr, "Medicos");
		
		return out;
	}
	
	public String getMedicoById(int id) throws PersistentException{
		String out = "";
		System.out.println("Listing Medico2...");
		String condicion = "id = "+id;
		
		model.Medico2[] ormMedico2s = model.Medico2DAO.listMedico2ByQuery(condicion, null);
		
		String[] label = {"idMedico", "idPersona", "RUT", "Nombre", 
				"Apellido", "Edad", "Fono", "Direccion", "Ciudad", "Comuna",
				"Email", "Status", "Especialidad"};
		
		length = Math.min(ormMedico2s.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			
			String[][] o = {label,{
				""+ormMedico2s[i].getId(),
				""+ormMedico2s[i].getPersona().getId(),
				""+ormMedico2s[i].getPersona().getRut(),
				""+ormMedico2s[i].getPersona().getNombre(),
				""+ormMedico2s[i].getPersona().getApellido(),
				""+ormMedico2s[i].getPersona().getEdad(),
				""+ormMedico2s[i].getPersona().getFono(),
				""+ormMedico2s[i].getPersona().getDireccion(),
				""+ormMedico2s[i].getPersona().getCiudad(),
				""+ormMedico2s[i].getPersona().getComuna(),
				""+ormMedico2s[i].getPersona().getEmail(),
				""+ormMedico2s[i].getPersona().getStatus(),
				""+ormMedico2s[i].getEspecialidad().getEspecialidad()
			}};
			
			arr.add(o);
		}
		System.out.println(length + " record(s) retrieved.");
		
		out = j.arrayJson(arr, "Medicos");
		
		return out;
	}
	
	public String buscarMedicoByNombre(String name) throws PersistentException{
		String out = "";
		System.out.println("Listing Medico2...");
		String condicion = "nombre = '"+name+"'";
		
		model.Persona2[] per = model.Persona2DAO.listPersona2ByQuery(condicion, null);
		condicion = "id = "+per[0].getId();
		model.Medico2[] ormMedico2s = model.Medico2DAO.listMedico2ByQuery(condicion, null);
		
		String[] label = {"idMedico", "idPersona", "RUT", "Nombre", 
				"Apellido", "Edad", "Fono", "Direccion", "Ciudad", "Comuna",
				"Email", "Status", "Especialidad"};
		
		length = Math.min(ormMedico2s.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			
			String[][] o = {label,{
				""+ormMedico2s[i].getId(),
				""+ormMedico2s[i].getPersona().getId(),
				""+ormMedico2s[i].getPersona().getRut(),
				""+ormMedico2s[i].getPersona().getNombre(),
				""+ormMedico2s[i].getPersona().getApellido(),
				""+ormMedico2s[i].getPersona().getEdad(),
				""+ormMedico2s[i].getPersona().getFono(),
				""+ormMedico2s[i].getPersona().getDireccion(),
				""+ormMedico2s[i].getPersona().getCiudad(),
				""+ormMedico2s[i].getPersona().getComuna(),
				""+ormMedico2s[i].getPersona().getEmail(),
				""+ormMedico2s[i].getPersona().getStatus(),
				""+ormMedico2s[i].getEspecialidad().getEspecialidad()
			}};
			
			arr.add(o);
		}
		System.out.println(length + " record(s) retrieved.");
		
		out = j.arrayJson(arr, "Medicos");
		
		return out;
	}
	
	public String getEspecialidades() throws PersistentException{
		String out= "";
		model.Especialidad[] ormEspecialidads = model.EspecialidadDAO.listEspecialidadByQuery(null, null);
		length = Math.min(ormEspecialidads.length, ROW_COUNT);
		
		String[] label = {"id", "especialidad"};
		
		for (int i = 0; i < length; i++) {
			String[][] o = {label,{
				""+ormEspecialidads[i].getId(),
				ormEspecialidads[i].getEspecialidad()
			}};
			
			arr.add(o);
			
		}
		
		out = j.arrayJson(arr, "Especialidades");
		return out;
	}
	
	public String getMedicobyEspecialidad(int esp) throws PersistentException{
		
		String out = "";
		
		System.out.println("Listing Medico2...");
		model.Medico2[] ormMedico2s = model.Medico2DAO.listMedico2ByQuery("especialidad = "+esp, null);
		
		String[] label = {"idMedico", "idPersona", "RUT", "Nombre", 
				"Apellido", "Edad", "Fono", "Direccion", "Ciudad", "Comuna",
				"Email", "Status", "Especialidad"};
		
		length = Math.min(ormMedico2s.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			
			String[][] o = {label,{
				""+ormMedico2s[i].getId(),
				""+ormMedico2s[i].getPersona().getId(),
				""+ormMedico2s[i].getPersona().getRut(),
				""+ormMedico2s[i].getPersona().getNombre(),
				""+ormMedico2s[i].getPersona().getApellido(),
				""+ormMedico2s[i].getPersona().getEdad(),
				""+ormMedico2s[i].getPersona().getFono(),
				""+ormMedico2s[i].getPersona().getDireccion(),
				""+ormMedico2s[i].getPersona().getCiudad(),
				""+ormMedico2s[i].getPersona().getComuna(),
				""+ormMedico2s[i].getPersona().getEmail(),
				""+ormMedico2s[i].getPersona().getStatus(),
				""+ormMedico2s[i].getEspecialidad().getEspecialidad()
			}};
			
			arr.add(o);
		}
		System.out.println(length + " record(s) retrieved.");
		
		out = j.arrayJson(arr, "Medicos");
		
		return out;
	}
	
	public String buscarSuDisponbilidadHora(int med, String crit1, String crit2) throws PersistentException{
		
		String out = "";
		String[] label = {"id", "Fecha", "Hora"};
		String condicion = "medicoid = "+med+" AND fecha BETWEEN \'"+crit1+"\' AND \'"+crit2+"\'";
		
		model.Horamedica2[] ormHoramedica2s = model.Horamedica2DAO.listHoramedica2ByQuery(condicion, null);
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
	
//	ReservarHoraMedicaControl ArrayHoraMedica(id), IdPaciente
	
	public String reservarHoraMedicaControl(int[] idHrs, int idPac) throws PersistentException{
		
		String condicion = "id = "+idPac,
				condicionHr = "id = "+idHrs[0],
				out = ""
						;
		for(int c=1; c<idHrs.length; c++){
			condicionHr+=" AND id = "+idHrs[c];
		}
			
		model.Paciente2[] ormPaciente2s = model.Paciente2DAO.listPaciente2ByQuery(condicion, null);
		model.Horamedica2[] ormHoramedica2s = model.Horamedica2DAO.listHoramedica2ByQuery(condicionHr, null);
		
		PersistentTransaction t = model.PDSTallerPersistentManager.instance().getSession().beginTransaction();
		try {
			
			model.Paciente_hora lormPaciente_Entidad = model.Paciente_horaDAO.createPaciente_hora();
			
			lormPaciente_Entidad.setPaciente(ormPaciente2s[0]);
			lormPaciente_Entidad.setHoramedica(ormHoramedica2s[0]);
			
			model.Paciente_horaDAO.save(lormPaciente_Entidad);
			
			
			model.Reserva2 lormReserva2 = model.Reserva2DAO.createReserva2();
			lormReserva2.setHoramedica(ormHoramedica2s[0]);
			lormReserva2.setPaciente(ormPaciente2s[0]);
			lormReserva2.setPersona(ormPaciente2s[0].getPersona());
			
			model.Reserva2DAO.save(lormReserva2);
			
			t.commit();
			
		}
		catch (Exception e) {
			t.rollback();
		}
		String cond = "";
		for(int c=0; c<idHrs.length; c++){
			cond+=" AND horamedicaid = "+idHrs[c];
		}
		
		Reserva2[] ormReserva = model.Reserva2DAO.listReserva2ByQuery("pacienteid = "+idPac+cond, null);
		
		out = "N�mero(s) de Reserva(s):\n";
		for(int c=0; c<ormReserva.length; c++){
			out += ormReserva[c].getId()+"\n";
		}
		
		return out;
		
	}
	

}
