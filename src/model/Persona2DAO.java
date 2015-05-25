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

public class Persona2DAO {
	public static Persona2 loadPersona2ByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return loadPersona2ByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona2 getPersona2ByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return getPersona2ByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona2 loadPersona2ByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return loadPersona2ByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona2 getPersona2ByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return getPersona2ByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona2 loadPersona2ByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Persona2) session.load(model.Persona2.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona2 getPersona2ByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Persona2) session.get(model.Persona2.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona2 loadPersona2ByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Persona2) session.load(model.Persona2.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona2 getPersona2ByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Persona2) session.get(model.Persona2.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPersona2(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return queryPersona2(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPersona2(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return queryPersona2(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona2[] listPersona2ByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return listPersona2ByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona2[] listPersona2ByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return listPersona2ByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPersona2(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Persona2 as Persona2");
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
	
	public static List queryPersona2(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Persona2 as Persona2");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Persona2", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona2[] listPersona2ByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPersona2(session, condition, orderBy);
			return (Persona2[]) list.toArray(new Persona2[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona2[] listPersona2ByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPersona2(session, condition, orderBy, lockMode);
			return (Persona2[]) list.toArray(new Persona2[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona2 loadPersona2ByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return loadPersona2ByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona2 loadPersona2ByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return loadPersona2ByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona2 loadPersona2ByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Persona2[] persona2s = listPersona2ByQuery(session, condition, orderBy);
		if (persona2s != null && persona2s.length > 0)
			return persona2s[0];
		else
			return null;
	}
	
	public static Persona2 loadPersona2ByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Persona2[] persona2s = listPersona2ByQuery(session, condition, orderBy, lockMode);
		if (persona2s != null && persona2s.length > 0)
			return persona2s[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePersona2ByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return iteratePersona2ByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePersona2ByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return iteratePersona2ByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePersona2ByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Persona2 as Persona2");
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
	
	public static java.util.Iterator iteratePersona2ByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Persona2 as Persona2");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Persona2", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona2 createPersona2() {
		return new model.Persona2();
	}
	
	public static boolean save(model.Persona2 persona2) throws PersistentException {
		try {
			model.PDSTallerPersistentManager.instance().saveObject(persona2);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(model.Persona2 persona2) throws PersistentException {
		try {
			model.PDSTallerPersistentManager.instance().deleteObject(persona2);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(model.Persona2 persona2)throws PersistentException {
		try {
			if(persona2.getPaciente2() != null) {
				persona2.getPaciente2().setPersona(null);
			}
			
			if(persona2.getDirector2() != null) {
				persona2.getDirector2().setPersona(null);
			}
			
			if(persona2.getMedico2() != null) {
				persona2.getMedico2().setPersona(null);
			}
			
			model.Reserva2[] lReserva2s = persona2.reserva2.toArray();
			for(int i = 0; i < lReserva2s.length; i++) {
				lReserva2s[i].setPersona(null);
			}
			return delete(persona2);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(model.Persona2 persona2, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(persona2.getPaciente2() != null) {
				persona2.getPaciente2().setPersona(null);
			}
			
			if(persona2.getDirector2() != null) {
				persona2.getDirector2().setPersona(null);
			}
			
			if(persona2.getMedico2() != null) {
				persona2.getMedico2().setPersona(null);
			}
			
			model.Reserva2[] lReserva2s = persona2.reserva2.toArray();
			for(int i = 0; i < lReserva2s.length; i++) {
				lReserva2s[i].setPersona(null);
			}
			try {
				session.delete(persona2);
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
	
	public static boolean refresh(model.Persona2 persona2) throws PersistentException {
		try {
			model.PDSTallerPersistentManager.instance().getSession().refresh(persona2);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(model.Persona2 persona2) throws PersistentException {
		try {
			model.PDSTallerPersistentManager.instance().getSession().evict(persona2);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona2 loadPersona2ByCriteria(Persona2Criteria persona2Criteria) {
		Persona2[] persona2s = listPersona2ByCriteria(persona2Criteria);
		if(persona2s == null || persona2s.length == 0) {
			return null;
		}
		return persona2s[0];
	}
	
	public static Persona2[] listPersona2ByCriteria(Persona2Criteria persona2Criteria) {
		return persona2Criteria.listPersona2();
	}
}
