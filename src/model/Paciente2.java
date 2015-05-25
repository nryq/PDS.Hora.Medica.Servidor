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
package model;

public class Paciente2 {
	public Paciente2() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == model.ORMConstants.KEY_PACIENTE2_PACIENTE_HORA) {
			return ORM_paciente_hora;
		}
		else if (key == model.ORMConstants.KEY_PACIENTE2_RESERVA2) {
			return ORM_reserva2;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int id;
	
	private model.Persona2 persona;
	
	private java.util.Set ORM_paciente_hora = new java.util.HashSet();
	
	private java.util.Set ORM_reserva2 = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setPersona(model.Persona2 value) {
		if (this.persona != value) {
			model.Persona2 lpersona = this.persona;
			this.persona = value;
			if (value != null) {
				persona.setPaciente2(this);
			}
			if (lpersona != null) {
				lpersona.setPaciente2(null);
			}
		}
	}
	
	public model.Persona2 getPersona() {
		return persona;
	}
	
	private void setORM_Paciente_hora(java.util.Set value) {
		this.ORM_paciente_hora = value;
	}
	
	private java.util.Set getORM_Paciente_hora() {
		return ORM_paciente_hora;
	}
	
	public final model.Paciente_horaSetCollection paciente_hora = new model.Paciente_horaSetCollection(this, _ormAdapter, model.ORMConstants.KEY_PACIENTE2_PACIENTE_HORA, model.ORMConstants.KEY_PACIENTE_HORA_PACIENTE, model.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Reserva2(java.util.Set value) {
		this.ORM_reserva2 = value;
	}
	
	private java.util.Set getORM_Reserva2() {
		return ORM_reserva2;
	}
	
	public final model.Reserva2SetCollection reserva2 = new model.Reserva2SetCollection(this, _ormAdapter, model.ORMConstants.KEY_PACIENTE2_RESERVA2, model.ORMConstants.KEY_RESERVA2_PACIENTE, model.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
