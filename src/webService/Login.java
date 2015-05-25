/**
 * 
 */
package webService;

import org.orm.PersistentException;

/**
 * @author Enrique
 *
 */
public class Login {
	private static final int ROW_COUNT = 100;
	
	public String login(String login, String pass) throws PersistentException{
		String out = "";
		String condicion;
		json.Json j = new json.Json();
		condicion = "login = '"+login+"' AND pass = '"+pass+"'";
		
		
		model.Persona2[] ormPersona2s = model.Persona2DAO.listPersona2ByQuery(condicion, null);
		
		if(ormPersona2s.length==1){
			model.Persona2 per = ormPersona2s[0];
			
			int permiso = 0;
			
			condicion = "Personaid = "+per.getId();
			
			model.Paciente2[] ormPaciente2s = model.Paciente2DAO.listPaciente2ByQuery(condicion, null);
			model.Medico2[] ormMedico2s = model.Medico2DAO.listMedico2ByQuery(condicion, null);
			model.Director2[] ormDirector2s = model.Director2DAO.listDirector2ByQuery(condicion, null);
			
			if(ormPaciente2s.length>0){
				permiso =0;
				out = per.getId()+","+ormPaciente2s[0].getId() + ","+per.getRut()+","+per.getNombre()+","+per.getApellido()+","+permiso;
			}else if(ormMedico2s.length>0){
				permiso = 1;
				out = per.getId()+","+ormMedico2s[0].getId() + ","+per.getRut()+","+per.getNombre()+","+per.getApellido()+","+permiso;
			}else if(ormDirector2s.length>0){
				permiso =2;
				out = per.getId()+","+ormDirector2s[0].getId() + ","+per.getRut()+","+per.getNombre()+","+per.getApellido()+","+permiso;
			}
		}else{
			return "error";
		}
		
		
		
		return out;
	}
	
}
