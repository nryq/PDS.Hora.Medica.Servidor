/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreatePDSTallerData {
	public void createTestData() throws PersistentException {
		// Insert sample data
		PersistentSession session = orm.PDSTallerPersistentManager.instance().getSession();
		PersistentTransaction transaction = session.beginTransaction();
		try {
			session.doWork(new org.hibernate.jdbc.Work() {
				public void execute(java.sql.Connection conn) throws java.sql.SQLException {
					java.sql.Statement statement = conn.createStatement();
					statement.executeUpdate("INSERT INTO Persona(id, rut, nombre, apellido, edad, fono, direccion, ciudad, comuna, login, pass, email, status) VALUES (1, '179783452', 'Enrique', 'Gil', 23, '5555555', 'calle 123', 'Temuco', 'Temuco', 'nrq', '1234', 'e@mail.com', '1')");
					statement.executeUpdate("INSERT INTO Persona(id, rut, nombre, apellido, edad, fono, direccion, ciudad, comuna, login, pass, email, status) VALUES (2, '189763452', 'Godofredo', 'Lozano', 50, '444444', 'asd 123', 'Temuco', 'Temuco', 'man', '1234', 'ma@mail.com', '1')");
					statement.executeUpdate("INSERT INTO Persona(id, rut, nombre, apellido, edad, fono, direccion, ciudad, comuna, login, pass, email, status) VALUES (3, '24603383-8', 'Nera', 'Carrero', 45, '777 121 487', '15660 Cambre', 'Temuco', 'Temuco', 'Burneatim', '1234', 'NeraCarreroJurado@gustr.com', '1')");
					statement.executeUpdate("INSERT INTO Persona(id, rut, nombre, apellido, edad, fono, direccion, ciudad, comuna, login, pass, email, status) VALUES (4, '16374038-9', 'Boris', 'Aguilar', 38, '665 200 764', '39470 Piélagos', 'Temuco', 'Temuco', 'Coughtly', '1234', 'BorisAguilarCotto@gustr.com', '1')");
					statement.executeUpdate("INSERT INTO Persona(id, rut, nombre, apellido, edad, fono, direccion, ciudad, comuna, login, pass, email, status) VALUES (5, '21834870-k', 'Rudolph', 'Sarabia', 41, '775 641 262', '08784 Piera', 'Temuco', 'Temuco', 'Lauch1974', '1234', 'RudolphSarabiaSanabria@gustr.com', '0')");
					statement.executeUpdate("INSERT INTO Persona(id, rut, nombre, apellido, edad, fono, direccion, ciudad, comuna, login, pass, email, status) VALUES (6, '12165926-3', 'Betiana', 'Sisneros', 57, '675 228 053', '02110 La Gineta', 'Temuco', 'Temuco', 'Broleyed', '1234', 'BetianaSisnerosMarroquin@superrito.com', '0')");
					statement.executeUpdate("INSERT INTO Persona(id, rut, nombre, apellido, edad, fono, direccion, ciudad, comuna, login, pass, email, status) VALUES (7, '10116534-5', 'Giulio', 'Arévalo', 52, '730 485 452', '26510 Pradejón', 'Temuco', 'Temuco', 'Hoser1962', '1234', 'GiulioArevaloMenchaca@gustr.com', '0')");
					statement.close();
				}
			});
			transaction.commit();
		}
		catch (Exception e) {
			try {
				transaction.rollback();
			}
			catch (PersistentException e1) {
				e.printStackTrace();
			}
			e.printStackTrace();
		}
		
		PersistentTransaction t = orm.PDSTallerPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Persona2 lormPersona2 = orm.Persona2DAO.createPersona2();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : reserva2, medico2, director2, paciente2, apellido, nombre, rut
			orm.Persona2DAO.save(lormPersona2);
			orm.Paciente2 lormPaciente2 = orm.Paciente2DAO.createPaciente2();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : reserva2, paciente_hora, persona
			orm.Paciente2DAO.save(lormPaciente2);
			orm.Horamedica2 lormHoramedica2 = orm.Horamedica2DAO.createHoramedica2();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : reserva2, paciente_hora, medico, box
			orm.Horamedica2DAO.save(lormHoramedica2);
			orm.Paciente_hora lormPaciente_hora = orm.Paciente_horaDAO.createPaciente_hora();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : horamedica, paciente
			orm.Paciente_horaDAO.save(lormPaciente_hora);
			orm.Director2 lormDirector2 = orm.Director2DAO.createDirector2();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : reporte2, persona
			orm.Director2DAO.save(lormDirector2);
			orm.Medico2 lormMedico2 = orm.Medico2DAO.createMedico2();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : horamedica2, especialidad, persona
			orm.Medico2DAO.save(lormMedico2);
			orm.Box2 lormBox2 = orm.Box2DAO.createBox2();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : horamedica2, nombre
			orm.Box2DAO.save(lormBox2);
			orm.Reporte2 lormReporte2 = orm.Reporte2DAO.createReporte2();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : director
			orm.Reporte2DAO.save(lormReporte2);
			orm.Reserva2 lormReserva2 = orm.Reserva2DAO.createReserva2();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : paciente, horamedica, persona
			orm.Reserva2DAO.save(lormReserva2);
			orm.Especialidad lormEspecialidad = orm.EspecialidadDAO.createEspecialidad();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : medico2, especialidad
			orm.EspecialidadDAO.save(lormEspecialidad);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreatePDSTallerData createPDSTallerData = new CreatePDSTallerData();
			try {
				createPDSTallerData.createTestData();
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
