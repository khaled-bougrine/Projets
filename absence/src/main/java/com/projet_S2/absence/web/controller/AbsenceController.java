package com.projet_S2.absence.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.projet_S2.absence.dao.AbsenceDao;
import com.projet_S2.absence.model.Absence;

@RestController
public class AbsenceController {
	
	@Autowired
	AbsenceDao absenceDao;
	
	
	
	@GetMapping("absence/{cin}")
	public  List<Absence> findAbsenceByCin(@PathVariable String cin){
		return absenceDao.findByCin(cin);
		
	}
	@PutMapping("absence")
	public void postAbsence(@RequestBody Absence absence) {
		absenceDao.save(absence);
	}
	
	
	

}
