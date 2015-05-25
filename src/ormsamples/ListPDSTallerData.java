/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListPDSTallerData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Persona2...");
		orm.Persona2[] ormPersona2s = orm.Persona2DAO.listPersona2ByQuery(null, null);
		int length = Math.min(ormPersona2s.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormPersona2s[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Paciente2...");
		orm.Paciente2[] ormPaciente2s = orm.Paciente2DAO.listPaciente2ByQuery(null, null);
		length = Math.min(ormPaciente2s.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormPaciente2s[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Horamedica2...");
		orm.Horamedica2[] ormHoramedica2s = orm.Horamedica2DAO.listHoramedica2ByQuery(null, null);
		length = Math.min(ormHoramedica2s.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormHoramedica2s[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Paciente_hora...");
		orm.Paciente_hora[] ormPaciente_horas = orm.Paciente_horaDAO.listPaciente_horaByQuery(null, null);
		length = Math.min(ormPaciente_horas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormPaciente_horas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Director2...");
		orm.Director2[] ormDirector2s = orm.Director2DAO.listDirector2ByQuery(null, null);
		length = Math.min(ormDirector2s.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormDirector2s[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Medico2...");
		orm.Medico2[] ormMedico2s = orm.Medico2DAO.listMedico2ByQuery(null, null);
		length = Math.min(ormMedico2s.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormMedico2s[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Box2...");
		orm.Box2[] ormBox2s = orm.Box2DAO.listBox2ByQuery(null, null);
		length = Math.min(ormBox2s.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormBox2s[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Reporte2...");
		orm.Reporte2[] ormReporte2s = orm.Reporte2DAO.listReporte2ByQuery(null, null);
		length = Math.min(ormReporte2s.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormReporte2s[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Reserva2...");
		orm.Reserva2[] ormReserva2s = orm.Reserva2DAO.listReserva2ByQuery(null, null);
		length = Math.min(ormReserva2s.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormReserva2s[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Especialidad...");
		orm.Especialidad[] ormEspecialidads = orm.EspecialidadDAO.listEspecialidadByQuery(null, null);
		length = Math.min(ormEspecialidads.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormEspecialidads[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Persona2 by Criteria...");
		orm.Persona2Criteria lormPersona2Criteria = new orm.Persona2Criteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormPersona2Criteria.id.eq();
		lormPersona2Criteria.setMaxResults(ROW_COUNT);
		orm.Persona2[] ormPersona2s = lormPersona2Criteria.listPersona2();
		int length =ormPersona2s== null ? 0 : Math.min(ormPersona2s.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormPersona2s[i]);
		}
		System.out.println(length + " Persona2 record(s) retrieved."); 
		
		System.out.println("Listing Paciente2 by Criteria...");
		orm.Paciente2Criteria lormPaciente2Criteria = new orm.Paciente2Criteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormPaciente2Criteria.id.eq();
		lormPaciente2Criteria.setMaxResults(ROW_COUNT);
		orm.Paciente2[] ormPaciente2s = lormPaciente2Criteria.listPaciente2();
		length =ormPaciente2s== null ? 0 : Math.min(ormPaciente2s.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormPaciente2s[i]);
		}
		System.out.println(length + " Paciente2 record(s) retrieved."); 
		
		System.out.println("Listing Horamedica2 by Criteria...");
		orm.Horamedica2Criteria lormHoramedica2Criteria = new orm.Horamedica2Criteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormHoramedica2Criteria.id.eq();
		lormHoramedica2Criteria.setMaxResults(ROW_COUNT);
		orm.Horamedica2[] ormHoramedica2s = lormHoramedica2Criteria.listHoramedica2();
		length =ormHoramedica2s== null ? 0 : Math.min(ormHoramedica2s.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormHoramedica2s[i]);
		}
		System.out.println(length + " Horamedica2 record(s) retrieved."); 
		
		System.out.println("Listing Paciente_hora by Criteria...");
		orm.Paciente_horaCriteria lormPaciente_horaCriteria = new orm.Paciente_horaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormPaciente_horaCriteria.id.eq();
		lormPaciente_horaCriteria.setMaxResults(ROW_COUNT);
		orm.Paciente_hora[] ormPaciente_horas = lormPaciente_horaCriteria.listPaciente_hora();
		length =ormPaciente_horas== null ? 0 : Math.min(ormPaciente_horas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormPaciente_horas[i]);
		}
		System.out.println(length + " Paciente_hora record(s) retrieved."); 
		
		System.out.println("Listing Director2 by Criteria...");
		orm.Director2Criteria lormDirector2Criteria = new orm.Director2Criteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormDirector2Criteria.id.eq();
		lormDirector2Criteria.setMaxResults(ROW_COUNT);
		orm.Director2[] ormDirector2s = lormDirector2Criteria.listDirector2();
		length =ormDirector2s== null ? 0 : Math.min(ormDirector2s.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormDirector2s[i]);
		}
		System.out.println(length + " Director2 record(s) retrieved."); 
		
		System.out.println("Listing Medico2 by Criteria...");
		orm.Medico2Criteria lormMedico2Criteria = new orm.Medico2Criteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormMedico2Criteria.id.eq();
		lormMedico2Criteria.setMaxResults(ROW_COUNT);
		orm.Medico2[] ormMedico2s = lormMedico2Criteria.listMedico2();
		length =ormMedico2s== null ? 0 : Math.min(ormMedico2s.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormMedico2s[i]);
		}
		System.out.println(length + " Medico2 record(s) retrieved."); 
		
		System.out.println("Listing Box2 by Criteria...");
		orm.Box2Criteria lormBox2Criteria = new orm.Box2Criteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormBox2Criteria.id.eq();
		lormBox2Criteria.setMaxResults(ROW_COUNT);
		orm.Box2[] ormBox2s = lormBox2Criteria.listBox2();
		length =ormBox2s== null ? 0 : Math.min(ormBox2s.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormBox2s[i]);
		}
		System.out.println(length + " Box2 record(s) retrieved."); 
		
		System.out.println("Listing Reporte2 by Criteria...");
		orm.Reporte2Criteria lormReporte2Criteria = new orm.Reporte2Criteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormReporte2Criteria.id.eq();
		lormReporte2Criteria.setMaxResults(ROW_COUNT);
		orm.Reporte2[] ormReporte2s = lormReporte2Criteria.listReporte2();
		length =ormReporte2s== null ? 0 : Math.min(ormReporte2s.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormReporte2s[i]);
		}
		System.out.println(length + " Reporte2 record(s) retrieved."); 
		
		System.out.println("Listing Reserva2 by Criteria...");
		orm.Reserva2Criteria lormReserva2Criteria = new orm.Reserva2Criteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormReserva2Criteria.id.eq();
		lormReserva2Criteria.setMaxResults(ROW_COUNT);
		orm.Reserva2[] ormReserva2s = lormReserva2Criteria.listReserva2();
		length =ormReserva2s== null ? 0 : Math.min(ormReserva2s.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormReserva2s[i]);
		}
		System.out.println(length + " Reserva2 record(s) retrieved."); 
		
		System.out.println("Listing Especialidad by Criteria...");
		orm.EspecialidadCriteria lormEspecialidadCriteria = new orm.EspecialidadCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormEspecialidadCriteria.id.eq();
		lormEspecialidadCriteria.setMaxResults(ROW_COUNT);
		orm.Especialidad[] ormEspecialidads = lormEspecialidadCriteria.listEspecialidad();
		length =ormEspecialidads== null ? 0 : Math.min(ormEspecialidads.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormEspecialidads[i]);
		}
		System.out.println(length + " Especialidad record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListPDSTallerData listPDSTallerData = new ListPDSTallerData();
			try {
				listPDSTallerData.listTestData();
				//listPDSTallerData.listByCriteria();
			}
			finally {
				orm.PDSTallerPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
