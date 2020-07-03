package com.projet_S2.absence.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projet_S2.absence.model.Absence;
@Repository
public interface AbsenceDao extends JpaRepository<Absence,Integer> {
	
	public List<Absence> findByCin(String cin);
	

}
