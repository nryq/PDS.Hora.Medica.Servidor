package ejemploCrear;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class CrearPersona {
	
	public void crearPersona() throws PersistentException {
		PersistentTransaction t = orm.PDSTallerPersistentManager.instance().getSession().beginTransaction();
		
		try {
			orm.Persona2 lormPersona2 = orm.Persona2DAO.createPersona2();
			
			lormPersona2.setRut("17978345-2");
			lormPersona2.setNombre("Enrique");
			lormPersona2.setApellido("Gil Miranda");
			lormPersona2.setCiudad("Temuco");
			lormPersona2.setComuna("Temuco");
			lormPersona2.setDireccion("Las Gacelas 123123");
			lormPersona2.setEdad(23);
			lormPersona2.setEmail("e@mail.com");
			lormPersona2.setFono("11111111");
			lormPersona2.setLogin("nrq");
			lormPersona2.setPass("1234");
			lormPersona2.setStatus("1");
			
			orm.Paciente2 lormPaciente = orm.Paciente2DAO.createPaciente2();
			
			lormPaciente.setPersona(lormPersona2);
			
			lormPersona2.setPaciente2(lormPaciente);
			
			orm.Persona2DAO.save(lormPersona2);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
}
