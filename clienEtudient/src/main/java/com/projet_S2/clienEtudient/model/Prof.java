package com.projet_S2.clienEtudient.model;

import java.util.List;


public class Prof {
	private int id;
	private String nom;
	private String prenom;
	private String motdepass;
	private String matier;
	private List<String> listdeclass;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getMotdepass() {
		return motdepass;
	}
	public void setMotdepass(String motdepass) {
		this.motdepass = motdepass;
	}
	public List<String> getListdeclass() {
		return listdeclass;
	}
	public void setListdeclass(List<String> listdeclass) {
		this.listdeclass = listdeclass;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getMatier() {
		return matier;
	}
	public void setMatier(String matier) {
		this.matier = matier;
	}


}
