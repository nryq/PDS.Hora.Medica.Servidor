package principal;

import java.util.ArrayList;

import org.orm.PersistentException;

import webService.*;
import ejemploCrear.CrearPaciente;

public class Main {

	public static void main(String[] args) throws PersistentException {
		String out = "";
		PacienteService cp = new PacienteService();
		MedicoService md = new MedicoService();
		DirectorService ds = new DirectorService();
		json.Json j = new json.Json();
		Login l = new Login();
		String fecha1 = "2015-05-15", fecha2 = "2015-05-19";
		// System.out.println("antes de crear");
		// cp.crearPaciente(1);
		// System.out.println("despues de crear");

		// System.out.println("asd:\n\n"+md.getEspecialidades());
		// System.out.println(md.getMedicobyEspecialidad(1).get(0));

		// System.out.println("hola: " + bs.getBox().get(0));
//		 String js = j.encodingJsonPersona("Medico", 1, "179783452",
//		 "ENRIQUE",
//		 "Gil", 23, "32151654", "asd 123", "Temuco", "Temuco", "asd", "asd",
//		 "g@mail.com", "1");
//		String[][] box1 = { { "id", "nombre" }, { "" + 1, "primer" } };
//		String[][] box2 = { { "id", "nombre" }, { "" + 2, "segundo" } };
//		String[][] box3 = { { "id", "nombre" }, { "" + 3, "tercero" } };
//
//		ArrayList<String[][]> bos = new ArrayList<String[][]>();
//		bos.add(box1);
//		bos.add(box2);
//		bos.add(box3);
//		out = j.arrayJson(bos, "Boxes");
		//
//		out = md.buscarSuDisponbilidadHora(1, fecha1, fecha2);

		// out = ""+ds.calcularOcupacion(12,
		// ds.obtenerCantidadDias("2015-05-15", "2015-05-18"));

		// out = ""+ds.ObtenerPorcentajeOcupacionBox(1, "2015-05-17",
		// "2015-05-18");

//		 out = ""+ds.obtenerMedicosMasSolicitado(fecha1, fecha2);
		
//		out = cp.reservarHoraAps(1, 1);
//		 System.out.println(js);
//		 out = j.decodingJson(js);
		
//		out = md.buscarMedicoByNombre("Enrique");
		 
		out = l.login("nrq", "1234");
		
		 System.out.println(out);

	}

}
