package com.example.lezione3.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("sc")
public class School {

	private String name;
	
	@Autowired
	@Qualifier("mathTeacher")
	private Teacher t;
	
	
	@Override
	public String toString() {
		return "School [name=" + name + ", teacher=" + t + "]";
	}
	
	
	
}
