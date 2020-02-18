package com.fst.demo.webservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fst.demo.models.Candidat;
import com.fst.demo.services.ICandidatService;

@RestController
@RequestMapping("/candidat")
@CrossOrigin("*")

public class CandidatRestController {

	
	@Autowired
	private ICandidatService service ;
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	Candidat add(@RequestBody Candidat c) {
		return service.add(c);
}

	
	
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	Candidat update(@RequestBody Candidat c) {

		return service.update(c);

	}

	@RequestMapping(value = "/getOne/{id}", method = RequestMethod.GET)
	Candidat getOne(@PathVariable Long id) {

		return service.getOne(id);

	}

	@RequestMapping(value = "/findAll", method = RequestMethod.GET)
	List<Candidat> findAll() {
		return service.findAll();
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	     void delete(@PathVariable Long id) {

		  service.delete(id);
            
	}
	
	
	
	
	
}
