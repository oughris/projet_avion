package com.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="reservation")
public class reservation  {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private Date date_reserv;
	private String nom;
	private String prenom;
	private String email;
	private String tel;
	
	@ManyToOne
	@JoinColumn(name="vol_reserv")
	private vol vol;
	
	@ManyToOne
	@JoinColumn(name="compte_reserv")
	private compte compte;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate_reserv() {
		return date_reserv;
	}
	public void setDate_reserv(Date date_reserv) {
		this.date_reserv = date_reserv;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public reservation(int id, Date date_reserv, String nom, String prenom, String email, String tel) {
		super();
		this.id = id;
		this.date_reserv = date_reserv;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.tel = tel;
	}
	
	public reservation() {
		super();
	}
	
	
	
	
   
}
