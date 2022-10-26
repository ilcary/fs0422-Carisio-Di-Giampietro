package com.example.lezione3.components;

import org.springframework.stereotype.Component;

@Component
public abstract class Teacher implements TeacherActions{

	private String name;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
