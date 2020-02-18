package com.fst.demo.webservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fst.Dto.AppRoleDto;
import com.fst.Dto.AppUserDto;
import com.fst.demo.models.AppUser;
import com.fst.demo.services.IAccountService;

@RestController
@RequestMapping("/AppUser")
@CrossOrigin("*")

public class AppUserRestController {

	
	@Autowired
	private  IAccountService service;
	@RequestMapping(value = "/add", method = RequestMethod.POST)
        AppUser add(@RequestBody AppUserDto tDto) {
		System.out.println( tDto.getUsername());
		//AppUser t = new AppUser();
		//t.setUser_id(tDto.getUser_id());
		//t.setUsername(tDto.getUsername());
		//t.setActivated(tDto.isActivated());
		//t.setPassword(tDto.getPassword());
		return service.saveUser(tDto.getUsername(), tDto.getPassword(), tDto.getPassword());
}

	@RequestMapping(value = "/findAll", method = RequestMethod.GET)
	List<AppUser> findAll() {
		return service.findAllUsers();

	   }
	@RequestMapping(value = "/addRole", method = RequestMethod.POST)
    void add(@RequestBody AppUserDto uDto, AppRoleDto tDto) {
		 service.addRoleToUser(uDto.getUsername(), tDto.getRoleName());
		 
	}
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    void delete(@PathVariable Long id) {

	  service.delete(id);
}
}