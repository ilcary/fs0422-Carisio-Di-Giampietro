package com.davidedalsanto.GP.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * id
 * nome completo
 * mail
 * 
 * puo avere piu prenotazioni 
 * in corso ma non oiu di una postazione per giorno
 * */

@Entity
@Table(name = "utenti")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Utente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String fullname;
	
	private String email;
	
	@Builder.Default
	@OneToMany(mappedBy = "utente")
	@JsonBackReference
	private List<Prenotazione> prenotazioni = new ArrayList<>();
}
