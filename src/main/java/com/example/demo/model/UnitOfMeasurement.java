package com.example.demo.model;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Document
public class UnitOfMeasurement {
	
	@Id
	private String uomID;
	private String description;

	public UnitOfMeasurement() {
		super();
		// TODO Auto-generated constructor stub
	}


}
