package com.example.demo.commands;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

import com.example.demo.model.Recipe;
import com.example.demo.model.UnitOfMeasurement;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
@Setter
@Getter
@NoArgsConstructor
public class IngredientCommand {

	private String ingredientID;
	private String description;
	private BigDecimal amount;
	private String recipeID;
/*	private RecipeCommand recipe;*/

	private UnitOfMeasurementCommand unitOfMeasurement;
}
