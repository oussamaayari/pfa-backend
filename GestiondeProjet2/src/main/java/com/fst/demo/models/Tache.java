package com.fst.demo.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="question")

public class Tache implements Serializable {

private static final long serialVersionUID = 1L;

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private long id_ques;
private String type_ques;
private String desc_ques;
//@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")

private Date date_ques;



//relation with entretien

	
	 @ManyToMany(mappedBy="questions",cascade=CascadeType.ALL) 
	 private List<Projet> entretiens ;


// relation with reponse

      @OneToOne(mappedBy="question",cascade=CascadeType.ALL)
       private Reponse reponse; 


		
	
   public Tache() {
		super();
	}

  
   public Tache(long id_ques ,String type_ques,String desc_ques, Date date_ques) {
       
	   	this.id_ques=id_ques;
	   	this.type_ques=type_ques;
	   	this.desc_ques=desc_ques;
	   	this.date_ques=date_ques;
   	
	   }

   
   
   public Tache(long id ,String type,String desc, Date date,Reponse reponse) {
       
   	this.id_ques=id;
   	this.type_ques=type;
   	this.desc_ques=desc;
   	this.date_ques=date;
  	this.reponse=reponse;
   	
   }
       
public List<Projet> getEntretiens() {
	return entretiens;
}

public void setEntretiens(List<Projet> entretiens) {
	this.entretiens = entretiens;
}

public long getId() {
	return id_ques;
}


public void setId(long id) {
	this.id_ques = id;
}


public String getType() {
	return type_ques;
}


public void setType(String type) {
	this.type_ques = type;
}


public String getDesc() {
	return desc_ques;
}


public void setDesc(String desc) {
	this.desc_ques = desc;
}


public Date getDate() {
	return date_ques;
}


public void setDate(Date date) {
	this.date_ques = date;
}


public static long getSerialversionuid() {
	return serialVersionUID;
}
	
   
   
}
