package com.example.demo.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Category {

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String catgID;
	private String description;

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
