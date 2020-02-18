package com.fst.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fst.demo.models.AppRole;
import com.fst.demo.models.AppUser;
import com.fst.demo.repository.IAppRoleDao;
import com.fst.demo.repository.IAppUserDao;
import com.fst.demo.services.IAccountService;




@Service
@Transactional
public class AccountServiceImpl implements IAccountService {

	
	@Autowired
	private IAppUserDao UserDao;
	@Autowired
	private IAppRoleDao RoleDao;
	@Autowired
	private BCryptPasswordEncoder  bCryptPasswordEncoder;
	
	
	@Override
	
	public AppUser saveUser(String username, String password, String confirmedPassword ) {
     AppUser user= UserDao.findByusername(username);
     if (user!=null) throw new RuntimeException("User already exists");
     if (!password.equals(confirmedPassword))throw new RuntimeException("Please confirm ur password!!");
		
     
        AppUser appUser= new AppUser();
		appUser.setUsername(username);
		appUser.setActivated(true);
		appUser.setPassword(bCryptPasswordEncoder.encode(password));
		UserDao.save(appUser);
		addRoleToUser(username, "USER");
		System.out.println(appUser.getUsername());
		return appUser;
	}

	@Override
	public AppRole save(AppRole role) {
		// TODO Auto-generated method stub
		return RoleDao.save(role);
	}
	

	@Override
	public AppUser loadUserByUsername(String username) {
		return UserDao.findByusername(username);
	}

	@Override
	public void addRoleToUser(String username, String rolename) {
		// TODO Auto-generated method stub
        AppUser appUser=UserDao.findByusername(username); 
		AppRole appRole=RoleDao.findByRoleName(rolename);
		appUser.getRoles().add(appRole);
		
	}

	@Override
	public List<AppUser> findAllUsers() {
		// TODO Auto-generated method stub
		return UserDao.findAll();
		
	}

	@Override
	public List<AppRole> findAllRoles() {
		return RoleDao.findAll();
	}
	
	
	

		@Override
		public AppUser add(AppUser t) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public AppUser update(AppUser t) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public AppUser getOne(Long id) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<AppUser> findAll() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void delete(Long id) {
			UserDao.deleteById(id);
		}

		@Override
		public void saveUser(String username, String password, String confirmedPassword, String remarque_utilis) {
			// TODO Auto-generated method stub
			
		}

} 
