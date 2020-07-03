package com.projet_S2.absence.model;


import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Absence {
	@Id
	private int id;
	private LocalDate date;
	private String matiere;
	private String cin;

	private static int nb=0; 

	public String getMatiere() {
		return matiere;
	}
	
	/*
	public Absence(String matiere, String cin) {
		super();
		this.matiere = matiere;
		this.cin = cin;
		
		
		
	}
	*/


	public void setDate(LocalDate date) {
		this.date = date;
	}
	public void setMatiere(String matiere) {
		this.matiere = matiere;
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


	public LocalDate getDate() {
		return date;
	}


	@Override
	public String toString() {
		return "Absence [id=" + id + ", date=" + date + ", matiere=" + matiere + ", cin=" + cin + "]";
	}


	public Absence() {
		super();

		/*nb =nb +1;
		this.id=nb;
		this.date=LocalDateTime.now().toLocalDate();*/
	}
}
