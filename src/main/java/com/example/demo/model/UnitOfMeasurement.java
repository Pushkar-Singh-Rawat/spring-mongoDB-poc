package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class UnitOfMeasurement {
	
	private String uomID;
	private String description;
	/*public Long getUomID() {
		return uomID;
	}*/

	public UnitOfMeasurement() {
		super();
		// TODO Auto-generated constructor stub
	}
/*
	public void setUomID(Long uomID) {
		this.uomID = uomID;
	}

	

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}*/

}
