package com.example.demo.services;




import com.example.demo.commands.IngredientCommand;
import com.example.demo.model.Ingredient;

public interface IngredientService{


	IngredientCommand findByRecipeIdAndIngredientID(String recipeID, String ingredientID);

	IngredientCommand saveIngredientCommand(IngredientCommand command);

	void deleteById(String recipeid, String ingredientid);
	
}
