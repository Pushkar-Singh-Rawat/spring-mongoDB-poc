package com.example.demo.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

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
	private String ingredientID;
	private String description;
	private BigDecimal amount;

	private Recipe recipe; // to which ingredient belongs


	private UnitOfMeasurement unitOfMeasurement;

	public Ingredient(String description, BigDecimal amount, UnitOfMeasurement unitOfMeasurement,Recipe recipe) {
		this.description = description;
		this.amount = amount;
		this.unitOfMeasurement = unitOfMeasurement;
		this.recipe=recipe;
	}

	public Ingredient(String description, BigDecimal amount, UnitOfMeasurement unitOfMeasurement) {
		this.description = description;
		this.amount = amount;
		this.unitOfMeasurement = unitOfMeasurement;
	}


}
