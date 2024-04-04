package com.entities;

import java.sql.Date;
import java.time.LocalTime;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="vol")
public class vol  {
	
	@Id
	private int id;
	private String departure;
	private String destination;
	private int id_avion;
	private Date date_d;
	private Date date_a;
	private LocalTime heure_d;
	private LocalTime heure_a;
	private int nbr_places;
	private String escale;
	private int bagage;
	

    @ManyToMany
	@JoinTable(name="reserv_vol",
	joinColumns=@JoinColumn(name="id_vol"),
	inverseJoinColumns=@JoinColumn(name="id_reserv")
	)
	private List<reservation> reservations;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getId_avion() {
		return id_avion;
	}
	public void setId_avion(int id_avion) {
		this.id_avion = id_avion;
	}
	public Date getDate_d() {
		return date_d;
	}
	public void setDate_d(Date date_d) {
		this.date_d = date_d;
	}
	public Date getDate_a() {
		return date_a;
	}
	public void setDate_a(Date date_a) {
		this.date_a = date_a;
	}
	public LocalTime getHeure_d() {
		return heure_d;
	}
	public void setHeure_d(LocalTime heure_d) {
		this.heure_d = heure_d;
	}
	public LocalTime getHeure_a() {
		return heure_a;
	}
	public void setHeure_a(LocalTime heure_a) {
		this.heure_a = heure_a;
	}
	public int getNbr_places() {
		return nbr_places;
	}
	public void setNbr_places(int nbr_places) {
		this.nbr_places = nbr_places;
	}
	public String getEscale() {
		return escale;
	}
	public void setEscale(String escale) {
		this.escale = escale;
	}
	public int getBagage() {
		return bagage;
	}
	public void setBagage(int bagage) {
		this.bagage = bagage;
	}
	
	public vol(int id, String departure, String destination, int id_avion, Date date_d, Date date_a, LocalTime heure_d,
			LocalTime heure_a, int nbr_places, String escale, int bagage) {
		super();
		this.id = id;
		this.departure = departure;
		this.destination = destination;
		this.id_avion = id_avion;
		this.date_d = date_d;
		this.date_a = date_a;
		this.heure_d = heure_d;
		this.heure_a = heure_a;
		this.nbr_places = nbr_places;
		this.escale = escale;
		this.bagage = bagage;
	}
	
	public vol() {
		super();
	}
	


   
}
