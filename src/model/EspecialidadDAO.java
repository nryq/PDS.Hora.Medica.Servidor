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

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class EspecialidadDAO {
	public static Especialidad loadEspecialidadByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return loadEspecialidadByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Especialidad getEspecialidadByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return getEspecialidadByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Especialidad loadEspecialidadByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return loadEspecialidadByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Especialidad getEspecialidadByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return getEspecialidadByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Especialidad loadEspecialidadByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Especialidad) session.load(model.Especialidad.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Especialidad getEspecialidadByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Especialidad) session.get(model.Especialidad.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Especialidad loadEspecialidadByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Especialidad) session.load(model.Especialidad.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Especialidad getEspecialidadByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Especialidad) session.get(model.Especialidad.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEspecialidad(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return queryEspecialidad(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEspecialidad(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return queryEspecialidad(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Especialidad[] listEspecialidadByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return listEspecialidadByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Especialidad[] listEspecialidadByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return listEspecialidadByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEspecialidad(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Especialidad as Especialidad");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEspecialidad(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Especialidad as Especialidad");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Especialidad", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Especialidad[] listEspecialidadByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryEspecialidad(session, condition, orderBy);
			return (Especialidad[]) list.toArray(new Especialidad[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Especialidad[] listEspecialidadByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryEspecialidad(session, condition, orderBy, lockMode);
			return (Especialidad[]) list.toArray(new Especialidad[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Especialidad loadEspecialidadByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return loadEspecialidadByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Especialidad loadEspecialidadByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return loadEspecialidadByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Especialidad loadEspecialidadByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Especialidad[] especialidads = listEspecialidadByQuery(session, condition, orderBy);
		if (especialidads != null && especialidads.length > 0)
			return especialidads[0];
		else
			return null;
	}
	
	public static Especialidad loadEspecialidadByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Especialidad[] especialidads = listEspecialidadByQuery(session, condition, orderBy, lockMode);
		if (especialidads != null && especialidads.length > 0)
			return especialidads[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEspecialidadByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return iterateEspecialidadByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEspecialidadByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return iterateEspecialidadByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEspecialidadByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Especialidad as Especialidad");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEspecialidadByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Especialidad as Especialidad");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Especialidad", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Especialidad createEspecialidad() {
		return new model.Especialidad();
	}
	
	public static boolean save(model.Especialidad especialidad) throws PersistentException {
		try {
			model.PDSTallerPersistentManager.instance().saveObject(especialidad);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(model.Especialidad especialidad) throws PersistentException {
		try {
			model.PDSTallerPersistentManager.instance().deleteObject(especialidad);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(model.Especialidad especialidad)throws PersistentException {
		try {
			model.Medico2[] lMedico2s = especialidad.medico2.toArray();
			for(int i = 0; i < lMedico2s.length; i++) {
				lMedico2s[i].setEspecialidad(null);
			}
			return delete(especialidad);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(model.Especialidad especialidad, org.orm.PersistentSession session)throws PersistentException {
		try {
			model.Medico2[] lMedico2s = especialidad.medico2.toArray();
			for(int i = 0; i < lMedico2s.length; i++) {
				lMedico2s[i].setEspecialidad(null);
			}
			try {
				session.delete(especialidad);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(model.Especialidad especialidad) throws PersistentException {
		try {
			model.PDSTallerPersistentManager.instance().getSession().refresh(especialidad);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(model.Especialidad especialidad) throws PersistentException {
		try {
			model.PDSTallerPersistentManager.instance().getSession().evict(especialidad);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Especialidad loadEspecialidadByCriteria(EspecialidadCriteria especialidadCriteria) {
		Especialidad[] especialidads = listEspecialidadByCriteria(especialidadCriteria);
		if(especialidads == null || especialidads.length == 0) {
			return null;
		}
		return especialidads[0];
	}
	
	public static Especialidad[] listEspecialidadByCriteria(EspecialidadCriteria especialidadCriteria) {
		return especialidadCriteria.listEspecialidad();
	}
}
