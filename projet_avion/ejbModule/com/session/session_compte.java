package com.session;

import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.entities.compte;

@Stateless(name="compte")
@LocalBean
public class session_compte implements compteLocal {

   
	@PersistenceContext
	EntityManager EM;
    
    public session_compte() {
    	super();
    }

	@Override
	public void addCompte(compte compte) {
		EM.merge(compte);
		
	}

	@Override
	public void deleteCompte(compte compte) {
		compte c = EM.merge(compte);
		EM.remove(c);
		
	}

	@Override
	public void updateCompte(compte compte) {
		EM.merge(compte);
		
	}

	@Override
	public compte getCompte(String user) {
		compte compte = EM.find(compte.class, user);
		return compte;
	}

	@Override
	public List<compte> getallCompte() {
		Query query = EM.createQuery("select c from Compte c ");
		return query.getResultList();
	}
}
