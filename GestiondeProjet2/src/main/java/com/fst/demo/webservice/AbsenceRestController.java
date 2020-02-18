package com.fst.demo.webservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fst.demo.models.Reponse;
import com.fst.demo.services.IReponseService;

@RestController
@RequestMapping("/reponse")
@CrossOrigin("*")


public class AbsenceRestController {
	@Autowired
	private IReponseService service;
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	Reponse add(@RequestBody Reponse t) {
		return service.add(t);
}

	
	
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	Reponse update(@RequestBody Reponse c) {

		return service.update(c);

	}

	@RequestMapping(value = "/getOne/{id}", method = RequestMethod.GET)
	Reponse getOne(@PathVariable Long id) {

		return service.getOne(id);

	}

	@RequestMapping(value = "/findAll", method = RequestMethod.GET)
	List<Reponse> findAll() {
		return service.findAll();
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	     void delete(@PathVariable Long id) {

		  service.delete(id);
            
	}
	
}
