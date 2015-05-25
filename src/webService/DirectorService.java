package webService;

import java.util.ArrayList;

import org.apache.axis2.json.JSONBadgerfishOMBuilder;
import org.hibernate.CacheMode;
import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.FlushMode;
import org.hibernate.HibernateException;
import org.hibernate.LockMode;
import org.hibernate.ScrollMode;
import org.hibernate.ScrollableResults;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.sql.JoinType;
import org.hibernate.transform.ResultTransformer;
import org.orm.PersistentException;

import json.Json;

public class DirectorService {
	final int ROW_COUNT = 100;
	final float hrTrabajoDiario = 8;
	final float hrMedPerHr = 4;
	int length;
	json.Json j = new Json();
	comun.Calculo cal = new comun.Calculo();
	ArrayList<String[][]> arr = new ArrayList<String[][]>();

	public String getBox() throws PersistentException {
		String out = "";
		ArrayList<String[][]> boxes = new ArrayList<String[][]>();
		json.Json j = new json.Json();

		System.out.println("Listing Box2...");
		orm.Box2[] ormBox2s = orm.Box2DAO.listBox2ByQuery(null, null);
		int length = Math.min(ormBox2s.length, ROW_COUNT);

		for (int i = 0; i < length; i++) {

			String[][] o = { { "id", "nombre" },
					{ "" + ormBox2s[i].getId(), ormBox2s[i].getNombre() } };

			boxes.add(o);

		}
		System.out.println(length + " record(s) retrieved.");
		out = j.arrayJson(boxes, "box");

		return out;
	}

	public double ObtenerPorcentajeOcupacionBox(int box, String fecha1,
			String fecha2) throws PersistentException {
		/** FORMATO DE FECHA 2015-05-25 (AÑO-MES-DIA) */
		
		double out = 0;
		String condicion = "boxid = " + box + " AND fecha BETWEEN \'" + fecha1
				+ "\' AND \'" + fecha2 + "\'";
		
//		if(fecha1!=null && fecha1.equals("")!=false && fecha2!=null && fecha2.equals("")!=false && box>0){
//			condicion = "boxid = "+box+" AND fecha BETWEEN \'"+fecha1+"\' AND \'"+fecha2+"\'";
//		}else if (fecha2!=null && fecha2.equals("")!=false && box>0){
//			condicion = "boxid = "+box+" AND fecha > \'"+fecha1+"\'";
//		}else if(fecha1!=null && fecha1.equals("")!=false && box>0){
//			condicion = "boxid = "+box+" AND fecha < \'"+fecha2+"\'";
//		}else if(box>0){
//			condicion = "boxid = "+box;
//		}else{
//			condicion = null;
//		}

		orm.Horamedica2[] ormHoramedica2s = orm.Horamedica2DAO
				.listHoramedica2ByQuery(condicion, null);

		out = cal.calcularOcupacion(ormHoramedica2s.length,
				cal.obtenerCantidadDias(fecha1, fecha2));

		return out;
	}

	public double obtenerPorcentajeOcupacionMedico(int med, String fecha1,
			String fecha2) throws PersistentException {
		/** FORMATO DE FECHA 2015-05-25 (AÑO-MES-DIA) */

		double out = 0;
		String condicion = "medicoid = " + med + " AND fecha BETWEEN \'"
				+ fecha1 + "\' AND \'" + fecha2 + "\'";
		
		if(fecha1!=null && fecha1.equals("")!=false && fecha2!=null && fecha2.equals("")!=false && med>0){
			condicion = "medicoid = "+med+" AND fecha BETWEEN \'"+fecha1+"\' AND \'"+fecha2+"\'";
		}else if (fecha2!=null && fecha2.equals("")!=false && med>0){
			condicion = "medicoid = "+med+" AND fecha > \'"+fecha1+"\'";
		}else if(fecha1!=null && fecha1.equals("")!=false && med>0){
			condicion = "medicoid = "+med+" AND fecha < \'"+fecha2+"\'";
		}else if(med>0){
			condicion = "medicoid = "+med;
		}else{
			condicion = null;
		}

		orm.Horamedica2[] ormHoramedica2s = orm.Horamedica2DAO
				.listHoramedica2ByQuery(condicion, null);

		out = cal.calcularOcupacion(ormHoramedica2s.length,
				cal.obtenerCantidadDias(fecha1, fecha2));

		return out;
	}

