package com.example.demo.classes;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Box {

	private int x;
	private int y;
	private String name;
	
	public Box() {}
	
	public Box(int x, int y, String name) {
		super();
		this.x = x;
		this.y = y;
		this.name = name;
	}
	
	public int area() {
		return x*y;
	}
	
	public String ucName() {
		return name.toUpperCase();
	}
	
	
}
