package com.projet_S2.clienEtudient.clienFeign;


import java.util.List;

import javax.ws.rs.Path;

//import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.projet_S2.clienEtudient.model.Absence;
import com.projet_S2.clienEtudient.model.Etudient;
import com.projet_S2.clienEtudient.model.Remarque;

@FeignClient(name="microservice-apigatway")
//@RibbonClient("microservice-etudient microservice-remarques microservice-absence")
public interface FeignEtudientClien {
	
	@GetMapping("microservice-etudient/etudient/{cin}")
	Etudient recupererUnEtudient(@PathVariable("cin") String cin);
	
	@GetMapping("microservice-etudient/etudientParClass/{classe}")
	List<Etudient> recupererParClass(@PathVariable("classe") String classe);
	
	@GetMapping("microservice-etudient/etudientAll")
	List<Etudient> recuperertouslesetudients();
	
	@PutMapping("microservice-etudient/etudient/")
	public void addEtudient(@RequestBody Etudient etudient);
	
	@GetMapping("microservice-remarques/{cin}")
	public List<Remarque> getListRemarque(@PathVariable("cin") String cin);
	
	@PutMapping("microservice-remarques/remarque")
	public void putRemarque(@RequestBody Remarque remarque);
	
	@GetMapping("microservice-absence/absence/{cin}")
	List<Absence> listDesAbsence(@PathVariable("cin") String cin);
	
	@PutMapping("microservice-absence/absence")
	void postRemarque(@RequestBody Absence absence) ;
	
	

}
	
	
	
	
	
		
	


