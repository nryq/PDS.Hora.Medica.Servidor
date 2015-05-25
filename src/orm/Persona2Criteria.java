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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class Persona2Criteria extends AbstractORMCriteria {
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
	
	public Persona2Criteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		rut = new StringExpression("rut", this);
		nombre = new StringExpression("nombre", this);
		apellido = new StringExpression("apellido", this);
		edad = new IntegerExpression("edad", this);
		fono = new StringExpression("fono", this);
		direccion = new StringExpression("direccion", this);
		ciudad = new StringExpression("ciudad", this);
		comuna = new StringExpression("comuna", this);
		login = new StringExpression("login", this);
		pass = new StringExpression("pass", this);
		email = new StringExpression("email", this);
		status = new StringExpression("status", this);
		paciente2Id = new IntegerExpression("paciente2.id", this);
		paciente2 = new AssociationExpression("paciente2", this);
		director2Id = new IntegerExpression("director2.id", this);
		director2 = new AssociationExpression("director2", this);
		medico2Id = new IntegerExpression("medico2.id", this);
		medico2 = new AssociationExpression("medico2", this);
		reserva2 = new CollectionExpression("ORM_Reserva2", this);
	}
	
	public Persona2Criteria(PersistentSession session) {
		this(session.createCriteria(Persona2.class));
	}
	
	public Persona2Criteria() throws PersistentException {
		this(orm.PDSTallerPersistentManager.instance().getSession());
	}
	
	public Paciente2Criteria createPaciente2Criteria() {
		return new Paciente2Criteria(createCriteria("paciente2"));
	}
	
	public Director2Criteria createDirector2Criteria() {
		return new Director2Criteria(createCriteria("director2"));
	}
	
	public Medico2Criteria createMedico2Criteria() {
		return new Medico2Criteria(createCriteria("medico2"));
	}
	
	public Reserva2Criteria createReserva2Criteria() {
		return new Reserva2Criteria(createCriteria("ORM_Reserva2"));
	}
	
	public Persona2 uniquePersona2() {
		return (Persona2) super.uniqueResult();
	}
	
	public Persona2[] listPersona2() {
		java.util.List list = super.list();
		return (Persona2[]) list.toArray(new Persona2[list.size()]);
	}
}

