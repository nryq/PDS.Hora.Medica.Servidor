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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class Paciente2Criteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression personaId;
	public final AssociationExpression persona;
	public final CollectionExpression paciente_hora;
	public final CollectionExpression reserva2;
	
	public Paciente2Criteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		personaId = new IntegerExpression("persona.id", this);
		persona = new AssociationExpression("persona", this);
		paciente_hora = new CollectionExpression("ORM_Paciente_hora", this);
		reserva2 = new CollectionExpression("ORM_Reserva2", this);
	}
	
	public Paciente2Criteria(PersistentSession session) {
		this(session.createCriteria(Paciente2.class));
	}
	
	public Paciente2Criteria() throws PersistentException {
		this(model.PDSTallerPersistentManager.instance().getSession());
	}
	
	public Persona2Criteria createPersonaCriteria() {
		return new Persona2Criteria(createCriteria("persona"));
	}
	
	public Paciente_horaCriteria createPaciente_horaCriteria() {
		return new Paciente_horaCriteria(createCriteria("ORM_Paciente_hora"));
	}
	
	public Reserva2Criteria createReserva2Criteria() {
		return new Reserva2Criteria(createCriteria("ORM_Reserva2"));
	}
	
	public Paciente2 uniquePaciente2() {
		return (Paciente2) super.uniqueResult();
	}
	
	public Paciente2[] listPaciente2() {
		java.util.List list = super.list();
		return (Paciente2[]) list.toArray(new Paciente2[list.size()]);
	}
}

