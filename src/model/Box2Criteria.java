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

public class Box2Criteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression nombre;
	public final CollectionExpression horamedica2;
	
	public Box2Criteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		nombre = new StringExpression("nombre", this);
		horamedica2 = new CollectionExpression("ORM_Horamedica2", this);
	}
	
	public Box2Criteria(PersistentSession session) {
		this(session.createCriteria(Box2.class));
	}
	
	public Box2Criteria() throws PersistentException {
		this(model.PDSTallerPersistentManager.instance().getSession());
	}
	
	public Horamedica2Criteria createHoramedica2Criteria() {
		return new Horamedica2Criteria(createCriteria("ORM_Horamedica2"));
	}
	
	public Box2 uniqueBox2() {
		return (Box2) super.uniqueResult();
	}
	
	public Box2[] listBox2() {
		java.util.List list = super.list();
		return (Box2[]) list.toArray(new Box2[list.size()]);
	}
}

