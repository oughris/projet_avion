package com.session;

import java.util.List;
import javax.ejb.Local;
import com.entities.client;

@Local
public interface clientLocal {
	
	public void addclient(client client);
	public void deleteclient(client client);
	public void updateclient(client client);
	public client getclient(String cin);
	public List <client> getallclient();

}
