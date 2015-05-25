/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package orm;

public class Paciente_hora {
	public Paciente_hora() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_PACIENTE_HORA_PACIENTE) {
			this.paciente = (orm.Paciente2) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_PACIENTE_HORA_HORAMEDICA) {
			this.horamedica = (orm.Horamedica2) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id;
	
	private orm.Paciente2 paciente;
	
	private orm.Horamedica2 horamedica;
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setPaciente(orm.Paciente2 value) {
		if (paciente != null) {
			paciente.paciente_hora.remove(this);
		}
		if (value != null) {
			value.paciente_hora.add(this);
		}
	}
	
	public orm.Paciente2 getPaciente() {
		return paciente;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Paciente(orm.Paciente2 value) {
		this.paciente = value;
	}
	
	private orm.Paciente2 getORM_Paciente() {
		return paciente;
	}
	
	public void setHoramedica(orm.Horamedica2 value) {
		if (horamedica != null) {
			horamedica.paciente_hora.remove(this);
		}
		if (value != null) {
			value.paciente_hora.add(this);
		}
	}
	
	public orm.Horamedica2 getHoramedica() {
		return horamedica;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Horamedica(orm.Horamedica2 value) {
		this.horamedica = value;
	}
	
	private orm.Horamedica2 getORM_Horamedica() {
		return horamedica;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
