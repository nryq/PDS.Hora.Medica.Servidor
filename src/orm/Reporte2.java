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

public class Reporte2 {
	public Reporte2() {
	}
	
	private int id;
	
	private String reporte;
	
	private orm.Director2 director;
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setReporte(String value) {
		this.reporte = value;
	}
	
	public String getReporte() {
		return reporte;
	}
	
	public void setDirector(orm.Director2 value) {
		if (this.director != value) {
			orm.Director2 ldirector = this.director;
			this.director = value;
			if (value != null) {
				director.setReporte2(this);
			}
			if (ldirector != null) {
				ldirector.setReporte2(null);
			}
		}
	}
	
	public orm.Director2 getDirector() {
		return director;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
