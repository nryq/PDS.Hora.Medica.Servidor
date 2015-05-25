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

public class EspecialidadCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression especialidad;
	public final CollectionExpression medico2;
	
	public EspecialidadCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		especialidad = new StringExpression("especialidad", this);
		medico2 = new CollectionExpression("ORM_Medico2", this);
	}
	
	public EspecialidadCriteria(PersistentSession session) {
		this(session.createCriteria(Especialidad.class));
	}
	
	public EspecialidadCriteria() throws PersistentException {
		this(orm.PDSTallerPersistentManager.instance().getSession());
	}
	
	public Medico2Criteria createMedico2Criteria() {
		return new Medico2Criteria(createCriteria("ORM_Medico2"));
	}
	
	public Especialidad uniqueEspecialidad() {
		return (Especialidad) super.uniqueResult();
	}
	
	public Especialidad[] listEspecialidad() {
		java.util.List list = super.list();
		return (Especialidad[]) list.toArray(new Especialidad[list.size()]);
	}
}

