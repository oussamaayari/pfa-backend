package com.fst.demo.webservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fst.Dto.ProjetDto;
import com.fst.demo.models.Projet;
import com.fst.demo.repository.IProjetDao;
import com.fst.demo.services.IEntretienService;

@RestController
@RequestMapping("/entretien")

@CrossOrigin("*")


public class ProjetRestController {
	@Autowired
	private IEntretienService service;
	
	
	@Autowired
	private IProjetDao dao;
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	Projet add(@RequestBody ProjetDto tDto) {
		System.out.println( tDto.getLieu_entr());
		Projet t = new Projet();
		t.setType(tDto.getType_entr());
		t.setLieu(tDto.getLieu_entr());
		t.setDate(tDto.getDate_entr());
		return service.add(t);
}

	
	
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	Projet update(@RequestBody ProjetDto tDto) {
		System.out.println( tDto.getLieu_entr());
		Projet t = new Projet();
		t.setType(tDto.getType_entr());
		t.setLieu(tDto.getLieu_entr());
		t.setDate(tDto.getDate_entr());

		return service.update(t);

	}

	@RequestMapping(value = "/getOne/{id}", method = RequestMethod.GET)
	Projet getOne(@PathVariable Long id) {

		return service.getOne(id);

	}

	@RequestMapping(value = "/findAll", method = RequestMethod.GET)
	List<Projet> findAll() {
		return service.findAll();
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	     void delete(@PathVariable Long id) {

		  service.delete(id);
            
	}
	
	 
	@RequestMapping(value = "/search/{name}", method = RequestMethod.GET)
	List<Projet> rechercher( @PathVariable String name) {
		return dao.rechercher(name);
	}
	
	



}
