package com.projet_S2.etudient.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projet_S2.etudient.model.Etudient;
@Repository
public interface EtudientRepository extends JpaRepository<Etudient,Integer> {
	
	Etudient findByCin(String cin);
	Etudient findById(int id);
	List<Etudient> findByClasse(String classe);
	void deleteById(int id);
	
}
