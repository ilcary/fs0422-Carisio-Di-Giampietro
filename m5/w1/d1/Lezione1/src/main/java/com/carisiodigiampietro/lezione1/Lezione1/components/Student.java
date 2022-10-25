package com.carisiodigiampietro.lezione1.Lezione1.components;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Component
@Builder
public class Student {

	private String name;
	private int[] votes;
	private Address address;
	private Work work;
	
	public Student(String name, int[] votes) {
		super();
		this.name = name;
		this.votes = votes;
	}
	
	public Student(String name, int[] votes, Address address) {
		super();
		this.name = name;
		this.votes = votes;
		this.address=address;
	}

	public Student(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}

	public Student(String name, Work work) {
		super();
		this.name = name;
		this.work = work;
	}
	
	
}
