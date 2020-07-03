package com.projet_S2.clienEtudient.model;

import org.aspectj.weaver.ast.And;

public class Etudient {

	private int id;
	private String name;
	private String prename;
	private String cin;
	private String nb_tel;
	private String classe;

	public Etudient() {
		super();
	}
	@Override
	public String toString() {
		return "Etudient [id=" + id + ", name=" + name + ", prename=" + prename + ", cin=" + cin + ", nb_tel=" + nb_tel
				+ "]";
	}
	public Etudient(int id, String name, String prename, String cin, String nb_tel) {
		super();
		this.id = id;
		this.name = name;
		this.prename = prename;
		this.cin = cin;
		this.nb_tel = nb_tel;
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
	
	public boolean equals(Etudient etudient) {
		if(etudient.cin.equals(this.cin) && etudient.name.equals(this.name)){
			return true;	
		}else return false;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	

}
