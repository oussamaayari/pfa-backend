package com.fst.demo.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@Entity
@Table(name="app_user")
//@JsonIgnoreProperties("app_user") 

public class AppUser {

	
	public AppUser() {
		super();
//		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long user_id;
	@Column(unique=true)
	private String username;
	@JsonProperty(access=JsonProperty.Access.WRITE_ONLY)
	private String password;
	/*so we cannot read from the console*/
	private boolean activated;
	private int tel_utilis;
	private String remarque_utilis;
	private String email_utilis;
	private String adresse_utilis;
	private String identite_utilis;
	private String nom_utilis;
	private String lieu_naissance_utilis;
	private String indication_utilis;
	private Date date_naissance_utilis;
	private Date date_emission_cin;
	public String getEmail_utilis() {
		return email_utilis;
	}
	public void setEmail_utilis(String email_utilis) {
		this.email_utilis = email_utilis;
	}
	public String getAdresse_utilis() {
		return adresse_utilis;
	}
	public void setAdresse_utilis(String adresse_utilis) {
		this.adresse_utilis = adresse_utilis;
	}
	public String getIdentite_utilis() {
		return identite_utilis;
	}
	public void setIdentite_utilis(String identite_utilis) {
		this.identite_utilis = identite_utilis;
	}
	public String getNom_utilis() {
		return nom_utilis;
	}
	public void setNom_utilis(String nom_utilis) {
		this.nom_utilis = nom_utilis;
	}
	public String getLieu_naissance_utilis() {
		return lieu_naissance_utilis;
	}
	public void setLieu_naissance_utilis(String lieu_naissance_utilis) {
		this.lieu_naissance_utilis = lieu_naissance_utilis;
	}
	public String getIndication_utilis() {
		return indication_utilis;
	}
	public void setIndication_utilis(String indication_utilis) {
		this.indication_utilis = indication_utilis;
	}
	public Date getDate_naissance_utilis() {
		return date_naissance_utilis;
	}
	public void setDate_naissance_utilis(Date date_naissance_utilis) {
		this.date_naissance_utilis = date_naissance_utilis;
	}
	public Date getDate_emission_cin() {
		return date_emission_cin;
	}
	public void setDate_emission_cin(Date date_emission_cin) {
		this.date_emission_cin = date_emission_cin;
	}
	public Date getDate_emission_PA() {
		return date_emission_PA;
	}
	public void setDate_emission_PA(Date date_emission_PA) {
		this.date_emission_PA = date_emission_PA;
	}
//	public Collection<Absence> getAbsences() {
//		return Absences;
//	}
//	public void setAbsences(Collection<Absence> absences) {
//		Absences = absences;
//	}
	private Date date_emission_PA;



	@ManyToMany(fetch=FetchType.EAGER)
	private Collection<AppRole> roles=new ArrayList<AppRole>();
	
	/*cardinalite avec absences*/
	 
//	 @OneToMany(mappedBy="appUser")
//	 	private Collection<Absence> Absences;

	
	
	
	public AppUser(Long user_id, String username, String password, boolean activated, Collection<AppRole> roles) {
		super();
		this.user_id = user_id;
		this.username = username;
		this.password = password;
		this.activated = activated;
		this.roles = roles;
		
		
		
		
		
	}   
	@Override
	public String toString() {
		return "AppUser [user_id=" + user_id + ", username=" + username + ", password=" + password + ", activated="
				+ activated + ", roles=" + roles + "]";
	}
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isActivated() {
		return activated;
	}
	public void setActivated(boolean activated) {
		this.activated = activated;
	}
	public Collection<AppRole> getRoles() {
		return roles;
	}
	public void setRoles(Collection<AppRole> roles) {
		this.roles = roles;
	}
	public String getRemarque_utilis() {
		return remarque_utilis;
	}
	public void setRemarque_utilis(String remarque_utilis) {
		this.remarque_utilis = remarque_utilis;
	}
	public int getTel_utilis() {
		return tel_utilis;
	}
	public void setTel_utilis(int tel_utilis) {
		this.tel_utilis = tel_utilis;
	}
	
	
}
