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

public class Horamedica2DAO {
	public static Horamedica2 loadHoramedica2ByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return loadHoramedica2ByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Horamedica2 getHoramedica2ByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return getHoramedica2ByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Horamedica2 loadHoramedica2ByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return loadHoramedica2ByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Horamedica2 getHoramedica2ByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return getHoramedica2ByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Horamedica2 loadHoramedica2ByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Horamedica2) session.load(model.Horamedica2.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Horamedica2 getHoramedica2ByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Horamedica2) session.get(model.Horamedica2.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Horamedica2 loadHoramedica2ByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Horamedica2) session.load(model.Horamedica2.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Horamedica2 getHoramedica2ByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Horamedica2) session.get(model.Horamedica2.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryHoramedica2(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return queryHoramedica2(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryHoramedica2(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return queryHoramedica2(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Horamedica2[] listHoramedica2ByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return listHoramedica2ByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Horamedica2[] listHoramedica2ByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return listHoramedica2ByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryHoramedica2(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Horamedica2 as Horamedica2");
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
	
	public static List queryHoramedica2(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Horamedica2 as Horamedica2");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Horamedica2", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Horamedica2[] listHoramedica2ByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryHoramedica2(session, condition, orderBy);
			return (Horamedica2[]) list.toArray(new Horamedica2[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Horamedica2[] listHoramedica2ByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryHoramedica2(session, condition, orderBy, lockMode);
			return (Horamedica2[]) list.toArray(new Horamedica2[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Horamedica2 loadHoramedica2ByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return loadHoramedica2ByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Horamedica2 loadHoramedica2ByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return loadHoramedica2ByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Horamedica2 loadHoramedica2ByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Horamedica2[] horamedica2s = listHoramedica2ByQuery(session, condition, orderBy);
		if (horamedica2s != null && horamedica2s.length > 0)
			return horamedica2s[0];
		else
			return null;
	}
	
	public static Horamedica2 loadHoramedica2ByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Horamedica2[] horamedica2s = listHoramedica2ByQuery(session, condition, orderBy, lockMode);
		if (horamedica2s != null && horamedica2s.length > 0)
			return horamedica2s[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateHoramedica2ByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return iterateHoramedica2ByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateHoramedica2ByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.PDSTallerPersistentManager.instance().getSession();
			return iterateHoramedica2ByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateHoramedica2ByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Horamedica2 as Horamedica2");
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
	
	public static java.util.Iterator iterateHoramedica2ByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Horamedica2 as Horamedica2");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Horamedica2", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Horamedica2 createHoramedica2() {
		return new model.Horamedica2();
	}
	
	public static boolean save(model.Horamedica2 horamedica2) throws PersistentException {
		try {
			model.PDSTallerPersistentManager.instance().saveObject(horamedica2);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(model.Horamedica2 horamedica2) throws PersistentException {
		try {
			model.PDSTallerPersistentManager.instance().deleteObject(horamedica2);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(model.Horamedica2 horamedica2)throws PersistentException {
		try {
			if(horamedica2.getBox() != null) {
				horamedica2.getBox().horamedica2.remove(horamedica2);
			}
			
			if(horamedica2.getMedico() != null) {
				horamedica2.getMedico().horamedica2.remove(horamedica2);
			}
			
			model.Paciente_hora[] lPaciente_horas = horamedica2.paciente_hora.toArray();
			for(int i = 0; i < lPaciente_horas.length; i++) {
				lPaciente_horas[i].setHoramedica(null);
			}
			model.Reserva2[] lReserva2s = horamedica2.reserva2.toArray();
			for(int i = 0; i < lReserva2s.length; i++) {
				lReserva2s[i].setHoramedica(null);
			}
			return delete(horamedica2);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(model.Horamedica2 horamedica2, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(horamedica2.getBox() != null) {
				horamedica2.getBox().horamedica2.remove(horamedica2);
			}
			
			if(horamedica2.getMedico() != null) {
				horamedica2.getMedico().horamedica2.remove(horamedica2);
			}
			
			model.Paciente_hora[] lPaciente_horas = horamedica2.paciente_hora.toArray();
			for(int i = 0; i < lPaciente_horas.length; i++) {
				lPaciente_horas[i].setHoramedica(null);
			}
			model.Reserva2[] lReserva2s = horamedica2.reserva2.toArray();
			for(int i = 0; i < lReserva2s.length; i++) {
				lReserva2s[i].setHoramedica(null);
			}
			try {
				session.delete(horamedica2);
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
	
	public static boolean refresh(model.Horamedica2 horamedica2) throws PersistentException {
		try {
			model.PDSTallerPersistentManager.instance().getSession().refresh(horamedica2);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(model.Horamedica2 horamedica2) throws PersistentException {
		try {
			model.PDSTallerPersistentManager.instance().getSession().evict(horamedica2);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Horamedica2 loadHoramedica2ByCriteria(Horamedica2Criteria horamedica2Criteria) {
		Horamedica2[] horamedica2s = listHoramedica2ByCriteria(horamedica2Criteria);
		if(horamedica2s == null || horamedica2s.length == 0) {
			return null;
		}
		return horamedica2s[0];
	}
	
	public static Horamedica2[] listHoramedica2ByCriteria(Horamedica2Criteria horamedica2Criteria) {
		return horamedica2Criteria.listHoramedica2();
	}
}
