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

public class Medico2 {
	public Medico2() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_MEDICO2_HORAMEDICA2) {
			return ORM_horamedica2;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_MEDICO2_PERSONA) {
			this.persona = (orm.Persona2) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_MEDICO2_ESPECIALIDAD) {
			this.especialidad = (orm.Especialidad) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id;
	
	private orm.Persona2 persona;
	
	private orm.Especialidad especialidad;
	
	private java.util.Set ORM_horamedica2 = new java.util.HashSet();
	
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
		if (this.persona != value) {
			orm.Persona2 lpersona = this.persona;
			this.persona = value;
			if (value != null) {
				persona.setMedico2(this);
			}
			if (lpersona != null) {
				lpersona.setMedico2(null);
			}
		}
	}
	
	public orm.Persona2 getPersona() {
		return persona;
	}
	
	public void setEspecialidad(orm.Especialidad value) {
		if (especialidad != null) {
			especialidad.medico2.remove(this);
		}
		if (value != null) {
			value.medico2.add(this);
		}
	}
	
	public orm.Especialidad getEspecialidad() {
		return especialidad;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Especialidad(orm.Especialidad value) {
		this.especialidad = value;
	}
	
	private orm.Especialidad getORM_Especialidad() {
		return especialidad;
	}
	
	private void setORM_Horamedica2(java.util.Set value) {
		this.ORM_horamedica2 = value;
	}
	
	private java.util.Set getORM_Horamedica2() {
		return ORM_horamedica2;
	}
	
	public final orm.Horamedica2SetCollection horamedica2 = new orm.Horamedica2SetCollection(this, _ormAdapter, orm.ORMConstants.KEY_MEDICO2_HORAMEDICA2, orm.ORMConstants.KEY_HORAMEDICA2_MEDICO, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
