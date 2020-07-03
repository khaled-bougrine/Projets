package com.projet_S2.etudient.web.controller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.projet_S2.etudient.dao.EtudientRepository;
import com.projet_S2.etudient.model.Etudient;

@RestController
public class EtudientController {
   Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	EtudientRepository etudientRepository;
	//EtudientService etudientService;

	
	@GetMapping("etudient/{cin}")
	public Etudient etudientParId(@PathVariable String cin ) {
	    log.info("Handling home");

	 return etudientRepository.findByCin(cin);
		
	}
	@GetMapping("/etudientAll")
	public List<Etudient> toutLesEtudients(){
        log.info("Récupération de la liste des etudients");

		return etudientRepository.findAll();
	}
	@GetMapping("etudientParClass/{classe}")
	public List<Etudient> recupererParClass(@PathVariable String classe){
			return etudientRepository.findByClasse(classe);

		
	}
	
	
	@PutMapping("etudient/")
	public void etudient(@RequestBody Etudient etudient) {
		etudientRepository.save(etudient);
	}
	
	@PostMapping("etudient/update")
	public void update (@RequestBody Etudient etudient) {
		etudientRepository.deleteById(etudient.getId());
		etudientRepository.save(etudient);}
	
	
	
	
	
	


}
