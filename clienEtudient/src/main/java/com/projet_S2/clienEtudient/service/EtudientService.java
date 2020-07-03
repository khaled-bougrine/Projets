package com.projet_S2.clienEtudient.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet_S2.clienEtudient.clienFeign.FeignEtudientClien;
import com.projet_S2.clienEtudient.clienFeign.FeignProf;
import com.projet_S2.clienEtudient.model.Absence;
import com.projet_S2.clienEtudient.model.Etudien_t;
import com.projet_S2.clienEtudient.model.Etudient;
import com.projet_S2.clienEtudient.model.Prof;
import com.projet_S2.clienEtudient.model.Remarque;


@Service
public class EtudientService {
	@Autowired
	SessionBean sessionBean;
	@Autowired
	SessionClass2 sessionClass2;
	@Autowired
	SessionProf sessionProf;
	@Autowired
	FeignEtudientClien feignEtudientClien;
	@Autowired
	FeignProf feignProf;
	
	public Etudien_t etudientParCin(String cin) {
		return new Etudien_t(feignEtudientClien.recupererUnEtudient(cin),
				feignEtudientClien.listDesAbsence(cin),feignEtudientClien.getListRemarque(cin));
	}
	public List<Remarque> recupererRemarques(String cin){
		return feignEtudientClien.getListRemarque(cin);
	}
	public List<Absence> recupererAbsences(String cin){
		return feignEtudientClien.listDesAbsence(cin);
	}
	public Etudient etudientparcin(String cin) {
		return feignEtudientClien.recupererUnEtudient(cin);
	}

	public String getCinEtudientCurrent() {
		return sessionBean.getMessage();
	}
	public void setClassCurrente(String classe) {
		sessionClass2.setMessage(classe);
	}
	public String getClassCurrent() {
		return sessionClass2.getMessage();
	}
	public Prof getProfCurrent() {
		return sessionProf.getMessage();
	}
	public void setProfCurrent(Prof prof) {
		sessionProf.setMessage(prof);
	}
	/*
	public String getprofcurrent() {
		return sessionBean.getMessage();
		
	}
	*/
	public void setCinProfCurrent(String cinprofCurrent) {
		sessionBean.setMessage(cinprofCurrent);
		
	}

	public void setCinEtudientCurrent(String cinEtudientCurrent) {
		sessionBean.setMessage(cinEtudientCurrent);
		
	}
	public boolean exist(Etudient etudient) {
		for(Etudient etudientt: feignEtudientClien.recuperertouslesetudients()) {
			if(etudient.equals(etudientt)) {
				return true;
			}
		}
		return false;
	}
	public void postRemarque(Remarque remarque) {
		feignEtudientClien.putRemarque(remarque);
	}
	public void postAbsence(Absence absence) {
		feignEtudientClien.postRemarque(absence);
	}
	public void addEtudient(Etudient etudient) {
		feignEtudientClien.addEtudient(etudient);
	}
	public List<Etudient> etudientList(String classe) {
		return feignEtudientClien.recupererParClass(classe);
	}
	public Prof recupererUnProf(){
		return feignProf.recupererUnProf();
	}
	
	
	
	
	
	

}
