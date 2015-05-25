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

public class Medico2Criteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression personaId;
	public final AssociationExpression persona;
	public final IntegerExpression especialidadId;
	public final AssociationExpression especialidad;
	public final CollectionExpression horamedica2;
	
	public Medico2Criteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		personaId = new IntegerExpression("persona.id", this);
		persona = new AssociationExpression("persona", this);
		especialidadId = new IntegerExpression("especialidad.id", this);
		especialidad = new AssociationExpression("especialidad", this);
		horamedica2 = new CollectionExpression("ORM_Horamedica2", this);
	}
	
	public Medico2Criteria(PersistentSession session) {
		this(session.createCriteria(Medico2.class));
	}
	
	public Medico2Criteria() throws PersistentException {
		this(orm.PDSTallerPersistentManager.instance().getSession());
	}
	
	public Persona2Criteria createPersonaCriteria() {
		return new Persona2Criteria(createCriteria("persona"));
	}
	
	public EspecialidadCriteria createEspecialidadCriteria() {
		return new EspecialidadCriteria(createCriteria("especialidad"));
	}
	
	public Horamedica2Criteria createHoramedica2Criteria() {
		return new Horamedica2Criteria(createCriteria("ORM_Horamedica2"));
	}
	
	public Medico2 uniqueMedico2() {
		return (Medico2) super.uniqueResult();
	}
	
	public Medico2[] listMedico2() {
		java.util.List list = super.list();
		return (Medico2[]) list.toArray(new Medico2[list.size()]);
	}
}

