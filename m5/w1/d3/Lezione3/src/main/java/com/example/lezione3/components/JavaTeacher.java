package com.example.lezione3.components;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class JavaTeacher extends Teacher {

	@Override
	public String toString() {
		return "JavaTeacher [name=" + getName() + "]";
	}

	@Override
	public void hello() {
		System.out.println("cioa sono un Java teacher!");
		
	}

	
	
}
