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

public class Reporte2Criteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression reporte;
	public final IntegerExpression directorId;
	public final AssociationExpression director;
	
	public Reporte2Criteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		reporte = new StringExpression("reporte", this);
		directorId = new IntegerExpression("director.id", this);
		director = new AssociationExpression("director", this);
	}
	
	public Reporte2Criteria(PersistentSession session) {
		this(session.createCriteria(Reporte2.class));
	}
	
	public Reporte2Criteria() throws PersistentException {
		this(model.PDSTallerPersistentManager.instance().getSession());
	}
	
	public Director2Criteria createDirectorCriteria() {
		return new Director2Criteria(createCriteria("director"));
	}
	
	public Reporte2 uniqueReporte2() {
		return (Reporte2) super.uniqueResult();
	}
	
	public Reporte2[] listReporte2() {
		java.util.List list = super.list();
		return (Reporte2[]) list.toArray(new Reporte2[list.size()]);
	}
}

