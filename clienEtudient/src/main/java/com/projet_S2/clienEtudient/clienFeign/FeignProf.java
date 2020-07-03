package com.projet_S2.clienEtudient.clienFeign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.projet_S2.clienEtudient.model.Prof;

@FeignClient(name="prof-microservoce",url="localhost:9005")
public interface FeignProf {
	
	@GetMapping("/")
	public Prof recupererUnProf();
	
	

}
