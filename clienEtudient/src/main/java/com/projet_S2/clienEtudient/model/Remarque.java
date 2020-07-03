package com.projet_S2.clienEtudient.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Remarque {
	
	private int id;
	private String prof;
	private LocalDate date;
	private String remarque;
	private String cin;
	private static int nb;
	


	public String getProf() {
		return prof;
	}

	@Override
	public String toString() {
		return "Remarque [id=" + id + ", prof=" + prof + ", date=" + date + ", remarque="
				+ remarque + ", cin=" + cin + "]";
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
	public Remarque() {
		super();
		nb=nb+1;
		this.id=nb;
		this.date=LocalDateTime.now().toLocalDate();
	}
	public Remarque(String remarque) {
		super();
		this.remarque=remarque;
		nb=nb+1;
		this.id=nb;
		this.date=LocalDateTime.now().toLocalDate();
	}

	public void setCinEtudient(String cinEtudient) {
		this.cin = cinEtudient;
	}



	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

}
