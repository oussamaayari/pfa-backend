package com.fst.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fst.demo.models.AppRole;

public interface IAppRoleDao extends JpaRepository<AppRole,Long> {
	public AppRole findByRoleName(String roleName);
	
	
}
