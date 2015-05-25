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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class Persona2DetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression rut;
	public final StringExpression nombre;
	public final StringExpression apellido;
	public final IntegerExpression edad;
	public final StringExpression fono;
	public final StringExpression direccion;
	public final StringExpression ciudad;
	public final StringExpression comuna;
	public final StringExpression login;
	public final StringExpression pass;
	public final StringExpression email;
	public final StringExpression status;
	public final IntegerExpression paciente2Id;
	public final AssociationExpression paciente2;
	public final IntegerExpression director2Id;
	public final AssociationExpression director2;
	public final IntegerExpression medico2Id;
	public final AssociationExpression medico2;
	public final CollectionExpression reserva2;
	
	public Persona2DetachedCriteria() {
		super(model.Persona2.class, model.Persona2Criteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		rut = new StringExpression("rut", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellido = new StringExpression("apellido", this.getDetachedCriteria());
		edad = new IntegerExpression("edad", this.getDetachedCriteria());
		fono = new StringExpression("fono", this.getDetachedCriteria());
		direccion = new StringExpression("direccion", this.getDetachedCriteria());
		ciudad = new StringExpression("ciudad", this.getDetachedCriteria());
		comuna = new StringExpression("comuna", this.getDetachedCriteria());
		login = new StringExpression("login", this.getDetachedCriteria());
		pass = new StringExpression("pass", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		status = new StringExpression("status", this.getDetachedCriteria());
		paciente2Id = new IntegerExpression("paciente2.id", this.getDetachedCriteria());
		paciente2 = new AssociationExpression("paciente2", this.getDetachedCriteria());
		director2Id = new IntegerExpression("director2.id", this.getDetachedCriteria());
		director2 = new AssociationExpression("director2", this.getDetachedCriteria());
		medico2Id = new IntegerExpression("medico2.id", this.getDetachedCriteria());
		medico2 = new AssociationExpression("medico2", this.getDetachedCriteria());
		reserva2 = new CollectionExpression("ORM_Reserva2", this.getDetachedCriteria());
	}
	
	public Persona2DetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, model.Persona2Criteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		rut = new StringExpression("rut", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellido = new StringExpression("apellido", this.getDetachedCriteria());
		edad = new IntegerExpression("edad", this.getDetachedCriteria());
		fono = new StringExpression("fono", this.getDetachedCriteria());
		direccion = new StringExpression("direccion", this.getDetachedCriteria());
		ciudad = new StringExpression("ciudad", this.getDetachedCriteria());
		comuna = new StringExpression("comuna", this.getDetachedCriteria());
		login = new StringExpression("login", this.getDetachedCriteria());
		pass = new StringExpression("pass", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		status = new StringExpression("status", this.getDetachedCriteria());
		paciente2Id = new IntegerExpression("paciente2.id", this.getDetachedCriteria());
		paciente2 = new AssociationExpression("paciente2", this.getDetachedCriteria());
		director2Id = new IntegerExpression("director2.id", this.getDetachedCriteria());
		director2 = new AssociationExpression("director2", this.getDetachedCriteria());
		medico2Id = new IntegerExpression("medico2.id", this.getDetachedCriteria());
		medico2 = new AssociationExpression("medico2", this.getDetachedCriteria());
		reserva2 = new CollectionExpression("ORM_Reserva2", this.getDetachedCriteria());
	}
	
	public Paciente2DetachedCriteria createPaciente2Criteria() {
		return new Paciente2DetachedCriteria(createCriteria("paciente2"));
	}
	
	public Director2DetachedCriteria createDirector2Criteria() {
		return new Director2DetachedCriteria(createCriteria("director2"));
	}
	
	public Medico2DetachedCriteria createMedico2Criteria() {
		return new Medico2DetachedCriteria(createCriteria("medico2"));
	}
	
	public Reserva2DetachedCriteria createReserva2Criteria() {
		return new Reserva2DetachedCriteria(createCriteria("ORM_Reserva2"));
	}
	
	public Persona2 uniquePersona2(PersistentSession session) {
		return (Persona2) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Persona2[] listPersona2(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Persona2[]) list.toArray(new Persona2[list.size()]);
	}
}

