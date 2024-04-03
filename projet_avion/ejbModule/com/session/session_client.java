package com.session;

import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.entities.client;

@Stateless(name="client")
@LocalBean
public class session_client implements clientLocal {

	@PersistenceContext
	EntityManager EM;
    
    public session_client() {
    	super();
    }

	@Override
	public void addclient(client client) {
		EM.merge(client);
		
	}

	@Override
	public void deleteclient(client client) {
		client c = EM.merge(client);
		EM.remove(c);
		
	}

	@Override
	public void updateclient(client client) {
		EM.merge(client);
		
	}

	@Override
	public client getclient(String cin) {
		client c = EM.find(client.class, cin);
		return c;
	}

	@Override
	public List<client> getallclient() {
		Query query = EM.createQuery("select c from client c ");
		return query.getResultList();
	}

}
