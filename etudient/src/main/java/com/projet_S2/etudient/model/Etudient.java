package com.projet_S2.etudient.model;

import java.awt.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Etudient {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String prename;
	private String cin;
	private String nb_tel;
	private String classe;
	private static int nb;
	
	public Etudient() {
		super();
		this.id=nb;
		nb=nb+1;
	}
	@Override
	public String toString() {
		return "Etudient [id=" + id + ", name=" + name + ", prename=" + prename + ", cin=" + cin + ", nb_tel=" + nb_tel
				+ "]";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrename() {
		return prename;
	}
	public void setPrename(String prename) {
		this.prename = prename;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getNb_tel() {
		return nb_tel;
	}
	public void setNb_tel(String nb_tel) {
		this.nb_tel = nb_tel;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}

}
