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

public class Reporte2DetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression reporte;
	public final IntegerExpression directorId;
	public final AssociationExpression director;
	
	public Reporte2DetachedCriteria() {
		super(model.Reporte2.class, model.Reporte2Criteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		reporte = new StringExpression("reporte", this.getDetachedCriteria());
		directorId = new IntegerExpression("director.id", this.getDetachedCriteria());
		director = new AssociationExpression("director", this.getDetachedCriteria());
	}
	
	public Reporte2DetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, model.Reporte2Criteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		reporte = new StringExpression("reporte", this.getDetachedCriteria());
		directorId = new IntegerExpression("director.id", this.getDetachedCriteria());
		director = new AssociationExpression("director", this.getDetachedCriteria());
	}
	
	public Director2DetachedCriteria createDirectorCriteria() {
		return new Director2DetachedCriteria(createCriteria("director"));
	}
	
	public Reporte2 uniqueReporte2(PersistentSession session) {
		return (Reporte2) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Reporte2[] listReporte2(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Reporte2[]) list.toArray(new Reporte2[list.size()]);
	}
}

