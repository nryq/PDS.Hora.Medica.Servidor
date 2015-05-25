/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeletePDSTallerData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = orm.PDSTallerPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Persona2 lormPersona2 = orm.Persona2DAO.loadPersona2ByQuery(null, null);
			// Delete the persistent object
			orm.Persona2DAO.delete(lormPersona2);
			orm.Paciente2 lormPaciente2 = orm.Paciente2DAO.loadPaciente2ByQuery(null, null);
			// Delete the persistent object
			orm.Paciente2DAO.delete(lormPaciente2);
			orm.Horamedica2 lormHoramedica2 = orm.Horamedica2DAO.loadHoramedica2ByQuery(null, null);
			// Delete the persistent object
			orm.Horamedica2DAO.delete(lormHoramedica2);
			orm.Paciente_hora lormPaciente_hora = orm.Paciente_horaDAO.loadPaciente_horaByQuery(null, null);
			// Delete the persistent object
			orm.Paciente_horaDAO.delete(lormPaciente_hora);
			orm.Director2 lormDirector2 = orm.Director2DAO.loadDirector2ByQuery(null, null);
			// Delete the persistent object
			orm.Director2DAO.delete(lormDirector2);
			orm.Medico2 lormMedico2 = orm.Medico2DAO.loadMedico2ByQuery(null, null);
			// Delete the persistent object
			orm.Medico2DAO.delete(lormMedico2);
			orm.Box2 lormBox2 = orm.Box2DAO.loadBox2ByQuery(null, null);
			// Delete the persistent object
			orm.Box2DAO.delete(lormBox2);
			orm.Reporte2 lormReporte2 = orm.Reporte2DAO.loadReporte2ByQuery(null, null);
			// Delete the persistent object
			orm.Reporte2DAO.delete(lormReporte2);
			orm.Reserva2 lormReserva2 = orm.Reserva2DAO.loadReserva2ByQuery(null, null);
			// Delete the persistent object
			orm.Reserva2DAO.delete(lormReserva2);
			orm.Especialidad lormEspecialidad = orm.EspecialidadDAO.loadEspecialidadByQuery(null, null);
			// Delete the persistent object
			orm.EspecialidadDAO.delete(lormEspecialidad);
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
				orm.PDSTallerPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
