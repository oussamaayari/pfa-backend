package com.fst.demo.webservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fst.Dto.TacheDto;
import com.fst.demo.models.Tache;
import com.fst.demo.services.IQuestionService;

@RestController
@RequestMapping("/question")
@CrossOrigin("*")

public class TacheRestController {	
	
	@Autowired
	private IQuestionService service;
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	Tache add(@RequestBody TacheDto tDto) {
		System.out.println( tDto.getType_ques());
		Tache t = new Tache();
		t.setType(tDto.getType_ques());
		t.setDesc(tDto.getDesc_ques());
		t.setDate(tDto.getDate_ques());

		return service.add(t);
}

	
	
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	Tache update(@RequestBody  TacheDto tDto) {
		
			System.out.println( tDto.getType_ques());
			Tache t = new Tache();
			t.setType(tDto.getType_ques());
			t.setDesc(tDto.getDesc_ques());
			t.setDate(tDto.getDate_ques());

		return service.update(t);				}

	@RequestMapping(value = "/getOne/{id}", method = RequestMethod.GET)
	Tache getOne(@PathVariable Long id) {

		return service.getOne(id);

	}

	@RequestMapping(value = "/findAll", method = RequestMethod.GET)
	List<Tache> findAll() {
		return service.findAll();
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	     void delete(@PathVariable Long id) {

		  service.delete(id);
            
	}
	
	
	
	
	


}
