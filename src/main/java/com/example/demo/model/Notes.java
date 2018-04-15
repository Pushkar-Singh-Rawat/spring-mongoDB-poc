package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Notes {

	
	private String notesID;

	private String recipeNotes; //will be saved as a CLOB
	
	private Recipe recipe;

	public Notes() {
		super();
		// TODO Auto-generated constructor stub
	}
/*	public String getRecipeNotes() {
		return recipeNotes;
	}

	public void setRecipeNotes(String recipeNotes) {
		this.recipeNotes = recipeNotes;
	}


	public Long getNotesID() {
		return notesID;
	}

	public void setNotesID(Long notesID) {
		this.notesID = notesID;
	}

	public Recipe getRecipe() {
		return recipe;
	}

	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}*/
}
