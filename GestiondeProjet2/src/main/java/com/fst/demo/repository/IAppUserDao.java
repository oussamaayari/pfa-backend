package com.fst.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fst.demo.models.AppUser;

public interface IAppUserDao extends JpaRepository<AppUser,Long> {

	public AppUser findByusername(String username);
	
	
}
