package com.projet_S2.clienEtudient.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.context.support.StaticApplicationContext;

public class Absence {
	private int id;
	private LocalDate date;
	private String matiere;
	private String cin;
	private static  int nb=0;

	public String getMatiere() {
		return matiere;
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

	@Override
	public String toString() {
		return "Absence [id=" + id + ", date=" + date + ", matiere=" + matiere + ", cin=" + cin + "]";
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Absence() {
		super();
		this.date=LocalDateTime.now().toLocalDate();
		this.id=nb;
		nb=nb+1;
	}
	
}
