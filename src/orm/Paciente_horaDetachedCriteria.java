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

public class Paciente_horaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression pacienteId;
	public final AssociationExpression paciente;
	public final IntegerExpression horamedicaId;
	public final AssociationExpression horamedica;
	
	public Paciente_horaDetachedCriteria() {
		super(orm.Paciente_hora.class, orm.Paciente_horaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		pacienteId = new IntegerExpression("paciente.id", this.getDetachedCriteria());
		paciente = new AssociationExpression("paciente", this.getDetachedCriteria());
		horamedicaId = new IntegerExpression("horamedica.id", this.getDetachedCriteria());
		horamedica = new AssociationExpression("horamedica", this.getDetachedCriteria());
	}
	
	public Paciente_horaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.Paciente_horaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		pacienteId = new IntegerExpression("paciente.id", this.getDetachedCriteria());
		paciente = new AssociationExpression("paciente", this.getDetachedCriteria());
		horamedicaId = new IntegerExpression("horamedica.id", this.getDetachedCriteria());
		horamedica = new AssociationExpression("horamedica", this.getDetachedCriteria());
	}
	
	public Paciente2DetachedCriteria createPacienteCriteria() {
		return new Paciente2DetachedCriteria(createCriteria("paciente"));
	}
	
	public Horamedica2DetachedCriteria createHoramedicaCriteria() {
		return new Horamedica2DetachedCriteria(createCriteria("horamedica"));
	}
	
	public Paciente_hora uniquePaciente_hora(PersistentSession session) {
		return (Paciente_hora) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Paciente_hora[] listPaciente_hora(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Paciente_hora[]) list.toArray(new Paciente_hora[list.size()]);
	}
}

