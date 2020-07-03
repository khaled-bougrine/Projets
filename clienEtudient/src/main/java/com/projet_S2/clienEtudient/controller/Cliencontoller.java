package com.projet_S2.clienEtudient.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.projet_S2.clienEtudient.clienFeign.FeignProf;
import com.projet_S2.clienEtudient.model.Absence;
import com.projet_S2.clienEtudient.model.Etudien_t;
import com.projet_S2.clienEtudient.model.Etudient;
import com.projet_S2.clienEtudient.model.Prof;
import com.projet_S2.clienEtudient.model.Remarque;
import com.projet_S2.clienEtudient.service.EtudientService;
import com.projet_S2.clienEtudient.service.Messanger;

@Controller
public class Cliencontoller {
	// Logger log = LoggerFactory.getLogger(this.getClass());
	// String classecourente;

	// Prof prof;
	@Autowired
	EtudientService etudientService;

	@Autowired
	Messanger messanger;

	// @Autowired
	// FeignProf feignProf;

	@GetMapping("/etudient")
	public ModelAndView accueil() {
		Map<String, Etudient> model = new HashMap<String, Etudient>();
		model.put("etudient", etudientService.etudientparcin(etudientService.getCinEtudientCurrent()));
		return new ModelAndView("AccueilParent", model);
	}/*
		 * @GetMapping("/profForm") public ModelAndView
		 */

	@GetMapping("/loginEtudient")
	public ModelAndView index() {
		Map<String, Etudient> model = new HashMap<String, Etudient>();
		model.put("etudient", new Etudient());
		return new ModelAndView("index", model);
	}

	@PostMapping("/loginEtudient")
	public ModelAndView post(Etudient etudient) {

		if (etudientService.exist(etudient)) {
			RedirectView redirectView = new RedirectView();
			redirectView.setUrl("/etudient");
			etudientService.setCinEtudientCurrent(etudient.getCin());
			return new ModelAndView(redirectView);

		} else
			return new ModelAndView("index");

	}

	@GetMapping("/remarques")
	public ModelAndView remarques() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("listRemarques", etudientService.recupererRemarques(etudientService.getCinEtudientCurrent()));
		return new ModelAndView("remarques", model);
	}

	@GetMapping("/absences")
	public ModelAndView absences() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("listAbsences", etudientService.recupererAbsences(etudientService.getCinEtudientCurrent()));
		return new ModelAndView("abscence", model);

	}

	@PostMapping("/remarque")
	public ModelAndView postRemarque(Remarque remarque) {
		etudientService.postRemarque(remarque);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("/EtudientList?classe=" + etudientService.getClassCurrent());
		return new ModelAndView(redirectView);
	}

	@GetMapping("/getremarque")
	public ModelAndView getRemarque(@RequestParam String cin) {
		// messanger.sendMessage();
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("etudient", etudientService.etudientparcin(cin));
		Remarque remarque = new Remarque();
		remarque.setCin(cin);
		remarque.setProf(etudientService.getProfCurrent().getNom());

		model.put("remarque", remarque);
		return new ModelAndView("RedigRemarque", model);
	}

	/*
	 * @PostMapping("/absence") public ModelAndView postAbsence(Absence absence){
	 * etudientService.postAbsence(absence); RedirectView redirectView=new
	 * RedirectView(); redirectView.setUrl("/EtudientList"); return new
	 * ModelAndView(redirectView); }
	 * 
	 * @GetMapping("/addabsence") public ModelAndView getAbsence(@RequestParam
	 * String cin){ //messanger.sendMessage(); Map<String,Object> model =new
	 * HashMap<String, Object>(); Absence absence =new Absence();
	 * absence.setCin(cin); model.put("absence",absence);
	 * model.put("etudient",etudientService.etudientparcin(cin)); return new
	 * ModelAndView("absenceform",model); }
	 * 
	 * @GetMapping("addAbsence") public void addabsence(@RequestParam String cin) {
	 * 
	 * Absence absence = new Absence(); absence.setCin(cin);
	 * absence.setMatiere(prof.getMatier()); etudientService.postAbsence(absence);
	 * // return new ModelAndView("New"); }
	 */
	/*
	 * 
	 * @PostMapping("/addetudient") public ModelAndView addEtudient(Etudient
	 * etudient) { etudientService.addEtudient(etudient); return new
	 * ModelAndView("addetudient"); }
	 * 
	 * @GetMapping("/add_etudient") public ModelAndView addEtudient() { Map<String,
	 * Etudient> model = new HashMap<String, Etudient>(); model.put("etudient", new
	 * Etudient()); return new ModelAndView("addetudient", model); }
	 */

	@GetMapping("/EtudientList")
	public ModelAndView etudientList(@RequestParam(required = false) String cin,
			@RequestParam(required = false) String classe) {
		if (cin != null) {

			Absence absence = new Absence();
			absence.setCin(cin);
			absence.setMatiere(etudientService.getProfCurrent().getMatier());
			etudientService.postAbsence(absence);
			Map<String, List<Etudient>> model = new HashMap<String, List<Etudient>>();
			model.put("etudientList", etudientService.etudientList(etudientService.getClassCurrent()));
			return new ModelAndView("1s2", model);

		
		} else {
			etudientService.setClassCurrente(classe);
			// log.info("la page d'un etudient");
			Map<String, List<Etudient>> model = new HashMap<String, List<Etudient>>();
			model.put("etudientList", etudientService.etudientList(etudientService.getClassCurrent()));
			return new ModelAndView("1s2", model);

		}
	}

	@GetMapping("/Déconnexion")
	public ModelAndView deconnexion() {
		etudientService.setCinEtudientCurrent("");
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("/");
		return new ModelAndView(redirectView);
	}

	@GetMapping("/prof")
	public ModelAndView Prof() {
		Map<String, Prof> model = new HashMap<String, Prof>();
		etudientService.setProfCurrent(etudientService.recupererUnProf());
		// etudientService.setCinProfCurrent(prof.getMotdepass());
		model.put("prof", etudientService.getProfCurrent());
		return new ModelAndView("ListClass", model);
	}

	@GetMapping("/accueil")
	public String acceil() {
		return "accueilProf";
	}

	@GetMapping("/")
	public String list() {
		return "Listes";
	}

}
