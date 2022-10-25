package com.example.demo.classes;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class JavaStudent extends AbstractStudent {

	@Override
	public void hello() {
		System.out.println("ciao sto studiando Java :)");
		
	}

	public JavaStudent() {
		super();
	}

	public JavaStudent(String name, Gender gender, List<Topic> topics, Address address, double avg) {
		super(name, gender, topics, address, avg);
	}



	
}
