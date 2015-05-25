package json;

import java.util.ArrayList;
import java.util.Properties;

import orm.Persona2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class Json {

	public String decodingJson(String json) {
		String out = "";
		System.out.println(json);

		Gson gson = new Gson();
		Persona2 per = gson.fromJson(json, Persona2.class);
		
		out = per.getNombre();

		return out;

	}

	public String encodingJsonPersona(String objeto, int id, String rut,
			String nombre, String apellido, int edad, String fono,
			String direccion, String ciudad, String comuna, String mail,
			String status) {
		return encodingJsonPersona(objeto, id, rut, nombre, apellido, edad,
				fono, direccion, ciudad, comuna, "", "", mail, status);
	}

	public String encodingJsonPersona(String objeto, int id, String rut, String nombre,
			String apellido, int edad, String fono, String direccion,
			String ciudad, String comuna, String login, String pass,
			String mail, String status) {

		final Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		Persona2 per = new Persona2();
		per.setRut(rut);
//		per.setNombre(nombre);
//		per.setApellido(apellido);
//		per.setEdad(edad);
//		per.setCiudad(ciudad);
//		per.setFono(fono);
//		per.setDireccion(direccion);
//		per.setCiudad(ciudad);
//		per.setComuna(comuna);
//		per.setLogin(login);
//		per.setPass(pass);
//		
		String[][] aux ={
				{"id", "rut", "nombre", "apellido", "edad", "fono", 
			"direccion", "ciudad", "comuna", "login", "pass", 
			"mail", "status"},
				{""+id, rut, nombre, apellido, 
				""+edad, fono, direccion, ciudad, 
				comuna, login, pass, mail, status
				}
			};
		
		String out = "{";
		
		//out+=ponerC(objeto)+":{";
		
		for(int c=0; c<aux[0].length; c++){
			
			out+=ponerC(aux[0][c])+": "+ponerC(aux[1][c]);
			
			if(c<aux[0].length-1){
				out+=",";
			}else{
				out+="";
			}
			
			
		}
		
		out+="}";
		
		
		return out;
	}

	public String encodingJson(String[][] aux, String objeto) {
		String out = "";
		out = "";

		out += /*ponerC(objeto) + */"{";

		for (int c = 0; c < aux[0].length; c++) {

			out += ponerC(aux[0][c]) + ": " + ponerC(aux[1][c]);

			if (c < aux[0].length - 1) {
				out += ",";
			} else {
				out += "";
			}

		}

		out += "}";
		return out;
	}

	public String arrayJson(ArrayList<String[][]> obj, String titulo) {
		String out = "";

		out = "{\n";
		out += ponerC(titulo) + ": [";

		for (int c = 0; c < obj.size(); c++) {
			out += encodingJson(obj.get(c), titulo);

			if (c < obj.size() - 1) {
				out += ",";
			} else {
				out += "";
			}
		}
		out += "]\n}";
		return out;
	}

	public String ponerC(String x) {
		return "\"" + x + "\"";
	}
}


//String var = "";
//var = "{"+ponerC("id")+":"+id+", "
//		+ ponerC("rut")+":"+rut+", "
//		+ ponerC("nombre")+":"+nombre+", "
//		+ ponerC("apellido")+":"+apellido+", "
//		+ ponerC("edad")+":"+edad+", "
//		+ ponerC("fono")+":"+fono+", "
//		+ ponerC("dirección")+":"+direccion+", "
//		+ ponerC("ciudad")+":"+ciudad+", "
//		+ ponerC("comuna")+":"+comuna+", "
//		+ ponerC("login")+":"+login+", "
//		+ ponerC("pass")+":"+pass+", "
//		+ ponerC("mail")+":"+mail+", "
//		+ ponerC("status")+":"+status+", "
//		+"}";