/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdatePDSTallerData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = orm.PDSTallerPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Persona2 lormPersona2 = orm.Persona2DAO.loadPersona2ByQuery(null, null);
			// Update the properties of the persistent object
			orm.Persona2DAO.save(lormPersona2);
			orm.Paciente2 lormPaciente2 = orm.Paciente2DAO.loadPaciente2ByQuery(null, null);
			// Update the properties of the persistent object
			orm.Paciente2DAO.save(lormPaciente2);
			orm.Horamedica2 lormHoramedica2 = orm.Horamedica2DAO.loadHoramedica2ByQuery(null, null);
			// Update the properties of the persistent object
			orm.Horamedica2DAO.save(lormHoramedica2);
			orm.Paciente_hora lormPaciente_hora = orm.Paciente_horaDAO.loadPaciente_horaByQuery(null, null);
			// Update the properties of the persistent object
			orm.Paciente_horaDAO.save(lormPaciente_hora);
			orm.Director2 lormDirector2 = orm.Director2DAO.loadDirector2ByQuery(null, null);
			// Update the properties of the persistent object
			orm.Director2DAO.save(lormDirector2);
			orm.Medico2 lormMedico2 = orm.Medico2DAO.loadMedico2ByQuery(null, null);
			// Update the properties of the persistent object
			orm.Medico2DAO.save(lormMedico2);
			orm.Box2 lormBox2 = orm.Box2DAO.loadBox2ByQuery(null, null);
			// Update the properties of the persistent object
			orm.Box2DAO.save(lormBox2);
			orm.Reporte2 lormReporte2 = orm.Reporte2DAO.loadReporte2ByQuery(null, null);
			// Update the properties of the persistent object
			orm.Reporte2DAO.save(lormReporte2);
			orm.Reserva2 lormReserva2 = orm.Reserva2DAO.loadReserva2ByQuery(null, null);
			// Update the properties of the persistent object
			orm.Reserva2DAO.save(lormReserva2);
			orm.Especialidad lormEspecialidad = orm.EspecialidadDAO.loadEspecialidadByQuery(null, null);
			// Update the properties of the persistent object
			orm.EspecialidadDAO.save(lormEspecialidad);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Persona2 by Persona2Criteria");
		orm.Persona2Criteria lormPersona2Criteria = new orm.Persona2Criteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormPersona2Criteria.id.eq();
		System.out.println(lormPersona2Criteria.uniquePersona2());
		
		System.out.println("Retrieving Paciente2 by Paciente2Criteria");
		orm.Paciente2Criteria lormPaciente2Criteria = new orm.Paciente2Criteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormPaciente2Criteria.id.eq();
		System.out.println(lormPaciente2Criteria.uniquePaciente2());
		
		System.out.println("Retrieving Horamedica2 by Horamedica2Criteria");
		orm.Horamedica2Criteria lormHoramedica2Criteria = new orm.Horamedica2Criteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormHoramedica2Criteria.id.eq();
		System.out.println(lormHoramedica2Criteria.uniqueHoramedica2());
		
		System.out.println("Retrieving Paciente_hora by Paciente_horaCriteria");
		orm.Paciente_horaCriteria lormPaciente_horaCriteria = new orm.Paciente_horaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormPaciente_horaCriteria.id.eq();
		System.out.println(lormPaciente_horaCriteria.uniquePaciente_hora());
		
		System.out.println("Retrieving Director2 by Director2Criteria");
		orm.Director2Criteria lormDirector2Criteria = new orm.Director2Criteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormDirector2Criteria.id.eq();
		System.out.println(lormDirector2Criteria.uniqueDirector2());
		
		System.out.println("Retrieving Medico2 by Medico2Criteria");
		orm.Medico2Criteria lormMedico2Criteria = new orm.Medico2Criteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormMedico2Criteria.id.eq();
		System.out.println(lormMedico2Criteria.uniqueMedico2());
		
		System.out.println("Retrieving Box2 by Box2Criteria");
		orm.Box2Criteria lormBox2Criteria = new orm.Box2Criteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormBox2Criteria.id.eq();
		System.out.println(lormBox2Criteria.uniqueBox2());
		
		System.out.println("Retrieving Reporte2 by Reporte2Criteria");
		orm.Reporte2Criteria lormReporte2Criteria = new orm.Reporte2Criteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormReporte2Criteria.id.eq();
		System.out.println(lormReporte2Criteria.uniqueReporte2());
		
		System.out.println("Retrieving Reserva2 by Reserva2Criteria");
		orm.Reserva2Criteria lormReserva2Criteria = new orm.Reserva2Criteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormReserva2Criteria.id.eq();
		System.out.println(lormReserva2Criteria.uniqueReserva2());
		
		System.out.println("Retrieving Especialidad by EspecialidadCriteria");
		orm.EspecialidadCriteria lormEspecialidadCriteria = new orm.EspecialidadCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormEspecialidadCriteria.id.eq();
		System.out.println(lormEspecialidadCriteria.uniqueEspecialidad());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdatePDSTallerData retrieveAndUpdatePDSTallerData = new RetrieveAndUpdatePDSTallerData();
			try {
				retrieveAndUpdatePDSTallerData.retrieveAndUpdateTestData();
				//retrieveAndUpdatePDSTallerData.retrieveByCriteria();
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
