/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeletePDSTallerData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = model.PDSTallerPersistentManager.instance().getSession().beginTransaction();
		try {
			model.Persona2 lormPersona2 = model.Persona2DAO.loadPersona2ByQuery(null, null);
			// Delete the persistent object
			model.Persona2DAO.delete(lormPersona2);
			model.Paciente2 lormPaciente2 = model.Paciente2DAO.loadPaciente2ByQuery(null, null);
			// Delete the persistent object
			model.Paciente2DAO.delete(lormPaciente2);
			model.Horamedica2 lormHoramedica2 = model.Horamedica2DAO.loadHoramedica2ByQuery(null, null);
			// Delete the persistent object
			model.Horamedica2DAO.delete(lormHoramedica2);
			model.Paciente_hora lormPaciente_hora = model.Paciente_horaDAO.loadPaciente_horaByQuery(null, null);
			// Delete the persistent object
			model.Paciente_horaDAO.delete(lormPaciente_hora);
			model.Director2 lormDirector2 = model.Director2DAO.loadDirector2ByQuery(null, null);
			// Delete the persistent object
			model.Director2DAO.delete(lormDirector2);
			model.Medico2 lormMedico2 = model.Medico2DAO.loadMedico2ByQuery(null, null);
			// Delete the persistent object
			model.Medico2DAO.delete(lormMedico2);
			model.Box2 lormBox2 = model.Box2DAO.loadBox2ByQuery(null, null);
			// Delete the persistent object
			model.Box2DAO.delete(lormBox2);
			model.Reporte2 lormReporte2 = model.Reporte2DAO.loadReporte2ByQuery(null, null);
			// Delete the persistent object
			model.Reporte2DAO.delete(lormReporte2);
			model.Reserva2 lormReserva2 = model.Reserva2DAO.loadReserva2ByQuery(null, null);
			// Delete the persistent object
			model.Reserva2DAO.delete(lormReserva2);
			model.Especialidad lormEspecialidad = model.EspecialidadDAO.loadEspecialidadByQuery(null, null);
			// Delete the persistent object
			model.EspecialidadDAO.delete(lormEspecialidad);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeletePDSTallerData deletePDSTallerData = new DeletePDSTallerData();
			try {
				deletePDSTallerData.deleteTestData();
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
