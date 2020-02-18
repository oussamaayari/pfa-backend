package com.fst.Dto;

import java.util.Date;

public class TacheDto {
	private long id_ques;
	private String type_ques;
	private String desc_ques;
	private Date date_ques;

	public long getId_ques() {
		return id_ques;
	}

	public void setId_ques(long id_ques) {
		this.id_ques = id_ques;
	}

	public String getType_ques() {
		return type_ques;
	}

	public void setType_ques(String type_ques) {
		this.type_ques = type_ques;
	}

	public String getDesc_ques() {
		return desc_ques;
	}

	public void setDesc_ques(String desc_ques) {
		this.desc_ques = desc_ques;
	}

	public Date getDate_ques() {
		return date_ques;
	}

	public void setDate_ques(Date date_ques) {
		this.date_ques = date_ques;
	}



}
