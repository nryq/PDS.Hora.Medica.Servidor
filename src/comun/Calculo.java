package comun;

public class Calculo {
	
	final float hrTrabajoDiario = 8;
	final float hrMedPerHr = 4;

	public double calcularOcupacion(int horasOcupado, int cantidadDias){
		double out = 0.0;
		//out = (((horasOcupado/hrMedPerHr)/hrTrabajoDiario*cantidadDias+1) )*100;
		
		out = (horasOcupado*100)/(hrMedPerHr*hrTrabajoDiario);
		out = out/(cantidadDias+1);
		return out;
	}
	
	public int obtenerCantidadDias(String fecha1, String fecha2){
		String[] aux1 = fecha1.split("-");//[1]: año, [2]: mes, [3]: dia
		String[] aux2 = fecha2.split("-");
		int[] dif = new int[3];
		
		for(int c=0; c<aux1.length; c++){
			System.out.println("::"+aux2[c]+" :: "+aux1[c]);
			dif[c] = Integer.parseInt(aux2[c]) - Integer.parseInt(aux1[c]);
			
		}
		
		if((dif[0]*365+dif[1]*31+dif[2])>=0){
			return (dif[0]*365+dif[1]*31+dif[2]);
		}else{
			return -1;
		}
	}
	
}
