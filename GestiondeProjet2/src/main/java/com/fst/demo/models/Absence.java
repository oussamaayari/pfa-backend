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
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="absence")

public class Absence implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_abs;
	private String type_absence;
	private String desc_absence;
	//@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date date_abs;


	//CARDINALITE with appUser
	@ManyToOne
 	private AppUser appUser;


	
	
	
	public Absence() {
		super();
			}



	public Absence(String type_absence, String desc_absence, Date date_abs, AppUser appUser) {
		super();
		this.type_absence = type_absence;
		this.desc_absence = desc_absence;
		this.date_abs = date_abs;
		this.appUser = appUser;
	}



		 @Override
	public String toString() {
		return "Absence [id_abs=" + id_abs + ", type_absence=" + type_absence + ", desc_absence=" + desc_absence
				+ ", date_abs=" + date_abs + ", appUser=" + appUser + "]";
	}



		public Long getId_abs() {
		return id_abs;
	}



	public void setId_abs(long id_abs) {
		this.id_abs = id_abs;
	}



	public String getType_absence() {
		return type_absence;
	}



	public void setType_absence(String type_absence) {
		this.type_absence = type_absence;
	}



	public String getDesc_absence() {
		return desc_absence;
	}



	public void setDesc_absence(String desc_absence) {
		this.desc_absence = desc_absence;
	}



	public Date getDate_abs() {
		return date_abs;
	}



	public void setDate_abs(Date date_abs) {
		this.date_abs = date_abs;
	}



	public AppUser getAppUser() {
		return appUser;
	}



	public void setAppUser(AppUser appUser) {
		this.appUser = appUser;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}





			
		

	
}
