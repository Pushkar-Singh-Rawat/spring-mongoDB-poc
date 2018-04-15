package com.example.demo.model;

import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Document
public class Category {

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	private String catgID;
	private String description;

	@DBRef
	private Set<Recipe> recipes;
	/*
	 * public Long getCatgID() { return catgID; } public void setCatgID(Long
	 * catgID) { this.catgID = catgID; } public String getDescription() { return
	 * description; } public void setDescription(String description) {
	 * this.description = description; } public Set<Recipe> getRecipe() { return
	 * recipes; } public void setRecipe(Set<Recipe> recipes) { this.recipes =
	 * recipes; }
	 */

}
