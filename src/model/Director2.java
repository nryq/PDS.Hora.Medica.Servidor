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

public class Director2 {
	public Director2() {
	}
	
	private int id;
	
	private model.Persona2 persona;
	
	private model.Reporte2 reporte2;
	
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
				persona.setDirector2(this);
			}
			if (lpersona != null) {
				lpersona.setDirector2(null);
			}
		}
	}
	
	public model.Persona2 getPersona() {
		return persona;
	}
	
	public void setReporte2(model.Reporte2 value) {
		if (this.reporte2 != value) {
			model.Reporte2 lreporte2 = this.reporte2;
			this.reporte2 = value;
			if (value != null) {
				reporte2.setDirector(this);
			}
			if (lreporte2 != null) {
				lreporte2.setDirector(null);
			}
		}
	}
	
	public model.Reporte2 getReporte2() {
		return reporte2;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
