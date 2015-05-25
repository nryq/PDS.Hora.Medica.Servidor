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

public class Reserva2Criteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression personaId;
	public final AssociationExpression persona;
	public final IntegerExpression horamedicaId;
	public final AssociationExpression horamedica;
	public final IntegerExpression pacienteId;
	public final AssociationExpression paciente;
	
	public Reserva2Criteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		personaId = new IntegerExpression("persona.id", this);
		persona = new AssociationExpression("persona", this);
		horamedicaId = new IntegerExpression("horamedica.id", this);
		horamedica = new AssociationExpression("horamedica", this);
		pacienteId = new IntegerExpression("paciente.id", this);
		paciente = new AssociationExpression("paciente", this);
	}
	
	public Reserva2Criteria(PersistentSession session) {
		this(session.createCriteria(Reserva2.class));
	}
	
	public Reserva2Criteria() throws PersistentException {
		this(orm.PDSTallerPersistentManager.instance().getSession());
	}
	
	public Persona2Criteria createPersonaCriteria() {
		return new Persona2Criteria(createCriteria("persona"));
	}
	
	public Horamedica2Criteria createHoramedicaCriteria() {
		return new Horamedica2Criteria(createCriteria("horamedica"));
	}
	
	public Paciente2Criteria createPacienteCriteria() {
		return new Paciente2Criteria(createCriteria("paciente"));
	}
	
	public Reserva2 uniqueReserva2() {
		return (Reserva2) super.uniqueResult();
	}
	
	public Reserva2[] listReserva2() {
		java.util.List list = super.list();
		return (Reserva2[]) list.toArray(new Reserva2[list.size()]);
	}
}

