/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdatePDSTallerData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = model.PDSTallerPersistentManager.instance().getSession().beginTransaction();
		try {
			model.Persona2 lormPersona2 = model.Persona2DAO.loadPersona2ByQuery(null, null);
			// Update the properties of the persistent object
			model.Persona2DAO.save(lormPersona2);
			model.Paciente2 lormPaciente2 = model.Paciente2DAO.loadPaciente2ByQuery(null, null);
			// Update the properties of the persistent object
			model.Paciente2DAO.save(lormPaciente2);
			model.Horamedica2 lormHoramedica2 = model.Horamedica2DAO.loadHoramedica2ByQuery(null, null);
			// Update the properties of the persistent object
			model.Horamedica2DAO.save(lormHoramedica2);
			model.Paciente_hora lormPaciente_hora = model.Paciente_horaDAO.loadPaciente_horaByQuery(null, null);
			// Update the properties of the persistent object
			model.Paciente_horaDAO.save(lormPaciente_hora);
			model.Director2 lormDirector2 = model.Director2DAO.loadDirector2ByQuery(null, null);
			// Update the properties of the persistent object
			model.Director2DAO.save(lormDirector2);
			model.Medico2 lormMedico2 = model.Medico2DAO.loadMedico2ByQuery(null, null);
			// Update the properties of the persistent object
			model.Medico2DAO.save(lormMedico2);
			model.Box2 lormBox2 = model.Box2DAO.loadBox2ByQuery(null, null);
			// Update the properties of the persistent object
			model.Box2DAO.save(lormBox2);
			model.Reporte2 lormReporte2 = model.Reporte2DAO.loadReporte2ByQuery(null, null);
			// Update the properties of the persistent object
			model.Reporte2DAO.save(lormReporte2);
			model.Reserva2 lormReserva2 = model.Reserva2DAO.loadReserva2ByQuery(null, null);
			// Update the properties of the persistent object
			model.Reserva2DAO.save(lormReserva2);
			model.Especialidad lormEspecialidad = model.EspecialidadDAO.loadEspecialidadByQuery(null, null);
			// Update the properties of the persistent object
			model.EspecialidadDAO.save(lormEspecialidad);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Persona2 by Persona2Criteria");
		model.Persona2Criteria lormPersona2Criteria = new model.Persona2Criteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormPersona2Criteria.id.eq();
		System.out.println(lormPersona2Criteria.uniquePersona2());
		
		System.out.println("Retrieving Paciente2 by Paciente2Criteria");
		model.Paciente2Criteria lormPaciente2Criteria = new model.Paciente2Criteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormPaciente2Criteria.id.eq();
		System.out.println(lormPaciente2Criteria.uniquePaciente2());
		
		System.out.println("Retrieving Horamedica2 by Horamedica2Criteria");
		model.Horamedica2Criteria lormHoramedica2Criteria = new model.Horamedica2Criteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormHoramedica2Criteria.id.eq();
		System.out.println(lormHoramedica2Criteria.uniqueHoramedica2());
		
		System.out.println("Retrieving Paciente_hora by Paciente_horaCriteria");
		model.Paciente_horaCriteria lormPaciente_horaCriteria = new model.Paciente_horaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormPaciente_horaCriteria.id.eq();
		System.out.println(lormPaciente_horaCriteria.uniquePaciente_hora());
		
		System.out.println("Retrieving Director2 by Director2Criteria");
		model.Director2Criteria lormDirector2Criteria = new model.Director2Criteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormDirector2Criteria.id.eq();
		System.out.println(lormDirector2Criteria.uniqueDirector2());
		
		System.out.println("Retrieving Medico2 by Medico2Criteria");
		model.Medico2Criteria lormMedico2Criteria = new model.Medico2Criteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormMedico2Criteria.id.eq();
		System.out.println(lormMedico2Criteria.uniqueMedico2());
		
		System.out.println("Retrieving Box2 by Box2Criteria");
		model.Box2Criteria lormBox2Criteria = new model.Box2Criteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormBox2Criteria.id.eq();
		System.out.println(lormBox2Criteria.uniqueBox2());
		
		System.out.println("Retrieving Reporte2 by Reporte2Criteria");
		model.Reporte2Criteria lormReporte2Criteria = new model.Reporte2Criteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormReporte2Criteria.id.eq();
		System.out.println(lormReporte2Criteria.uniqueReporte2());
		
		System.out.println("Retrieving Reserva2 by Reserva2Criteria");
		model.Reserva2Criteria lormReserva2Criteria = new model.Reserva2Criteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormReserva2Criteria.id.eq();
		System.out.println(lormReserva2Criteria.uniqueReserva2());
		
		System.out.println("Retrieving Especialidad by EspecialidadCriteria");
		model.EspecialidadCriteria lormEspecialidadCriteria = new model.EspecialidadCriteria();
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
				model.PDSTallerPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
