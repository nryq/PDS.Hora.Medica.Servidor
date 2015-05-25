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

public class Box2DetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression nombre;
	public final CollectionExpression horamedica2;
	
	public Box2DetachedCriteria() {
		super(orm.Box2.class, orm.Box2Criteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		horamedica2 = new CollectionExpression("ORM_Horamedica2", this.getDetachedCriteria());
	}
	
	public Box2DetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.Box2Criteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		horamedica2 = new CollectionExpression("ORM_Horamedica2", this.getDetachedCriteria());
	}
	
	public Horamedica2DetachedCriteria createHoramedica2Criteria() {
		return new Horamedica2DetachedCriteria(createCriteria("ORM_Horamedica2"));
	}
	
	public Box2 uniqueBox2(PersistentSession session) {
		return (Box2) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Box2[] listBox2(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Box2[]) list.toArray(new Box2[list.size()]);
	}
}

