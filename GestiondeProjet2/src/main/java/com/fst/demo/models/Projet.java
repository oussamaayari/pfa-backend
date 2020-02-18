package com.fst.demo.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="projet")
public class Projet implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id_entr;
	private String type_entr;
	private String lieu_entr;
	
//	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")

	private Date date_entr;
	//

	private String description;
	private String nom_projet;
	private Date date_fin;
	private String techno;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNom_projet() {
		return nom_projet;
	}

	public void setNom_projet(String nom_projet) {
		this.nom_projet = nom_projet;
	}

	public Date getDate_fin() {
		return date_fin;
	}

	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}

	//Cardinality with  candidate
	@OneToMany(mappedBy="AppUser" , cascade=CascadeType.ALL)
	private List<AppUser> AppUsers;
    
	
	
	//Cardinality with  taches

	@ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(name = "projet_tache", joinColumns = @JoinColumn(name="projet_id", referencedColumnName = "id_entr"),
    inverseJoinColumns = @JoinColumn(name = "tache_id", referencedColumnName = "id_ques"))
	private List<Tache> taches;

	
	
		
    

	
	

	public Projet() {
		super();
	}

	public Projet(long id_entr,String type_entr,String lieu_entr, Date date_entr) {
		
		this.id_entr =id_entr;
		this.type_entr=type_entr;
		this.lieu_entr=lieu_entr;
		this.date_entr=date_entr;
		
	}

	public long getId() {
		return id_entr;
	}

	public void setId(long id) {
		this.id_entr = id;
	}

	public String getType() {
		return type_entr;
	}

	public void setType(String type) {
		this.type_entr = type;
	}

	public String getLieu() {
		return lieu_entr;
	}

	public void setLieu(String lieu) {
		this.lieu_entr = lieu;
	}

	public Date getDate() {
		return date_entr;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setDate(Date date) {
		this.date_entr = date;
	}

	
	public List<AppUser> getAppUsers() {
		return AppUsers;
	}

	public void setAppUsers(List<AppUser> appUsers) {
		AppUsers = appUsers;
	}

	public List<Tache> getTaches() {
		return taches;
	}

	public void setTaches(List<Tache> taches) {
		this.taches = taches;
	}

	public String getTechno() {
		return techno;
	}

	public void setTechno(String techno) {
		this.techno = techno;
	}
	
	
	
	

}
