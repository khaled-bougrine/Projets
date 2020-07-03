package com.projet_S2.remarque.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Remarque {
	@Id
	private int id;
	private String prof;
	private LocalDate date;
	//private String matier;
	private String remarque;
	private String cin;
	private static int nb;
	


	public String getProf() {
		return prof;
	}

	public void setProf(String prof) {
		this.prof = prof;
	}



	public String getRemarque() {
		return remarque;
	}

	public void setRemarque(String remarque) {
		this.remarque = remarque;
	}



	public String getCinEtudient() {
		return cin;
	}

	public void setCinEtudient(String cinEtudient) {
		this.cin = cinEtudient;
	}



	public Remarque() {
		super();
		nb=nb+1;

		this.id=nb;
		this.date=LocalDateTime.now().toLocalDate();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
      
	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	

	

}
