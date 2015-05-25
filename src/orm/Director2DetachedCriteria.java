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

public class Director2DetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression personaId;
	public final AssociationExpression persona;
	public final IntegerExpression reporte2Id;
	public final AssociationExpression reporte2;
	
	public Director2DetachedCriteria() {
		super(orm.Director2.class, orm.Director2Criteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		personaId = new IntegerExpression("persona.id", this.getDetachedCriteria());
		persona = new AssociationExpression("persona", this.getDetachedCriteria());
		reporte2Id = new IntegerExpression("reporte2.id", this.getDetachedCriteria());
		reporte2 = new AssociationExpression("reporte2", this.getDetachedCriteria());
	}
	
	public Director2DetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.Director2Criteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		personaId = new IntegerExpression("persona.id", this.getDetachedCriteria());
		persona = new AssociationExpression("persona", this.getDetachedCriteria());
		reporte2Id = new IntegerExpression("reporte2.id", this.getDetachedCriteria());
		reporte2 = new AssociationExpression("reporte2", this.getDetachedCriteria());
	}
	
	public Persona2DetachedCriteria createPersonaCriteria() {
		return new Persona2DetachedCriteria(createCriteria("persona"));
	}
	
	public Reporte2DetachedCriteria createReporte2Criteria() {
		return new Reporte2DetachedCriteria(createCriteria("reporte2"));
	}
	
	public Director2 uniqueDirector2(PersistentSession session) {
		return (Director2) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Director2[] listDirector2(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Director2[]) list.toArray(new Director2[list.size()]);
	}
}

