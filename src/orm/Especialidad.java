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

public class Especialidad {
	public Especialidad() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_ESPECIALIDAD_MEDICO2) {
			return ORM_medico2;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int id;
	
	private String especialidad;
	
	private java.util.Set ORM_medico2 = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setEspecialidad(String value) {
		this.especialidad = value;
	}
	
	public String getEspecialidad() {
		return especialidad;
	}
	
	private void setORM_Medico2(java.util.Set value) {
		this.ORM_medico2 = value;
	}
	
	private java.util.Set getORM_Medico2() {
		return ORM_medico2;
	}
	
	public final orm.Medico2SetCollection medico2 = new orm.Medico2SetCollection(this, _ormAdapter, orm.ORMConstants.KEY_ESPECIALIDAD_MEDICO2, orm.ORMConstants.KEY_MEDICO2_ESPECIALIDAD, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
