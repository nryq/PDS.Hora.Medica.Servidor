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

public class Paciente_horaDAO {
	public static Paciente_hora loadPaciente_horaByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return loadPaciente_horaByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paciente_hora getPaciente_horaByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return getPaciente_horaByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paciente_hora loadPaciente_horaByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return loadPaciente_horaByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paciente_hora getPaciente_horaByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return getPaciente_horaByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paciente_hora loadPaciente_horaByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Paciente_hora) session.load(model.Paciente_hora.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paciente_hora getPaciente_horaByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Paciente_hora) session.get(model.Paciente_hora.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paciente_hora loadPaciente_horaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Paciente_hora) session.load(model.Paciente_hora.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paciente_hora getPaciente_horaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Paciente_hora) session.get(model.Paciente_hora.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPaciente_hora(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return queryPaciente_hora(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPaciente_hora(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return queryPaciente_hora(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paciente_hora[] listPaciente_horaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return listPaciente_horaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paciente_hora[] listPaciente_horaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return listPaciente_horaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPaciente_hora(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Paciente_hora as Paciente_hora");
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
	
	public static List queryPaciente_hora(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Paciente_hora as Paciente_hora");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Paciente_hora", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paciente_hora[] listPaciente_horaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPaciente_hora(session, condition, orderBy);
			return (Paciente_hora[]) list.toArray(new Paciente_hora[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paciente_hora[] listPaciente_horaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPaciente_hora(session, condition, orderBy, lockMode);
			return (Paciente_hora[]) list.toArray(new Paciente_hora[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paciente_hora loadPaciente_horaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return loadPaciente_horaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paciente_hora loadPaciente_horaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return loadPaciente_horaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paciente_hora loadPaciente_horaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Paciente_hora[] paciente_horas = listPaciente_horaByQuery(session, condition, orderBy);
		if (paciente_horas != null && paciente_horas.length > 0)
			return paciente_horas[0];
		else
			return null;
	}
	
	public static Paciente_hora loadPaciente_horaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Paciente_hora[] paciente_horas = listPaciente_horaByQuery(session, condition, orderBy, lockMode);
		if (paciente_horas != null && paciente_horas.length > 0)
			return paciente_horas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePaciente_horaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return iteratePaciente_horaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePaciente_horaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return iteratePaciente_horaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePaciente_horaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Paciente_hora as Paciente_hora");
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
	
	public static java.util.Iterator iteratePaciente_horaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Paciente_hora as Paciente_hora");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Paciente_hora", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paciente_hora createPaciente_hora() {
		return new model.Paciente_hora();
	}
	
	public static boolean save(model.Paciente_hora paciente_hora) throws PersistentException {
		try {
			model.PDSTallerPersistentManager.instance().saveObject(paciente_hora);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(model.Paciente_hora paciente_hora) throws PersistentException {
		try {
			model.PDSTallerPersistentManager.instance().deleteObject(paciente_hora);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(model.Paciente_hora paciente_hora)throws PersistentException {
		try {
			if(paciente_hora.getPaciente() != null) {
				paciente_hora.getPaciente().paciente_hora.remove(paciente_hora);
			}
			
			if(paciente_hora.getHoramedica() != null) {
				paciente_hora.getHoramedica().paciente_hora.remove(paciente_hora);
			}
			
			return delete(paciente_hora);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(model.Paciente_hora paciente_hora, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(paciente_hora.getPaciente() != null) {
				paciente_hora.getPaciente().paciente_hora.remove(paciente_hora);
			}
			
			if(paciente_hora.getHoramedica() != null) {
				paciente_hora.getHoramedica().paciente_hora.remove(paciente_hora);
			}
			
			try {
				session.delete(paciente_hora);
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
	
	public static boolean refresh(model.Paciente_hora paciente_hora) throws PersistentException {
		try {
			model.PDSTallerPersistentManager.instance().getSession().refresh(paciente_hora);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(model.Paciente_hora paciente_hora) throws PersistentException {
		try {
			model.PDSTallerPersistentManager.instance().getSession().evict(paciente_hora);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paciente_hora loadPaciente_horaByCriteria(Paciente_horaCriteria paciente_horaCriteria) {
		Paciente_hora[] paciente_horas = listPaciente_horaByCriteria(paciente_horaCriteria);
		if(paciente_horas == null || paciente_horas.length == 0) {
			return null;
		}
		return paciente_horas[0];
	}
	
	public static Paciente_hora[] listPaciente_horaByCriteria(Paciente_horaCriteria paciente_horaCriteria) {
		return paciente_horaCriteria.listPaciente_hora();
	}
}
