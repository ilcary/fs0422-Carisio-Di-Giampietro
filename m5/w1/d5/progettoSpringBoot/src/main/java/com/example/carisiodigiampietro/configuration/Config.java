package com.example.carisiodigiampietro.configuration;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.carisiodigiampietro.entity.Edificio;
import com.example.carisiodigiampietro.entity.Postazione;
import com.example.carisiodigiampietro.entity.Prenotazione;
import com.example.carisiodigiampietro.entity.Tipo;
import com.example.carisiodigiampietro.entity.Utente;

@Configuration
public class Config {
	


	    //     EDIFICIO
	
	@Bean
	public Edificio edificioEvilCorp() {
	return Edificio.builder()
			.citta("New York City")
			.nome("E Corp")
			.indirizzo("152 W 36th St.")
			.build();
			
}	
	
		//    POSTAZIONI

	@Bean
	public Postazione postazioneDeveloper() {
		
		return Postazione.builder()
				.descrizione("Pc Lenovo y-50 con monitor aggiuntivo e stampante a colori")
				.tipo(Tipo.PRIVATO)
				.maxOccupanti(1)
				.edificio(edificioEvilCorp())
				.build();
					
	}

	@Bean
	public Postazione postazioneGrafico() {
	
	return Postazione.builder()
			.descrizione("Pc Asus Popi-x con monitor 32 inch e tavoletta grafica")
			.tipo(Tipo.OPENSPACE)
			.maxOccupanti(1)
			.edificio(edificioEvilCorp()) 
			.build();
				
}

	@Bean
	public Postazione postazioneRiunioni() {
	
	return Postazione.builder()
			.descrizione("Tavolo ovale con poltrone ergonomiche, una lavagna e proiettore")
			.tipo(Tipo.SALA_RIUNIONI)
			.maxOccupanti(10)
			.edificio(edificioEvilCorp()) 
			.build();
				
}
	
	@Bean
	public Utente sviluppatoreJava() {
		return Utente.builder()
				.nome("Carisio Di Giampietro")
				.username("ilCary")
				.email("carisiodigiampietro@hotmail.it")
				.build();
	}
	
	
	    // PRENOTAZIONI
	
	@Bean
	public Prenotazione Prenotazione1() {
		return Prenotazione.builder()
				.postazione(postazioneDeveloper())
				.utente(sviluppatoreJava())
				.data(LocalDate.of(2022, 11, 6))
				.build();
	}
	
}
