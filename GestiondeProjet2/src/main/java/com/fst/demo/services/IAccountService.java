package com.fst.demo.services;

import java.util.List;

import com.fst.demo.models.AppRole;
import com.fst.demo.models.AppUser;

public interface IAccountService extends  ICrudService<AppUser, Long>  {

	
	public  AppUser saveUser(String username,String password,String confirmedPassword);
    public AppRole save(AppRole role);
    public AppUser loadUserByUsername(String username);
    public void addRoleToUser(String username,String rolename);
    //++++
    public List<AppUser> findAllUsers();
    //++++
    public List <AppRole> findAllRoles();
	public void saveUser(String username, String password, String confirmedPassword, String remarque_utilis);
}


