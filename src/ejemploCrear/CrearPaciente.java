package ejemploCrear;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import orm.Persona2;

public class CrearPaciente {
	
	public void crearPaciente(int id) throws PersistentException{
		
		PersistentTransaction t = orm.PDSTallerPersistentManager.instance().getSession().beginTransaction();
		
		try {
		
		orm.Paciente2 lormPaciente2 = orm.Paciente2DAO.createPaciente2();
		
		orm.Persona2 per = orm.Persona2DAO.getPersona2ByORMID(id);
		
		lormPaciente2.setPersona(per);
		
		orm.Paciente2DAO.save(lormPaciente2);
		
		t.commit();
		
		}catch (Exception e) {
			t.rollback();
		}
	}

}
