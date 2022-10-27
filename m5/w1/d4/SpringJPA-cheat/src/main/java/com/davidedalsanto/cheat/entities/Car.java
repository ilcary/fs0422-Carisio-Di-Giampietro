package com.davidedalsanto.cheat.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "cars")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "engine_id")
	private Engine engine;
	
	@OneToOne(mappedBy = "ownedCars")
	private Owner owner;
	
	public Car(Engine e) {
		this.engine = e;
	}
	
	public Car(Engine e, Owner o) {
		this.engine = e;
		this.owner = o;
	}
}
