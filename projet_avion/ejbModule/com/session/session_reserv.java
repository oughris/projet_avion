package com.session;

import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.entities.reservation;

@Stateless(name="reservation")
@LocalBean
public class session_reserv implements reservLocal {
	
	@PersistenceContext
	EntityManager EM;
    
    public session_reserv() {
    	super();
    }

	@Override
	public void addreserv(reservation reserv) {
		EM.merge(reserv);
		
	}

	@Override
	public void deletereserv(reservation reserv) {
		reservation r = EM.merge(reserv);
		EM.remove(r);
		
	}

	@Override
	public void updatereserv(reservation reserv) {
		EM.merge(reserv);
		
	}

	@Override
	public reservation getreserv(int id) {
		reservation reserv = EM.find(reservation.class, id);
		return reserv;
	}

	@Override
	public List<reservation> getallreserv() {
		Query query = EM.createQuery("select r from reservation r ");
		return query.getResultList();
	}


}
