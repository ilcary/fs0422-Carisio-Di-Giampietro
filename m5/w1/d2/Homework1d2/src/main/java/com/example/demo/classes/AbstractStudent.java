package com.example.demo.classes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//interfaccia Student (id, name, gender, topics, address, avg)

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public abstract class AbstractStudent implements Student {
	
	private int id;
	private static int internalId=0;
	private String name;
	private Gender gender;
//	@Autowired
	private List<Topic> topics;
	
	@Autowired
	private Address address;
	private double avg;
	
	
	public void addTopic(Topic t) {
		topics.add(t);
	}


	public AbstractStudent(String name, Gender gender, List<Topic> topics, Address address, double avg) {
		super();
		this.id=internalId++;
		this.name = name;
		this.gender = gender;
		this.topics = topics;
		this.address = address;
		this.avg = avg;
	}
	

}
