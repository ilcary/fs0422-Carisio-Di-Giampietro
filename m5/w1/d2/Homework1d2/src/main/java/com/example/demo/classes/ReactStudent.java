package com.example.demo.classes;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ReactStudent extends AbstractStudent {

	@Override
	public void hello() {
		System.out.println("ciao sto studiando React :)");
		
	}

	public ReactStudent() {
		super();
	}

	public ReactStudent(String name, Gender gender, List<Topic> topics, Address address, double avg) {
		super(name, gender, topics, address, avg);
	}
	


}
