package com.example.demo.classes;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Component
public class Topic {
	
	private static int internalId=0;
	private int id;
	private String name;
	
	public Topic() {}
	
	public Topic(String name) {
		super();
		this.id = internalId++;
		this.name = name;
	}
	
	
	
}
