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

public class Reserva2DetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression personaId;
	public final AssociationExpression persona;
	public final IntegerExpression horamedicaId;
	public final AssociationExpression horamedica;
	public final IntegerExpression pacienteId;
	public final AssociationExpression paciente;
	
	public Reserva2DetachedCriteria() {
		super(model.Reserva2.class, model.Reserva2Criteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		personaId = new IntegerExpression("persona.id", this.getDetachedCriteria());
		persona = new AssociationExpression("persona", this.getDetachedCriteria());
		horamedicaId = new IntegerExpression("horamedica.id", this.getDetachedCriteria());
		horamedica = new AssociationExpression("horamedica", this.getDetachedCriteria());
		pacienteId = new IntegerExpression("paciente.id", this.getDetachedCriteria());
		paciente = new AssociationExpression("paciente", this.getDetachedCriteria());
	}
	
	public Reserva2DetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, model.Reserva2Criteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		personaId = new IntegerExpression("persona.id", this.getDetachedCriteria());
		persona = new AssociationExpression("persona", this.getDetachedCriteria());
		horamedicaId = new IntegerExpression("horamedica.id", this.getDetachedCriteria());
		horamedica = new AssociationExpression("horamedica", this.getDetachedCriteria());
		pacienteId = new IntegerExpression("paciente.id", this.getDetachedCriteria());
		paciente = new AssociationExpression("paciente", this.getDetachedCriteria());
	}
	
	public Persona2DetachedCriteria createPersonaCriteria() {
		return new Persona2DetachedCriteria(createCriteria("persona"));
	}
	
	public Horamedica2DetachedCriteria createHoramedicaCriteria() {
		return new Horamedica2DetachedCriteria(createCriteria("horamedica"));
	}
	
	public Paciente2DetachedCriteria createPacienteCriteria() {
		return new Paciente2DetachedCriteria(createCriteria("paciente"));
	}
	
	public Reserva2 uniqueReserva2(PersistentSession session) {
		return (Reserva2) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Reserva2[] listReserva2(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Reserva2[]) list.toArray(new Reserva2[list.size()]);
	}
}

