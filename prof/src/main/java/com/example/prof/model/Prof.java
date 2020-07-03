package com.example.prof.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Prof {
	@Id
	private int id;
	private String nom;
	private String prenom;
	private String motdepass;
	private String matier;
	//Map<String,String> collection;
	@ElementCollection
	private List<String> listdeclass; 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public List<String> getListdeclass() {
		return listdeclass;
	}
	public void setListdeclass(List<String> listdeclass) {
		this.listdeclass = listdeclass;
	}

	public Prof(int id, String nom, String prenom, String motdepass, String matier, List<String> listdeclass) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.motdepass = motdepass;
		this.matier = matier;
		this.listdeclass = listdeclass;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Prof() {
		super();
	}
	public String getMotdepass() {
		return motdepass;
	}
	public void setMotdepass(String motdepass) {
		this.motdepass = motdepass;
	}
	public String getMatier() {
		return matier;
	}
	public void setMatier(String matier) {
		this.matier = matier;
	}
	
	
	




	
	
	
	
	
	
 

	
	

}
