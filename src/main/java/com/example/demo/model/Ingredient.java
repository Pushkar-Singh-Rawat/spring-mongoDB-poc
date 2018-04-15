package com.example.demo.model;

import java.math.BigDecimal;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@EqualsAndHashCode(exclude={"recipe"})
public class Ingredient {

	public Ingredient() {
		super();
		// TODO Auto-generated constructor stub
	}
	//@Id this is inside the document as a nested key val so Id will not be generated
	private String ingredientID=UUID.randomUUID().toString(); //assigs random UUID
	private String description;
	private BigDecimal amount;

	
	//private Recipe recipe; // to which ingredient belongs

    @DBRef
	private UnitOfMeasurement unitOfMeasurement;

	public Ingredient(String description, BigDecimal amount, UnitOfMeasurement unitOfMeasurement,Recipe recipe) {
		this.description = description;
		this.amount = amount;
		this.unitOfMeasurement = unitOfMeasurement;
		//this.recipe=recipe;
	}

	public Ingredient(String description, BigDecimal amount, UnitOfMeasurement unitOfMeasurement) {
		this.description = description;
		this.amount = amount;
		this.unitOfMeasurement = unitOfMeasurement;
	}


}
