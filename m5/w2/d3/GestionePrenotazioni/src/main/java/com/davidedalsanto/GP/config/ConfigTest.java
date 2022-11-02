package com.davidedalsanto.GP.config;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.davidedalsanto.GP.entities.Edificio;
import com.davidedalsanto.GP.entities.Postazione;
import com.davidedalsanto.GP.entities.Prenotazione;
import com.davidedalsanto.GP.entities.TipoPostazione;
import com.davidedalsanto.GP.entities.Utente;

@Configuration
public class ConfigTest {
	
	/*
	 * POSTAZIONI
	 * */
	@Bean
	public Postazione postazioneDeveloper() {
	        
	        return Postazione.builder()
	                .descrizione("Pc Lenovo y-50 con monitor aggiuntivo e stampante a colori")
	                .tipo(TipoPostazione.PRIVATO)
	                .maxOccupanti(1) 
	                .edificio(edificioTest())
	                .build();
	                    
	    }
	
	@Bean
	public Postazione postazioneGrafico() {
	    
	    return Postazione.builder()
	            .descrizione("Pc Asus Popi-x con monitor 32 inch e tavoletta grafica")
	            .tipo(TipoPostazione.OPENSPACE)
	            .maxOccupanti(1)
	            .edificio(edificioTest())
	            .build();
	                
	}
	
	@Bean
	public Postazione postazioneRiunioni() {
	    
	    return Postazione.builder()
	            .descrizione("Tavolo ovale con poltrone ergonomiche, una lavagna e proiettore")
	            .tipo(TipoPostazione.SALA_RIUNIONI)
	            .maxOccupanti(10) 
	            .edificio(edificioEvilCorp())
	            .build();
	                
	}
	
	/*
	 * EDIFICI
	 * */
	@Bean
    public Edificio edificioTest() {
	    return Edificio.builder()
	            .city("Citta test")
	            .nome("Edificio test")
	            .indirizzo("via test 123")
	            .build();
            
	}

	@Bean
    public Edificio edificioEvilCorp() {
	    return Edificio.builder()
	            .city("New York City")
	            .nome("E Corp")
	            .indirizzo("152 W 36th St.")
	            .build();
            
	}

	/*
	 * UTENTI
	 * */
	@Bean
	public Utente utenteTest1() {
		return Utente.builder()
				.fullname("Test Testante")
				.email("test@test.com")
				.build();
		//manca list di prenotazioni
	}
	
	@Bean
	public Utente utenteTest2() {
		return Utente.builder()
				.fullname("Test2 Testone")
				.email("test2@test.com")
				.build();
		//manca list di prenotazioni
	}

	
	/*
	 * PRENOTAZIONI
	 * */
	
	//PRENOTAZIONE 1 E 2 HANNO LO STESSO UTENTE
	//CHE PROVA A FARE DUE PRENOTAZIONI LO STESSO GIORNO SU POSTAZIONI DIVERSE
	@Bean
	public Prenotazione prenotazione1() {
		return Prenotazione.builder()
				.utente(utenteTest1())
				.postazione(postazioneDeveloper())
				.data(LocalDate.of(2022,01,01))
				.build();
	}
	
	@Bean
	public Prenotazione prenotazione2() {
		return Prenotazione.builder()
				.utente(utenteTest1())
				.postazione(postazioneGrafico())
				.data(LocalDate.of(2022,01,01))
				.build();
	}
	
	//PRENOTAZIONE 3 E 4 HANNO DUE UTENTI DIVERSI
	//UTENTE 2 PRENOTA UAN POSTAZIONE PER GIORNO X 
	//UTENTE 1 VUOLE PRENOTARE LA STESSA POSTAZIONE PER LO STESSO GIORNO
	@Bean
	public Prenotazione prenotazione3() {
		return Prenotazione.builder()
				.utente(utenteTest2())
				.postazione(postazioneDeveloper())
				.data(LocalDate.of(2022,01,02))
				.build();
	}
	
	@Bean
	public Prenotazione prenotazione4() {
		return Prenotazione.builder()
				.utente(utenteTest1())
				.postazione(postazioneDeveloper())
				.data(LocalDate.of(2022,01,02))
				.build();
	}


}
