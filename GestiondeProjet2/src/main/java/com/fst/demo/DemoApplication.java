package com.fst.demo;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.fst.demo.models.Absence;
import com.fst.demo.models.AppRole;
import com.fst.demo.models.AppUser;
import com.fst.demo.models.Projet;
import com.fst.demo.repository.IAbsenceDao;
import com.fst.demo.repository.IAppRoleDao;
import com.fst.demo.repository.IAppUserDao;
import com.fst.demo.repository.IProjetDao;
import com.fst.demo.services.IAccountService;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
//@EnableConfigurationProperties
@EnableSwagger2
//@EntityScan(basePackages = {"com.fr.adaming.models"})  // scan JPA entities
   //@EnableResourceServer
//security enabled using JWT
public class DemoApplication implements CommandLineRunner{
	
	@Autowired
	IAbsenceDao iAbsenceDao ; 
	@Autowired
	IProjetDao iEntretienDao;
	@Autowired
	IAppUserDao iAppUserDao;

	@Autowired
	IAppRoleDao iAppRoleDao;
	
	@Autowired
	IAccountService iAccountService;

	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		
	Date date_abs = new Date();
		AppUser appUser=iAccountService.loadUserByUsername("ghada");
		Absence abs = new Absence("maladie", "absence justifiée", date_abs, appUser);
	iAbsenceDao.save(abs);
//		
//		AppRole role1= new AppRole() ;
//        role1.setId(null);
//	    role1.setRoleName("USER");
//	    AppRole role2= new AppRole() ;
//        role2.setId(null);
//	    role2.setRoleName("Admin");
//	   iAccountService.save(role1);
//	   iAccountService.save(role2);
		
		
//	   iAccountService.saveUser("admin", "admin", "admin") ; 
//
//		iAccountService.addRoleToUser("admin", "Admin");
	//   iAccountService.saveUser("aymen", "1234", "1234") ; 
//		   iAccountService.addRoleToUser("oussama", "Admin");
//		   
	  // iAccountService.saveUser("Oussama Ayari", "1234", "1234","utilisatur temporaire") ;
//		   AppRole role1= new AppRole(null,"CHEF_DE_PROJET") ;
//		   AppRole role2= new AppRole(null,"STAGIAIRE") ;
//		   AppRole role3= new AppRole(null,"DEVELOPPEUR") ;
//		   AppRole role4= new AppRole(null,"USER") ;
//		   iAccountService.save(role1);
//		   iAccountService.save(role2);
//		   iAccountService.save(role3);
//		   iAccountService.save(role4);
//		   iAccountService.addRoleToUser("admin", "ADMIN");
//		   iAccountService.addRoleToUser("ghada", "CHEF_DE_PROJET");
//		   iAccountService.addRoleToUser("aymen", "USER");	
		
	Projet p1 = new Projet(3L,"inactive","adaming", date_abs);
		iEntretienDao.save(p1);
	}
//	@Bean
//  CommandLineRunner start (IAccountService iAccountService){
//   return args->{
//	    AppRole role1= new AppRole(0L,"USER")  ;
//	    role1.setId(0L);
//	   role1.setRoleName("USER");
//	    AppRole role2= new AppRole(1L,"Admin")  ;
//	    role2.setId(0L);
//	    role2.setRoleName("Admin");
//	   iAccountService.save(role1);
//	   iAccountService.save(role2);
//	   Stream.of("user1","user2","user3","Admin").forEach(u->{
//		   iAccountService.saveUser(u, "1234", "1234") ; 
//	   });
//   };
//  }
	
	@Bean
	BCryptPasswordEncoder getBCPE() {
		return new BCryptPasswordEncoder();
	}


}
	
	


