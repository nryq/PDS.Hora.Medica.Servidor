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

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class Medico2DAO {
	public static Medico2 loadMedico2ByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.PDSTallerPersistentManager.instance().getSession();
			return loadMedico2ByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Medico2 getMedico2ByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.PDSTallerPersistentManager.instance().getSession();
			return getMedico2ByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Medico2 loadMedico2ByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.PDSTallerPersistentManager.instance().getSession();
			return loadMedico2ByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Medico2 getMedico2ByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.PDSTallerPersistentManager.instance().getSession();
			return getMedico2ByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Medico2 loadMedico2ByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Medico2) session.load(orm.Medico2.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Medico2 getMedico2ByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Medico2) session.get(orm.Medico2.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Medico2 loadMedico2ByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Medico2) session.load(orm.Medico2.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Medico2 getMedico2ByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Medico2) session.get(orm.Medico2.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMedico2(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.PDSTallerPersistentManager.instance().getSession();
			return queryMedico2(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMedico2(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.PDSTallerPersistentManager.instance().getSession();
			return queryMedico2(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Medico2[] listMedico2ByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.PDSTallerPersistentManager.instance().getSession();
			return listMedico2ByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Medico2[] listMedico2ByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.PDSTallerPersistentManager.instance().getSession();
			return listMedico2ByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMedico2(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Medico2 as Medico2");
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
	
	public static List queryMedico2(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Medico2 as Medico2");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Medico2", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Medico2[] listMedico2ByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryMedico2(session, condition, orderBy);
			return (Medico2[]) list.toArray(new Medico2[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Medico2[] listMedico2ByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryMedico2(session, condition, orderBy, lockMode);
			return (Medico2[]) list.toArray(new Medico2[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Medico2 loadMedico2ByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.PDSTallerPersistentManager.instance().getSession();
			return loadMedico2ByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Medico2 loadMedico2ByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.PDSTallerPersistentManager.instance().getSession();
			return loadMedico2ByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Medico2 loadMedico2ByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Medico2[] medico2s = listMedico2ByQuery(session, condition, orderBy);
		if (medico2s != null && medico2s.length > 0)
			return medico2s[0];
		else
			return null;
	}
	
	public static Medico2 loadMedico2ByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Medico2[] medico2s = listMedico2ByQuery(session, condition, orderBy, lockMode);
		if (medico2s != null && medico2s.length > 0)
			return medico2s[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateMedico2ByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.PDSTallerPersistentManager.instance().getSession();
			return iterateMedico2ByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMedico2ByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.PDSTallerPersistentManager.instance().getSession();
			return iterateMedico2ByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMedico2ByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Medico2 as Medico2");
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
	
	public static java.util.Iterator iterateMedico2ByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Medico2 as Medico2");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Medico2", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Medico2 createMedico2() {
		return new orm.Medico2();
	}
	
	public static boolean save(orm.Medico2 medico2) throws PersistentException {
		try {
			orm.PDSTallerPersistentManager.instance().saveObject(medico2);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Medico2 medico2) throws PersistentException {
		try {
			orm.PDSTallerPersistentManager.instance().deleteObject(medico2);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Medico2 medico2)throws PersistentException {
		try {
			if(medico2.getPersona() != null) {
				medico2.getPersona().setMedico2(null);
			}
			
			if(medico2.getEspecialidad() != null) {
				medico2.getEspecialidad().medico2.remove(medico2);
			}
			
			orm.Horamedica2[] lHoramedica2s = medico2.horamedica2.toArray();
			for(int i = 0; i < lHoramedica2s.length; i++) {
				lHoramedica2s[i].setMedico(null);
			}
			return delete(medico2);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Medico2 medico2, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(medico2.getPersona() != null) {
				medico2.getPersona().setMedico2(null);
			}
			
			if(medico2.getEspecialidad() != null) {
				medico2.getEspecialidad().medico2.remove(medico2);
			}
			
			orm.Horamedica2[] lHoramedica2s = medico2.horamedica2.toArray();
			for(int i = 0; i < lHoramedica2s.length; i++) {
				lHoramedica2s[i].setMedico(null);
			}
			try {
				session.delete(medico2);
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
	
	public static boolean refresh(orm.Medico2 medico2) throws PersistentException {
		try {
			orm.PDSTallerPersistentManager.instance().getSession().refresh(medico2);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Medico2 medico2) throws PersistentException {
		try {
			orm.PDSTallerPersistentManager.instance().getSession().evict(medico2);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Medico2 loadMedico2ByCriteria(Medico2Criteria medico2Criteria) {
		Medico2[] medico2s = listMedico2ByCriteria(medico2Criteria);
		if(medico2s == null || medico2s.length == 0) {
			return null;
		}
		return medico2s[0];
	}
	
	public static Medico2[] listMedico2ByCriteria(Medico2Criteria medico2Criteria) {
		return medico2Criteria.listMedico2();
	}
}
