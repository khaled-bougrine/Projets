package com.example.prof.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.prof.dao.Repository;
import com.example.prof.model.Prof;

@RestController
public class Controller {
	
	@Autowired
	Repository repository;
	
	@GetMapping("/")
		public 	Prof recuperToutLesProfd() {
			List<String> list   = new ArrayList<String>();
			list.add("GTE1");
			list.add("GTE2");
			Prof prof =  new Prof(10,"aref","meddeb","0000","reseau",list);
			repository.save(prof );
			return prof ;

			//return new Prof(10,"aref","gggga",list);
			
	}
	
	@GetMapping("/hhh")
	public List<Prof> recuperToutLesProf(){
		return repository.findAll(); 
		

	}

}
