package com.fst.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class AppRole {
	
	
	
	public AppRole() {
		super();
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String roleName;
	public AppRole(Long id, String roleName2) {
		super();
		this.id = id;
		roleName = roleName2;
	}
	@Override
	public String toString() {
		return "AppRole [id=" + id + ", RoleName=" + roleName + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName2) {
		roleName = roleName2;
	}

}
