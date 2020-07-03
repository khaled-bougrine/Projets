package com.projet_S2.clienEtudient.model;

import java.util.List;



public class Etudien_t {

	private Etudient etudient;
	private List<Absence> listAbsence;
	private List<Remarque> listRemarque;
	
	public Etudient getEtudient() {
		return etudient;
	}
	public Etudien_t(Etudient etudient, List<Absence> listAbsence, List<Remarque> listRemarque) {
		super();
		this.etudient = etudient;
		this.listAbsence = listAbsence;
		this.listRemarque = listRemarque;
	}
	public void setEtudient(Etudient etudient) {
		this.etudient = etudient;
	}
	public List<Absence> getListAbsence() {
		return listAbsence;
	}
	public void setListAbsence(List<Absence> listAbsence) {
		this.listAbsence = listAbsence;
	}
	public List<Remarque> getListRemarque() {
		return listRemarque;
	}
	public void setListRemarque(List<Remarque> listRemarque) {
		this.listRemarque = listRemarque;
	}

	
}
