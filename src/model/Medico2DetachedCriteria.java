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

public class Medico2DetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression personaId;
	public final AssociationExpression persona;
	public final IntegerExpression especialidadId;
	public final AssociationExpression especialidad;
	public final CollectionExpression horamedica2;
	
	public Medico2DetachedCriteria() {
		super(model.Medico2.class, model.Medico2Criteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		personaId = new IntegerExpression("persona.id", this.getDetachedCriteria());
		persona = new AssociationExpression("persona", this.getDetachedCriteria());
		especialidadId = new IntegerExpression("especialidad.id", this.getDetachedCriteria());
		especialidad = new AssociationExpression("especialidad", this.getDetachedCriteria());
		horamedica2 = new CollectionExpression("ORM_Horamedica2", this.getDetachedCriteria());
	}
	
	public Medico2DetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, model.Medico2Criteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		personaId = new IntegerExpression("persona.id", this.getDetachedCriteria());
		persona = new AssociationExpression("persona", this.getDetachedCriteria());
		especialidadId = new IntegerExpression("especialidad.id", this.getDetachedCriteria());
		especialidad = new AssociationExpression("especialidad", this.getDetachedCriteria());
		horamedica2 = new CollectionExpression("ORM_Horamedica2", this.getDetachedCriteria());
	}
	
	public Persona2DetachedCriteria createPersonaCriteria() {
		return new Persona2DetachedCriteria(createCriteria("persona"));
	}
	
	public EspecialidadDetachedCriteria createEspecialidadCriteria() {
		return new EspecialidadDetachedCriteria(createCriteria("especialidad"));
	}
	
	public Horamedica2DetachedCriteria createHoramedica2Criteria() {
		return new Horamedica2DetachedCriteria(createCriteria("ORM_Horamedica2"));
	}
	
	public Medico2 uniqueMedico2(PersistentSession session) {
		return (Medico2) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Medico2[] listMedico2(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Medico2[]) list.toArray(new Medico2[list.size()]);
	}
}

