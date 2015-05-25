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

public class Paciente_horaCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression pacienteId;
	public final AssociationExpression paciente;
	public final IntegerExpression horamedicaId;
	public final AssociationExpression horamedica;
	
	public Paciente_horaCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		pacienteId = new IntegerExpression("paciente.id", this);
		paciente = new AssociationExpression("paciente", this);
		horamedicaId = new IntegerExpression("horamedica.id", this);
		horamedica = new AssociationExpression("horamedica", this);
	}
	
	public Paciente_horaCriteria(PersistentSession session) {
		this(session.createCriteria(Paciente_hora.class));
	}
	
	public Paciente_horaCriteria() throws PersistentException {
		this(orm.PDSTallerPersistentManager.instance().getSession());
	}
	
	public Paciente2Criteria createPacienteCriteria() {
		return new Paciente2Criteria(createCriteria("paciente"));
	}
	
	public Horamedica2Criteria createHoramedicaCriteria() {
		return new Horamedica2Criteria(createCriteria("horamedica"));
	}
	
	public Paciente_hora uniquePaciente_hora() {
		return (Paciente_hora) super.uniqueResult();
	}
	
	public Paciente_hora[] listPaciente_hora() {
		java.util.List list = super.list();
		return (Paciente_hora[]) list.toArray(new Paciente_hora[list.size()]);
	}
}

