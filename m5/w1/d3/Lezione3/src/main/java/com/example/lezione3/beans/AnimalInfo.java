package com.example.lezione3.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

public class AnimalInfo {
	
	//@Value("${dog2.breed}")
	private String breed;
	
	//@Value("${dog2.price}")
	private double price;
	
	public AnimalInfo(String breed, double price) {
		this.breed = breed;
		this.price = price;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "AnimalInfo [breed=" + breed + ", price=" + price + "]";
	}
	
	
	
}