	public String obtenerMedicosMasSolicitado(String fecha1, String fecha2)
			throws PersistentException {
		String out = "";
		String[] label = { "id", "Nombre", "Apellido", "Horas" };

		String condicionHrMed = "fecha BETWEEN \'" + fecha1 + "\' AND \'"
				+ fecha2 + "\'";
		orm.Horamedica2[] ormHoramedica2s = orm.Horamedica2DAO
				.listHoramedica2ByQuery(condicionHrMed, null);
		orm.Medico2[] meds = orm.Medico2DAO.listMedico2ByQuery(null, null);

		int[] hrsMedicos = new int[meds.length];

		for (int c = 0; c < meds.length; c++) {
			hrsMedicos[c] = getHorasAtendidas(ormHoramedica2s,
					ormHoramedica2s[c].getId());
		}
		
		int[] aux = burbuja(hrsMedicos.clone());
		orm.Medico2[] medOrd = getMedicosOrdenados(hrsMedicos.clone(), meds);

		for (int c = 0; c < medOrd.length; c++) {
			String[][] o = {
					label,
					{ "" + medOrd[c].getId(),
							"" + medOrd[c].getPersona().getNombre(),
							"" + medOrd[c].getPersona().getApellido(),
							"" + aux[c]
					} };
			arr.add(o);
		}
		out = j.arrayJson(arr, "Resultados");
		return out;
	}

	public String obtenerPacientesFrecuentes(String fecha1, String fecha2)
			throws PersistentException {
		String out = "";
		String[] label = { "id", "Nombre", "Apellido" };

		String condicionHrMed = "fecha BETWEEN \'" + fecha1 + "\' AND \'"
				+ fecha2 + "\'";
		String condicionReserva = "";
		orm.Reserva2[] aux2 = null;
		
		orm.Horamedica2[] ormHora = orm.Horamedica2DAO.listHoramedica2ByQuery(condicionHrMed, null);
		orm.Reserva2[] ormReserva = orm.Reserva2DAO.listReserva2ByQuery(condicionHrMed, null);
		
		for(int c = 0; c<ormHora.length; c++){
			for(int x=0; x<ormReserva.length; x++){
				if(ormReserva[c].getId() == ormHora[x].getId()){
					aux2[c] = ormReserva[c];
					break;
				}
			}
		}
		
		orm.Paciente2[] pacientes = orm.Paciente2DAO.listPaciente2ByQuery(null, null);

		int[] reservaPaciente = new int[pacientes.length];

		for (int c = 0; c < pacientes.length; c++) {
			reservaPaciente[c] = getHorasAtendidas(ormReserva, ormReserva[c].getId());
		}
		
		int[] aux = burbuja(reservaPaciente.clone());
		orm.Paciente2[] pacOrd = getPacientesOrdenados(reservaPaciente.clone(), pacientes);

		// for (int c = 0; c < meds.length; c++) {
		// System.out.println("id: " + medOrd[c].getId() + " medico: "
		// + medOrd[c].getPersona().getNombre() +
		//
		// "\n" + meds.length);
		// }

		for (int c = 0; c < pacOrd.length; c++) {
			String[][] o = {
					label,
					{ "" + pacOrd[c].getId(),
							"" + pacOrd[c].getPersona().getNombre(),
							"" + pacOrd[c].getPersona().getApellido(),
							"" + aux[c]
					}
				};
			arr.add(o);
		}
		out = j.arrayJson(arr, "Resultados");
		return out;
	}

	private int getHorasAtendidas(orm.Horamedica2[] hrM, int id){
		int out = 0;
		for(int c=0;c<hrM.length; c++){
			if(hrM[c].getMedico().getId()==id){
				out++;
			}
		}
		
		return out;
	}
	
	private int getHorasAtendidas(orm.Reserva2[] hrM, int id){
		int out = 0;
		for(int c=0;c<hrM.length; c++){
			if(hrM[c].getPaciente().getId()==id){
				out++;
			}
		}
		
		return out;
	}
	
	private orm.Medico2[] getMedicosOrdenados(int[] hrM, orm.Medico2[] meds){
		orm.Medico2[] out = new orm.Medico2[meds.length];
		int[] aux = hrM.clone();
		aux = burbuja(aux);
		
		for(int i=0;i<aux.length;i++){
			for(int j=0;j<hrM.length;j++){
				if(aux[i] == hrM[j]){
					out[i] = meds[j];
					hrM[j] = -1;
					break;
				}
			}
		}
		
		return out;
	}
	
	private orm.Paciente2[] getPacientesOrdenados(int[] hrM, orm.Paciente2[] pc){
		orm.Paciente2[] out = new orm.Paciente2[pc.length];
		int[] aux = hrM.clone();
		aux = burbuja(aux);
		
		for(int i=0;i<aux.length;i++){
			for(int j=0;j<hrM.length;j++){
				if(aux[i] == hrM[j]){
					out[i] = pc[j];
					hrM[j] = -1;
					break;
				}
			}
		}
		
		return out;
	}

	private int[] burbuja(int[] A) {
		int i, j, aux;
		for (i = 0; i < A.length - 1; i++)
			for (j = 0; j < A.length - i - 1; j++)
				if (A[j + 1] > A[j]) {
					aux = A[j + 1];
					A[j + 1] = A[j];
					A[j] = aux;
				}
		return A;
	}

}
