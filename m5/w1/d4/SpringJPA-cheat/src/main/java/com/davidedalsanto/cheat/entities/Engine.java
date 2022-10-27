package com.davidedalsanto.cheat.entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "engines")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Engine {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Enumerated(EnumType.STRING)
	private Alimentazioni alim;
	
	private int cilindrata;
	
	@OneToOne(mappedBy = "engine")
	private Car car;

	public Engine(Alimentazioni alim, int cilindrata) {
		this.alim = alim;
		this.cilindrata = cilindrata;
	}
	
	
}
