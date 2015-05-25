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

public class Horamedica2DetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression esAPS;
	public final DateExpression fecha;
	public final IntegerExpression boxId;
	public final AssociationExpression box;
	public final IntegerExpression medicoId;
	public final AssociationExpression medico;
	public final CollectionExpression paciente_hora;
	public final CollectionExpression reserva2;
	
	public Horamedica2DetachedCriteria() {
		super(model.Horamedica2.class, model.Horamedica2Criteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		esAPS = new IntegerExpression("esAPS", this.getDetachedCriteria());
		fecha = new DateExpression("fecha", this.getDetachedCriteria());
		boxId = new IntegerExpression("box.id", this.getDetachedCriteria());
		box = new AssociationExpression("box", this.getDetachedCriteria());
		medicoId = new IntegerExpression("medico.id", this.getDetachedCriteria());
		medico = new AssociationExpression("medico", this.getDetachedCriteria());
		paciente_hora = new CollectionExpression("ORM_Paciente_hora", this.getDetachedCriteria());
		reserva2 = new CollectionExpression("ORM_Reserva2", this.getDetachedCriteria());
	}
	
	public Horamedica2DetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, model.Horamedica2Criteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		esAPS = new IntegerExpression("esAPS", this.getDetachedCriteria());
		fecha = new DateExpression("fecha", this.getDetachedCriteria());
		boxId = new IntegerExpression("box.id", this.getDetachedCriteria());
		box = new AssociationExpression("box", this.getDetachedCriteria());
		medicoId = new IntegerExpression("medico.id", this.getDetachedCriteria());
		medico = new AssociationExpression("medico", this.getDetachedCriteria());
		paciente_hora = new CollectionExpression("ORM_Paciente_hora", this.getDetachedCriteria());
		reserva2 = new CollectionExpression("ORM_Reserva2", this.getDetachedCriteria());
	}
	
	public Box2DetachedCriteria createBoxCriteria() {
		return new Box2DetachedCriteria(createCriteria("box"));
	}
	
	public Medico2DetachedCriteria createMedicoCriteria() {
		return new Medico2DetachedCriteria(createCriteria("medico"));
	}
	
	public Paciente_horaDetachedCriteria createPaciente_horaCriteria() {
		return new Paciente_horaDetachedCriteria(createCriteria("ORM_Paciente_hora"));
	}
	
	public Reserva2DetachedCriteria createReserva2Criteria() {
		return new Reserva2DetachedCriteria(createCriteria("ORM_Reserva2"));
	}
	
	public Horamedica2 uniqueHoramedica2(PersistentSession session) {
		return (Horamedica2) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Horamedica2[] listHoramedica2(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Horamedica2[]) list.toArray(new Horamedica2[list.size()]);
	}
}

