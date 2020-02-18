package com.fst.demo.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

@Entity
public class Reponse implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id_rep;
	
	private String type_rep;
	private String desc_rep;
	private String sujet_rep;

	@OneToOne
    @JoinColumn
    @MapsId
    
    private Tache question;
	
	public Reponse() {
		super();
	}
	
	public Reponse(long id_rep,String type_rep,String desc_rep,String sujet_rep) {
		this.id_rep=id_rep;
		this.type_rep=type_rep;
		this.desc_rep=desc_rep;
		this.sujet_rep=sujet_rep;
	}
			
	
	public long getId_rep() {
		return id_rep;
	}

	public void setId_rep(long id_rep) {
		this.id_rep = id_rep;
	}

	public String getType_rep() {
		return type_rep;
	}

	public void setType_rep(String type_rep) {
		this.type_rep = type_rep;
	}

	public String getDesc_rep() {
		return desc_rep;
	}

	public void setDesc_rep(String desc_rep) {
		this.desc_rep = desc_rep;
	}

	public String getSujet_rep() {
		return sujet_rep;
	}

	public void setSujet_rep(String sujet_rep) {
		this.sujet_rep = sujet_rep;
	}

	
	  public Tache getQuestion() {
		  return question;
		  }
	  
	  public void setQuestion(Tache question) { 
		  this.question = question; 
		  }
	 

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	


}
