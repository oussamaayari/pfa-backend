package com.fst.Dto;

import java.util.Date;

public class ProjetDto {
	private String type_entr;
	private String lieu_entr;
//	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date date_entr;
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

	public String getType_entr() {
		return type_entr;
	}

	public void setType_entr(String type_entr) {
		this.type_entr = type_entr;
	}

	public String getLieu_entr() {
		return lieu_entr;
	}

	public void setLieu_entr(String lieu_entr) {
		this.lieu_entr = lieu_entr;
	}

	public Date getDate_entr() {
		return date_entr;
	}

	public void setDate_entr(Date date_entr) {
		this.date_entr = date_entr;
	}

	public String getTechno() {
		return techno;
	}

	public void setTechno(String techno) {
		this.techno = techno;
	}
	
	


}
