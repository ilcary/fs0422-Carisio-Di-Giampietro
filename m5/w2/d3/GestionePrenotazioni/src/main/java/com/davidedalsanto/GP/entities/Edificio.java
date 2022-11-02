package com.davidedalsanto.GP.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * id
 * nome
 * indirizzo
 * citta
 * */
@Entity
@Table(name = "edifici")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Edificio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String nome;
	
	//capire se cosi ok o fare entita'
	private String indirizzo;
	
	private String city;
	
	@OneToMany(mappedBy = "edificio")
	@JsonBackReference
	private List<Postazione> postazioni;

	@Override
	public String toString() {
		return "Edificio [id=" + id + ", nome=" + nome + ", indirizzo=" + indirizzo + ", city=" + city + "]";
	}
	
	
}
