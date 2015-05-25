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

public class Paciente2DAO {
	public static Paciente2 loadPaciente2ByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return loadPaciente2ByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paciente2 getPaciente2ByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return getPaciente2ByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paciente2 loadPaciente2ByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return loadPaciente2ByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paciente2 getPaciente2ByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return getPaciente2ByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paciente2 loadPaciente2ByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Paciente2) session.load(model.Paciente2.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paciente2 getPaciente2ByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Paciente2) session.get(model.Paciente2.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paciente2 loadPaciente2ByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Paciente2) session.load(model.Paciente2.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paciente2 getPaciente2ByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Paciente2) session.get(model.Paciente2.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPaciente2(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return queryPaciente2(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPaciente2(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return queryPaciente2(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paciente2[] listPaciente2ByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return listPaciente2ByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paciente2[] listPaciente2ByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return listPaciente2ByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPaciente2(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Paciente2 as Paciente2");
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
	
	public static List queryPaciente2(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Paciente2 as Paciente2");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Paciente2", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paciente2[] listPaciente2ByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPaciente2(session, condition, orderBy);
			return (Paciente2[]) list.toArray(new Paciente2[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paciente2[] listPaciente2ByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPaciente2(session, condition, orderBy, lockMode);
			return (Paciente2[]) list.toArray(new Paciente2[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paciente2 loadPaciente2ByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return loadPaciente2ByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paciente2 loadPaciente2ByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return loadPaciente2ByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paciente2 loadPaciente2ByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Paciente2[] paciente2s = listPaciente2ByQuery(session, condition, orderBy);
		if (paciente2s != null && paciente2s.length > 0)
			return paciente2s[0];
		else
			return null;
	}
	
	public static Paciente2 loadPaciente2ByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Paciente2[] paciente2s = listPaciente2ByQuery(session, condition, orderBy, lockMode);
		if (paciente2s != null && paciente2s.length > 0)
			return paciente2s[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePaciente2ByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return iteratePaciente2ByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePaciente2ByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return iteratePaciente2ByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePaciente2ByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Paciente2 as Paciente2");
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
	
	public static java.util.Iterator iteratePaciente2ByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Paciente2 as Paciente2");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Paciente2", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paciente2 createPaciente2() {
		return new model.Paciente2();
	}
	
	public static boolean save(model.Paciente2 paciente2) throws PersistentException {
		try {
			model.PDSTallerPersistentManager.instance().saveObject(paciente2);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(model.Paciente2 paciente2) throws PersistentException {
		try {
			model.PDSTallerPersistentManager.instance().deleteObject(paciente2);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(model.Paciente2 paciente2)throws PersistentException {
		try {
			if(paciente2.getPersona() != null) {
				paciente2.getPersona().setPaciente2(null);
			}
			
			model.Paciente_hora[] lPaciente_horas = paciente2.paciente_hora.toArray();
			for(int i = 0; i < lPaciente_horas.length; i++) {
				lPaciente_horas[i].setPaciente(null);
			}
			model.Reserva2[] lReserva2s = paciente2.reserva2.toArray();
			for(int i = 0; i < lReserva2s.length; i++) {
				lReserva2s[i].setPaciente(null);
			}
			return delete(paciente2);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(model.Paciente2 paciente2, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(paciente2.getPersona() != null) {
				paciente2.getPersona().setPaciente2(null);
			}
			
			model.Paciente_hora[] lPaciente_horas = paciente2.paciente_hora.toArray();
			for(int i = 0; i < lPaciente_horas.length; i++) {
				lPaciente_horas[i].setPaciente(null);
			}
			model.Reserva2[] lReserva2s = paciente2.reserva2.toArray();
			for(int i = 0; i < lReserva2s.length; i++) {
				lReserva2s[i].setPaciente(null);
			}
			try {
				session.delete(paciente2);
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
	
	public static boolean refresh(model.Paciente2 paciente2) throws PersistentException {
		try {
			model.PDSTallerPersistentManager.instance().getSession().refresh(paciente2);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(model.Paciente2 paciente2) throws PersistentException {
		try {
			model.PDSTallerPersistentManager.instance().getSession().evict(paciente2);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paciente2 loadPaciente2ByCriteria(Paciente2Criteria paciente2Criteria) {
		Paciente2[] paciente2s = listPaciente2ByCriteria(paciente2Criteria);
		if(paciente2s == null || paciente2s.length == 0) {
			return null;
		}
		return paciente2s[0];
	}
	
	public static Paciente2[] listPaciente2ByCriteria(Paciente2Criteria paciente2Criteria) {
		return paciente2Criteria.listPaciente2();
	}
}
