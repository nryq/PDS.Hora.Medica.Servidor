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

public class Horamedica2 {
	public Horamedica2() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_HORAMEDICA2_PACIENTE_HORA) {
			return ORM_paciente_hora;
		}
		else if (key == orm.ORMConstants.KEY_HORAMEDICA2_RESERVA2) {
			return ORM_reserva2;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_HORAMEDICA2_BOX) {
			this.box = (orm.Box2) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_HORAMEDICA2_MEDICO) {
			this.medico = (orm.Medico2) owner;
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
	
	private Integer esAPS;
	
	private java.util.Date fecha;
	
	private orm.Box2 box;
	
	private orm.Medico2 medico;
	
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
	
	public void setEsAPS(int value) {
		setEsAPS(new Integer(value));
	}
	
	public void setEsAPS(Integer value) {
		this.esAPS = value;
	}
	
	public Integer getEsAPS() {
		return esAPS;
	}
	
	public void setFecha(java.util.Date value) {
		this.fecha = value;
	}
	
	public java.util.Date getFecha() {
		return fecha;
	}
	
	public void setBox(orm.Box2 value) {
		if (box != null) {
			box.horamedica2.remove(this);
		}
		if (value != null) {
			value.horamedica2.add(this);
		}
	}
	
	public orm.Box2 getBox() {
		return box;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Box(orm.Box2 value) {
		this.box = value;
	}
	
	private orm.Box2 getORM_Box() {
		return box;
	}
	
	public void setMedico(orm.Medico2 value) {
		if (medico != null) {
			medico.horamedica2.remove(this);
		}
		if (value != null) {
			value.horamedica2.add(this);
		}
	}
	
	public orm.Medico2 getMedico() {
		return medico;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Medico(orm.Medico2 value) {
		this.medico = value;
	}
	
	private orm.Medico2 getORM_Medico() {
		return medico;
	}
	
	private void setORM_Paciente_hora(java.util.Set value) {
		this.ORM_paciente_hora = value;
	}
	
	private java.util.Set getORM_Paciente_hora() {
		return ORM_paciente_hora;
	}
	
	public final orm.Paciente_horaSetCollection paciente_hora = new orm.Paciente_horaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_HORAMEDICA2_PACIENTE_HORA, orm.ORMConstants.KEY_PACIENTE_HORA_HORAMEDICA, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Reserva2(java.util.Set value) {
		this.ORM_reserva2 = value;
	}
	
	private java.util.Set getORM_Reserva2() {
		return ORM_reserva2;
	}
	
	public final orm.Reserva2SetCollection reserva2 = new orm.Reserva2SetCollection(this, _ormAdapter, orm.ORMConstants.KEY_HORAMEDICA2_RESERVA2, orm.ORMConstants.KEY_RESERVA2_HORAMEDICA, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
