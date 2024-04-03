package com.session;

import java.util.List;
import javax.ejb.Local;
import com.entities.vol;

@Local
public interface volLocal {
	
	public void addvol(vol vol);
	public void deletevol(vol vol);
	public void updatevol(vol vol);
	public vol getvol(int id);
	public List <vol> getallvol();

}
