package com.fst.demo.models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity


public class Candidat implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_cand;
	private String nom_cand;
	private String prenom_cand;
	private String email_cand;
	private long identite_cand;
	private String adresse_cand;
	private long num_telephone_cand;

	
	@ManyToOne(cascade=CascadeType.ALL)
	private Projet projet;

	public Candidat() {
		super();
	}
	
	public Candidat(long id_cand,String nom_cand,String prenom_cand,String email_cand, long identite_cand,String adresse_cand,long num_telephone_cand) {
		super();
		
		this.id_cand=id_cand;
		this.nom_cand=nom_cand;
		this.prenom_cand=prenom_cand;
		this.email_cand=email_cand;
		this.identite_cand=identite_cand;
		this.adresse_cand=adresse_cand;
		this.num_telephone_cand=num_telephone_cand;
		
	}
	
	public Candidat(long id_cand,String nom_cand,String prenom_cand,String email_cand, long identite_cand,String adresse_cand,long num_telephone_cand,Projet entretien) {
		super();
		
		this.id_cand=id_cand;
		this.nom_cand=nom_cand;
		this.prenom_cand=prenom_cand;
		this.email_cand=email_cand;
		this.identite_cand=identite_cand;
		this.adresse_cand=adresse_cand;
		this.num_telephone_cand=num_telephone_cand;
	    this.projet=entretien;
	
}

	public long getId() {
		return id_cand;
	}

	public void setId(long id) {
		this.id_cand = id;
	}

	public String getNom() {
		return nom_cand;
	}

	public void setNom(String nom) {
		this.nom_cand = nom;
	}

	public String getPrenom() {
		return prenom_cand;
	}

	public void setPrenom(String prenom) {
		this.prenom_cand = prenom;
	}

	public String getEmail() {
		return email_cand;
	}

	public void setEmail(String email) {
		this.email_cand = email;
	}

	public long getIdentite() {
		return identite_cand;
	}

	public void setIdentite(long identite) {
		this.identite_cand = identite;
	}

	public String getAdresse() {
		return adresse_cand;
	}

	public void setAdresse(String adresse) {
		this.adresse_cand = adresse;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public long getNum_telephone() {
		return num_telephone_cand;
	}

	public void setNum_telephone(long num_telephone) {
		this.num_telephone_cand = num_telephone;
	}

	public Projet getEntretien() {
		return projet;
	}

	public void setEntretien(Projet entretien) {
		this.projet = entretien;
	}
	
	
	
	
	
	
}
