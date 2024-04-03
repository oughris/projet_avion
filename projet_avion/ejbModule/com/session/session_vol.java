package com.session;

import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.entities.vol;

@Stateless(name="vol")
@LocalBean
public class session_vol implements volLocal {

	@PersistenceContext
	EntityManager EM;
    
    public session_vol() {
    	super();
    }

	@Override
	public void addvol(vol vol) {
		EM.merge(vol);
		
	}

	@Override
	public void deletevol(vol vol) {
		vol v = EM.merge(vol);
		EM.remove(v);
		
	}

	@Override
	public void updatevol(vol vol) {
		EM.merge(vol);
		
	}

	@Override
	public vol getvol(int id) {
		vol vol = EM.find(vol.class, id);
		return vol;
	}

	@Override
	public List<vol> getallvol() {
		Query query = EM.createQuery("select v from vol v ");
		return query.getResultList();
	}

	

}
