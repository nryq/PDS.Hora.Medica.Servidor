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

public class Box2 {
	public Box2() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == model.ORMConstants.KEY_BOX2_HORAMEDICA2) {
			return ORM_horamedica2;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int id;
	
	private String nombre;
	
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
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	private void setORM_Horamedica2(java.util.Set value) {
		this.ORM_horamedica2 = value;
	}
	
	private java.util.Set getORM_Horamedica2() {
		return ORM_horamedica2;
	}
	
	public final model.Horamedica2SetCollection horamedica2 = new model.Horamedica2SetCollection(this, _ormAdapter, model.ORMConstants.KEY_BOX2_HORAMEDICA2, model.ORMConstants.KEY_HORAMEDICA2_BOX, model.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
