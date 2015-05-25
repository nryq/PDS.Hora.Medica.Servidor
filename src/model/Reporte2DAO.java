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

public class Reporte2DAO {
	public static Reporte2 loadReporte2ByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return loadReporte2ByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reporte2 getReporte2ByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return getReporte2ByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reporte2 loadReporte2ByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return loadReporte2ByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reporte2 getReporte2ByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return getReporte2ByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reporte2 loadReporte2ByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Reporte2) session.load(model.Reporte2.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reporte2 getReporte2ByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Reporte2) session.get(model.Reporte2.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reporte2 loadReporte2ByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Reporte2) session.load(model.Reporte2.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reporte2 getReporte2ByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Reporte2) session.get(model.Reporte2.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryReporte2(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return queryReporte2(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryReporte2(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return queryReporte2(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reporte2[] listReporte2ByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return listReporte2ByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reporte2[] listReporte2ByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return listReporte2ByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryReporte2(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Reporte2 as Reporte2");
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
	
	public static List queryReporte2(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Reporte2 as Reporte2");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Reporte2", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reporte2[] listReporte2ByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryReporte2(session, condition, orderBy);
			return (Reporte2[]) list.toArray(new Reporte2[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reporte2[] listReporte2ByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryReporte2(session, condition, orderBy, lockMode);
			return (Reporte2[]) list.toArray(new Reporte2[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reporte2 loadReporte2ByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return loadReporte2ByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reporte2 loadReporte2ByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return loadReporte2ByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reporte2 loadReporte2ByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Reporte2[] reporte2s = listReporte2ByQuery(session, condition, orderBy);
		if (reporte2s != null && reporte2s.length > 0)
			return reporte2s[0];
		else
			return null;
	}
	
	public static Reporte2 loadReporte2ByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Reporte2[] reporte2s = listReporte2ByQuery(session, condition, orderBy, lockMode);
		if (reporte2s != null && reporte2s.length > 0)
			return reporte2s[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateReporte2ByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return iterateReporte2ByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateReporte2ByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return iterateReporte2ByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateReporte2ByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Reporte2 as Reporte2");
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
	
	public static java.util.Iterator iterateReporte2ByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Reporte2 as Reporte2");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Reporte2", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reporte2 createReporte2() {
		return new model.Reporte2();
	}
	
	public static boolean save(model.Reporte2 reporte2) throws PersistentException {
		try {
			model.PDSTallerPersistentManager.instance().saveObject(reporte2);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(model.Reporte2 reporte2) throws PersistentException {
		try {
			model.PDSTallerPersistentManager.instance().deleteObject(reporte2);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(model.Reporte2 reporte2)throws PersistentException {
		try {
			if(reporte2.getDirector() != null) {
				reporte2.getDirector().setReporte2(null);
			}
			
			return delete(reporte2);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(model.Reporte2 reporte2, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(reporte2.getDirector() != null) {
				reporte2.getDirector().setReporte2(null);
			}
			
			try {
				session.delete(reporte2);
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
	
	public static boolean refresh(model.Reporte2 reporte2) throws PersistentException {
		try {
			model.PDSTallerPersistentManager.instance().getSession().refresh(reporte2);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(model.Reporte2 reporte2) throws PersistentException {
		try {
			model.PDSTallerPersistentManager.instance().getSession().evict(reporte2);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reporte2 loadReporte2ByCriteria(Reporte2Criteria reporte2Criteria) {
		Reporte2[] reporte2s = listReporte2ByCriteria(reporte2Criteria);
		if(reporte2s == null || reporte2s.length == 0) {
			return null;
		}
		return reporte2s[0];
	}
	
	public static Reporte2[] listReporte2ByCriteria(Reporte2Criteria reporte2Criteria) {
		return reporte2Criteria.listReporte2();
	}
}
