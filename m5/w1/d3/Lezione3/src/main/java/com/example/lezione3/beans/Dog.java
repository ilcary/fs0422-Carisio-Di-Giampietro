package com.example.lezione3.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Dog {

	private String name;
	@Autowired
	private AnimalInfo animalInfo;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public AnimalInfo getAnimalInfo() {
		return animalInfo;
	}
	public void setAnimalInfo(AnimalInfo animalInfo) {
		this.animalInfo = animalInfo;
	}
	
	@Override
	public String toString() {
		return "Dog [name=" + name + ", animalInfo=" + animalInfo + "]";
	}
	
	
	
	
}
