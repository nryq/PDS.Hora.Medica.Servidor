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

public class Reserva2 {
	public Reserva2() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_RESERVA2_PERSONA) {
			this.persona = (orm.Persona2) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_RESERVA2_HORAMEDICA) {
			this.horamedica = (orm.Horamedica2) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_RESERVA2_PACIENTE) {
			this.paciente = (orm.Paciente2) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id;
	
	private orm.Persona2 persona;
	
	private orm.Horamedica2 horamedica;
	
	private orm.Paciente2 paciente;
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setPersona(orm.Persona2 value) {
		if (persona != null) {
			persona.reserva2.remove(this);
		}
		if (value != null) {
			value.reserva2.add(this);
		}
	}
	
	public orm.Persona2 getPersona() {
		return persona;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Persona(orm.Persona2 value) {
		this.persona = value;
	}
	
	private orm.Persona2 getORM_Persona() {
		return persona;
	}
	
	public void setHoramedica(orm.Horamedica2 value) {
		if (horamedica != null) {
			horamedica.reserva2.remove(this);
		}
		if (value != null) {
			value.reserva2.add(this);
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
	
	public void setPaciente(orm.Paciente2 value) {
		if (paciente != null) {
			paciente.reserva2.remove(this);
		}
		if (value != null) {
			value.reserva2.add(this);
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
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
