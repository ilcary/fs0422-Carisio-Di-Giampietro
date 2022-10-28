package com.example.carisiodigiampietro.entity;


import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.scheduling.annotation.Scheduled;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "postazioni")
public class Postazione {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String descrizione;
	
	@Enumerated(EnumType.STRING)
	private Tipo tipo;
	
	private int maxOccupanti;
	
	@ManyToOne
	@JoinColumn(name = "edificio_id")
	private Edificio edificio;
	
   
   
//	@Scheduled(cron = "0 0 0 * * *")
//    public void aggiurnaStato() { 
//	}
	
}
