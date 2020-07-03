package com.projet_S2.remarque.web.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.projet_S2.remarque.model.Remarque;
import com.projet_S2.remarque.remarqueDao.RemarqueRepository;

@RestController
public class RemarqueController {
	@Autowired
	RemarqueRepository remarqueRepository;
	
	
	
	@GetMapping("/{cin}")
	public List<Remarque> findremarque(@PathVariable String cin) {
		return remarqueRepository.findByCin(cin);
	}
	@PutMapping("/remarque")
	public void ajouterRemarque(@RequestBody Remarque remarque) {
		remarqueRepository.save(remarque);
	}

}
