package com.session;

import java.util.List;
import javax.ejb.Local;
import com.entities.reservation;

@Local
public interface reservLocal {

	public void addreserv(reservation reserv);
	public void deletereserv(reservation reserv);
	public void updatereserv(reservation reserv);
	public reservation getreserv(int id);
	public List <reservation> getallreserv();

}
