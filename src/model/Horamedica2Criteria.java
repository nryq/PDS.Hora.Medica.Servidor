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

public class Horamedica2Criteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression esAPS;
	public final DateExpression fecha;
	public final IntegerExpression boxId;
	public final AssociationExpression box;
	public final IntegerExpression medicoId;
	public final AssociationExpression medico;
	public final CollectionExpression paciente_hora;
	public final CollectionExpression reserva2;
	
	public Horamedica2Criteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		esAPS = new IntegerExpression("esAPS", this);
		fecha = new DateExpression("fecha", this);
		boxId = new IntegerExpression("box.id", this);
		box = new AssociationExpression("box", this);
		medicoId = new IntegerExpression("medico.id", this);
		medico = new AssociationExpression("medico", this);
		paciente_hora = new CollectionExpression("ORM_Paciente_hora", this);
		reserva2 = new CollectionExpression("ORM_Reserva2", this);
	}
	
	public Horamedica2Criteria(PersistentSession session) {
		this(session.createCriteria(Horamedica2.class));
	}
	
	public Horamedica2Criteria() throws PersistentException {
		this(model.PDSTallerPersistentManager.instance().getSession());
	}
	
	public Box2Criteria createBoxCriteria() {
		return new Box2Criteria(createCriteria("box"));
	}
	
	public Medico2Criteria createMedicoCriteria() {
		return new Medico2Criteria(createCriteria("medico"));
	}
	
	public Paciente_horaCriteria createPaciente_horaCriteria() {
		return new Paciente_horaCriteria(createCriteria("ORM_Paciente_hora"));
	}
	
	public Reserva2Criteria createReserva2Criteria() {
		return new Reserva2Criteria(createCriteria("ORM_Reserva2"));
	}
	
	public Horamedica2 uniqueHoramedica2() {
		return (Horamedica2) super.uniqueResult();
	}
	
	public Horamedica2[] listHoramedica2() {
		java.util.List list = super.list();
		return (Horamedica2[]) list.toArray(new Horamedica2[list.size()]);
	}
}

