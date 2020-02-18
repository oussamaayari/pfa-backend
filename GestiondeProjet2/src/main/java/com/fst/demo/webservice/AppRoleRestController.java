package com.fst.demo.webservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fst.Dto.AppRoleDto;
import com.fst.demo.models.AppRole;
import com.fst.demo.services.IAccountService;

@RestController
@RequestMapping("/AppRole")
@CrossOrigin("*")

public class AppRoleRestController {
	@Autowired
	private  IAccountService service;
	@RequestMapping(value = "/add", method = RequestMethod.POST)
        AppRole add(@RequestBody AppRoleDto tDto) {
		System.out.println( tDto.getRoleName());
		//pseudo Mapping entre dto et model

		AppRole r = new AppRole();
		r.setId(tDto.getId());
		r.setRoleName(tDto.getRoleName());
		return service.save(r);
		
}

	@RequestMapping(value = "/findAll", method = RequestMethod.GET)
	List<AppRole> findAll() {
		return service.findAllRoles();

	   }

}
