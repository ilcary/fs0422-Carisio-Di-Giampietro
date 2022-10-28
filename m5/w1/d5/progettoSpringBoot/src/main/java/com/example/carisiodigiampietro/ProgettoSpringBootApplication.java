package com.example.carisiodigiampietro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.carisiodigiampietro.configuration.Config;
import com.example.carisiodigiampietro.entity.Edificio;
import com.example.carisiodigiampietro.entity.Postazione;
import com.example.carisiodigiampietro.entity.Prenotazione;
import com.example.carisiodigiampietro.entity.Utente;
import com.example.carisiodigiampietro.services.EdificioService;
import com.example.carisiodigiampietro.services.PostazioneServices;
import com.example.carisiodigiampietro.services.PrenotazioneService;
import com.example.carisiodigiampietro.services.UtenteService;

@SpringBootApplication
public class ProgettoSpringBootApplication implements CommandLineRunner{
	
	@Autowired
	EdificioService es;
	
	@Autowired
	PostazioneServices posts;
	
	@Autowired
	PrenotazioneService prens;
	
	@Autowired
	UtenteService us;

	public static void main(String[] args) {
		SpringApplication.run(ProgettoSpringBootApplication.class, args);
				
	}
	
	@Override
	public void run(String... args) throws Exception {
		configEvilC();
	}
	
	public Edificio configEvilC() {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
		
		Edificio Evil = ac.getBean("edificioEvilCorp", Edificio.class);
		es.save(Evil);
		
		Postazione posDeveloper = ac.getBean("postazioneDeveloper", Postazione.class);
		posts.save(posDeveloper);
		
		Postazione posGrafico = ac.getBean("postazioneGrafico", Postazione.class);
		posts.save(posGrafico);
		
		Postazione posRiunioni = ac.getBean("postazioneRiunioni", Postazione.class);
		posts.save(posRiunioni);
		
		Utente utenteCary = ac.getBean("sviluppatoreJava", Utente.class);
		us.save(utenteCary);
		
		Prenotazione prenDevJav = ac.getBean("Prenotazione1",Prenotazione.class);
		System.out.println(prenDevJav);

			try {
				prens.savePrenotazione(prenDevJav);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		
		((AnnotationConfigApplicationContext) ac).close();
		
		return Evil;
	}
	
	
	
	






}
