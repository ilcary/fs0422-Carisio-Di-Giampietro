package Banca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class M5w3d2lezBancaApplication {

	public static void main(String[] args) {
		SpringApplication.run(M5w3d2lezBancaApplication.class, args);
	}

}
/*
 * Realizzare un'applicazione Spring Boot che consente di effettuare transazioni
 * bancarie (finte) tramite utente loggato. 
 * La classe User ha queste  caratteristiche: id, nome, cognome, username, password 
 * 
 * La classe Payment gestisce una transazione tra un utente il suo conto (gestisce le date di
 * prelievo, deposito, conto e utente). 
 * 
 * La classe BankAccount gestisce il conto di un utente. 
 * 
 * Un utente può avere più conti, e in fase di prelievo e deposito può scegliere quale conto utilizzare. 
 * 
 * Realizzare degli endpoint che consentono di visualizzare: - le info di UN utente comprensive di immagine
 * per ogni utente basate sull'id dell'utente - 
 * le info degli utenti ordinate dal più ricco al meno ricco (sommando i conti)
 *  - le transazioni effettuate
 * Realizzare un front-end che permette di invia username e password per
 * loggarsi ed effettuare transazioni. L'utente NON loggato può vedere solo le
 * GET di info
 * 
 */