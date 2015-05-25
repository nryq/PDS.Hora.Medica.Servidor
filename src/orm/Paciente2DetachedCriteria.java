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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class Paciente2DetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression personaId;
	public final AssociationExpression persona;
	public final CollectionExpression paciente_hora;
	public final CollectionExpression reserva2;
	
	public Paciente2DetachedCriteria() {
		super(orm.Paciente2.class, orm.Paciente2Criteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		personaId = new IntegerExpression("persona.id", this.getDetachedCriteria());
		persona = new AssociationExpression("persona", this.getDetachedCriteria());
		paciente_hora = new CollectionExpression("ORM_Paciente_hora", this.getDetachedCriteria());
		reserva2 = new CollectionExpression("ORM_Reserva2", this.getDetachedCriteria());
	}
	
	public Paciente2DetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.Paciente2Criteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		personaId = new IntegerExpression("persona.id", this.getDetachedCriteria());
		persona = new AssociationExpression("persona", this.getDetachedCriteria());
		paciente_hora = new CollectionExpression("ORM_Paciente_hora", this.getDetachedCriteria());
		reserva2 = new CollectionExpression("ORM_Reserva2", this.getDetachedCriteria());
	}
	
	public Persona2DetachedCriteria createPersonaCriteria() {
		return new Persona2DetachedCriteria(createCriteria("persona"));
	}
	
	public Paciente_horaDetachedCriteria createPaciente_horaCriteria() {
		return new Paciente_horaDetachedCriteria(createCriteria("ORM_Paciente_hora"));
	}
	
	public Reserva2DetachedCriteria createReserva2Criteria() {
		return new Reserva2DetachedCriteria(createCriteria("ORM_Reserva2"));
	}
	
	public Paciente2 uniquePaciente2(PersistentSession session) {
		return (Paciente2) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Paciente2[] listPaciente2(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Paciente2[]) list.toArray(new Paciente2[list.size()]);
	}
}

