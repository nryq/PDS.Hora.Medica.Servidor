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

public class Box2DAO {
	public static Box2 loadBox2ByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.PDSTallerPersistentManager.instance().getSession();
			return loadBox2ByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Box2 getBox2ByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.PDSTallerPersistentManager.instance().getSession();
			return getBox2ByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Box2 loadBox2ByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.PDSTallerPersistentManager.instance().getSession();
			return loadBox2ByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Box2 getBox2ByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.PDSTallerPersistentManager.instance().getSession();
			return getBox2ByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Box2 loadBox2ByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Box2) session.load(orm.Box2.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Box2 getBox2ByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Box2) session.get(orm.Box2.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Box2 loadBox2ByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Box2) session.load(orm.Box2.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Box2 getBox2ByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Box2) session.get(orm.Box2.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryBox2(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.PDSTallerPersistentManager.instance().getSession();
			return queryBox2(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryBox2(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.PDSTallerPersistentManager.instance().getSession();
			return queryBox2(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Box2[] listBox2ByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.PDSTallerPersistentManager.instance().getSession();
			return listBox2ByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Box2[] listBox2ByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.PDSTallerPersistentManager.instance().getSession();
			return listBox2ByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryBox2(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Box2 as Box2");
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
	
	public static List queryBox2(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Box2 as Box2");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Box2", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Box2[] listBox2ByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryBox2(session, condition, orderBy);
			return (Box2[]) list.toArray(new Box2[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Box2[] listBox2ByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryBox2(session, condition, orderBy, lockMode);
			return (Box2[]) list.toArray(new Box2[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Box2 loadBox2ByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.PDSTallerPersistentManager.instance().getSession();
			return loadBox2ByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Box2 loadBox2ByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.PDSTallerPersistentManager.instance().getSession();
			return loadBox2ByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Box2 loadBox2ByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Box2[] box2s = listBox2ByQuery(session, condition, orderBy);
		if (box2s != null && box2s.length > 0)
			return box2s[0];
		else
			return null;
	}
	
	public static Box2 loadBox2ByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Box2[] box2s = listBox2ByQuery(session, condition, orderBy, lockMode);
		if (box2s != null && box2s.length > 0)
			return box2s[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateBox2ByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.PDSTallerPersistentManager.instance().getSession();
			return iterateBox2ByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateBox2ByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.PDSTallerPersistentManager.instance().getSession();
			return iterateBox2ByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateBox2ByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Box2 as Box2");
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
	
	public static java.util.Iterator iterateBox2ByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Box2 as Box2");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Box2", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Box2 createBox2() {
		return new orm.Box2();
	}
	
	public static boolean save(orm.Box2 box2) throws PersistentException {
		try {
			orm.PDSTallerPersistentManager.instance().saveObject(box2);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Box2 box2) throws PersistentException {
		try {
			orm.PDSTallerPersistentManager.instance().deleteObject(box2);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Box2 box2)throws PersistentException {
		try {
			orm.Horamedica2[] lHoramedica2s = box2.horamedica2.toArray();
			for(int i = 0; i < lHoramedica2s.length; i++) {
				lHoramedica2s[i].setBox(null);
			}
			return delete(box2);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Box2 box2, org.orm.PersistentSession session)throws PersistentException {
		try {
			orm.Horamedica2[] lHoramedica2s = box2.horamedica2.toArray();
			for(int i = 0; i < lHoramedica2s.length; i++) {
				lHoramedica2s[i].setBox(null);
			}
			try {
				session.delete(box2);
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
	
	public static boolean refresh(orm.Box2 box2) throws PersistentException {
		try {
			orm.PDSTallerPersistentManager.instance().getSession().refresh(box2);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Box2 box2) throws PersistentException {
		try {
			orm.PDSTallerPersistentManager.instance().getSession().evict(box2);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Box2 loadBox2ByCriteria(Box2Criteria box2Criteria) {
		Box2[] box2s = listBox2ByCriteria(box2Criteria);
		if(box2s == null || box2s.length == 0) {
			return null;
		}
		return box2s[0];
	}
	
	public static Box2[] listBox2ByCriteria(Box2Criteria box2Criteria) {
		return box2Criteria.listBox2();
	}
}
