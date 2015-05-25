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

public class Director2Criteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression personaId;
	public final AssociationExpression persona;
	public final IntegerExpression reporte2Id;
	public final AssociationExpression reporte2;
	
	public Director2Criteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		personaId = new IntegerExpression("persona.id", this);
		persona = new AssociationExpression("persona", this);
		reporte2Id = new IntegerExpression("reporte2.id", this);
		reporte2 = new AssociationExpression("reporte2", this);
	}
	
	public Director2Criteria(PersistentSession session) {
		this(session.createCriteria(Director2.class));
	}
	
	public Director2Criteria() throws PersistentException {
		this(orm.PDSTallerPersistentManager.instance().getSession());
	}
	
	public Persona2Criteria createPersonaCriteria() {
		return new Persona2Criteria(createCriteria("persona"));
	}
	
	public Reporte2Criteria createReporte2Criteria() {
		return new Reporte2Criteria(createCriteria("reporte2"));
	}
	
	public Director2 uniqueDirector2() {
		return (Director2) super.uniqueResult();
	}
	
	public Director2[] listDirector2() {
		java.util.List list = super.list();
		return (Director2[]) list.toArray(new Director2[list.size()]);
	}
}

