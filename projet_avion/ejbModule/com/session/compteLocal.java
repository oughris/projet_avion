package com.session;

import java.util.List;
import javax.ejb.Local;
import com.entities.compte;

@Local
public interface compteLocal {
	
	public void addCompte(compte compte);
	public void deleteCompte(compte compte);
	public void updateCompte(compte compte);
	public compte getCompte(String user);
	public List <compte> getallCompte();

}
