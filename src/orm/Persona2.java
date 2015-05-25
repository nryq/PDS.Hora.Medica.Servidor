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

public class Persona2 {
	public Persona2() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_PERSONA2_RESERVA2) {
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
	
	private String rut;
	
	private String nombre;
	
	private String apellido;
	
	private Integer edad;
	
	private String fono;
	
	private String direccion;
	
	private String ciudad;
	
	private String comuna;
	
	private String login;
	
	private String pass;
	
	private String email;
	
	private String status = "0";
	
	private orm.Paciente2 paciente2;
	
	private orm.Director2 director2;
	
	private orm.Medico2 medico2;
	
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
	
	public void setRut(String value) {
		this.rut = value;
	}
	
	public String getRut() {
		return rut;
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setApellido(String value) {
		this.apellido = value;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setEdad(int value) {
		setEdad(new Integer(value));
	}
	
	public void setEdad(Integer value) {
		this.edad = value;
	}
	
	public Integer getEdad() {
		return edad;
	}
	
	public void setFono(String value) {
		this.fono = value;
	}
	
	public String getFono() {
		return fono;
	}
	
	public void setDireccion(String value) {
		this.direccion = value;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setCiudad(String value) {
		this.ciudad = value;
	}
	
	public String getCiudad() {
		return ciudad;
	}
	
	public void setComuna(String value) {
		this.comuna = value;
	}
	
	public String getComuna() {
		return comuna;
	}
	
	public void setLogin(String value) {
		this.login = value;
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setPass(String value) {
		this.pass = value;
	}
	
	public String getPass() {
		return pass;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setStatus(String value) {
		this.status = value;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setPaciente2(orm.Paciente2 value) {
		if (this.paciente2 != value) {
			orm.Paciente2 lpaciente2 = this.paciente2;
			this.paciente2 = value;
			if (value != null) {
				paciente2.setPersona(this);
			}
			if (lpaciente2 != null) {
				lpaciente2.setPersona(null);
			}
		}
	}
	
	public orm.Paciente2 getPaciente2() {
		return paciente2;
	}
	
	public void setDirector2(orm.Director2 value) {
		if (this.director2 != value) {
			orm.Director2 ldirector2 = this.director2;
			this.director2 = value;
			if (value != null) {
				director2.setPersona(this);
			}
			if (ldirector2 != null) {
				ldirector2.setPersona(null);
			}
		}
	}
	
	public orm.Director2 getDirector2() {
		return director2;
	}
	
	public void setMedico2(orm.Medico2 value) {
		if (this.medico2 != value) {
			orm.Medico2 lmedico2 = this.medico2;
			this.medico2 = value;
			if (value != null) {
				medico2.setPersona(this);
			}
			if (lmedico2 != null) {
				lmedico2.setPersona(null);
			}
		}
	}
	
	public orm.Medico2 getMedico2() {
		return medico2;
	}
	
	private void setORM_Reserva2(java.util.Set value) {
		this.ORM_reserva2 = value;
	}
	
	private java.util.Set getORM_Reserva2() {
		return ORM_reserva2;
	}
	
	public final orm.Reserva2SetCollection reserva2 = new orm.Reserva2SetCollection(this, _ormAdapter, orm.ORMConstants.KEY_PERSONA2_RESERVA2, orm.ORMConstants.KEY_RESERVA2_PERSONA, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
