package com.carisiodigiampietro.lezione1.Lezione1.beans;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Person {

	private String name;
	private int age;
	private Address address;
	
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public Person(String name,int age, Address address) {
		this(name, age);
		this.address=address;
	}
	
}
