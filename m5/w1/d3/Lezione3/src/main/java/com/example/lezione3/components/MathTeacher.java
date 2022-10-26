package com.example.lezione3.components;

import org.springframework.stereotype.Component;

@Component
public class MathTeacher extends Teacher{



	@Override
	public String toString() {
		return "MathTeacher [name=" + getName() + "]";
	}

	@Override
	public void hello() {
		System.out.println("cioa sono un math teacher!");
		
	}
	
	
	
	
}
