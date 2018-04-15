package com.example.demo.services;

import java.util.Set;

import com.example.demo.commands.RecipeCommand;
import com.example.demo.model.Recipe;

public interface RecipeService {

	Set<Recipe> getRecipe();

	Recipe findById(String l);

	RecipeCommand saveRecipeCommand(RecipeCommand recipeCommand);

	RecipeCommand findCommandById(String recipeid);

	void deleteById(String id);
}
