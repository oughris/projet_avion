package com.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="compte")
public class compte {

	@Id
	private String login;
	private String password;
	
	@OneToMany(mappedBy="compte")
	private List<reservation> reservations;
	
	@OneToOne(mappedBy="compte1")
    private client client;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public compte(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}
	
	public compte() {
		super();
	}
	
	

   
}
