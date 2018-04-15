package com.example.demo.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Recipe {

	@Id
	private String recipeID;

	private Integer prepTime;
	private Integer cookTime;
	private Integer servings;
	private String url;
	
	private String directions;
	private String description;
	
	private Byte[] image; 
	
	private Notes notes;
	
	private Set<Ingredient> ingredient = new HashSet<>(); 
	
	private Difficulty difficulty;

	@DBRef
	public Set<Category> categories = new HashSet<>();

	public Set<Ingredient> getIngredient() {
		return ingredient;
	}

	public Recipe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setIngredient(Set<Ingredient> ingredient) {
		this.ingredient = ingredient;
	}

	public Recipe addIngredient(Ingredient ingredient) {
		//ingredient.setRecipe(this);
		this.ingredient.add(ingredient);
		return this;
	}

	public String getRecipeID() {
		return recipeID;
	}

	public void setRecipeID(String recipeID) {
		this.recipeID = recipeID;
	}

	public Integer getPrepTime() {
		return prepTime;
	}

	public void setPrepTime(Integer prepTime) {
		this.prepTime = prepTime;
	}

	public Integer getCookTime() {
		return cookTime;
	}

	public void setCookTime(Integer cookTime) {
		this.cookTime = cookTime;
	}

	public Integer getServings() {
		return servings;
	}

	public void setServings(Integer servings) {
		this.servings = servings;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDirections() {
		return directions;
	}

	public void setDirections(String directions) {
		this.directions = directions;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Byte[] getImage() {
		return image;
	}

	public void setImage(Byte[] image) {
		this.image = image;
	}

	public Notes getNotes() {
		return notes;
	}

	public void setNotes(Notes notes) {
		if (notes != null) {
			this.notes = notes;
			//notes.setRecipe(this);
		}

	}

	public Difficulty getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(Difficulty difficulty) {
		this.difficulty = difficulty;
	}

	public Set<Category> getCategory() {
		return categories;
	}

	public void setCategory(Set<Category> categories) {
		this.categories = categories;
	}

}
