package com.example.carisiodigiampietro.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "edificio")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Edificio {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String nome;
	private String indirizzo;
	private String citta;
	
	@OneToMany(mappedBy = "edificio",cascade = CascadeType.MERGE)
	private List<Postazione> postazioni;
	
}
