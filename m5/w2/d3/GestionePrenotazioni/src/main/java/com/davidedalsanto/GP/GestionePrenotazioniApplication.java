package com.davidedalsanto.GP;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.davidedalsanto.GP.config.ConfigTest;
import com.davidedalsanto.GP.config.utils.LogColor;
import com.davidedalsanto.GP.entities.Edificio;
import com.davidedalsanto.GP.entities.Postazione;
import com.davidedalsanto.GP.entities.Prenotazione;
import com.davidedalsanto.GP.entities.TipoPostazione;
import com.davidedalsanto.GP.entities.Utente;
import com.davidedalsanto.GP.services.EdificioService;
import com.davidedalsanto.GP.services.PostazioneService;
import com.davidedalsanto.GP.services.PrenotazioneService;
import com.davidedalsanto.GP.services.UtenteService;


@SpringBootApplication
public class GestionePrenotazioniApplication implements CommandLineRunner{
	
	@Autowired
	private PostazioneService posSer;
	@Autowired
	private UtenteService uteSer;
	@Autowired
	private EdificioService ediSer;
	@Autowired
	private PrenotazioneService preSer;

	public static void main(String[] args) {
		SpringApplication.run(GestionePrenotazioniApplication.class, args);
		System.out.println("worka");
	}

	@Override
	public void run(String... args) throws Exception {
		
		configurationTest();
		
		List<Postazione> test = posSer.findByTipoAndCitta(TipoPostazione.OPENSPACE, "Citta test");
		
		for(Postazione x : test) {
			System.out.println(x.toString() + "\n");
		}
		
	}
	
	public void configurationTest() {
		
		ApplicationContext ac = new AnnotationConfigApplicationContext(ConfigTest.class);
		
		Utente utente1 = ac.getBean("utenteTest1", Utente.class);
		Utente utente2 = ac.getBean("utenteTest2", Utente.class);
		uteSer.saveUtente(utente1);
		uteSer.saveUtente(utente2);
		
		Edificio edificioTest = ac.getBean("edificioTest", Edificio.class);
		Edificio EvilCorp = ac.getBean("edificioEvilCorp", Edificio.class);
		ediSer.saveEdificio(edificioTest);
		ediSer.saveEdificio(EvilCorp);
		
		Postazione posDeveloper = ac.getBean("postazioneDeveloper", Postazione.class);
		Postazione posGrafico = ac.getBean("postazioneGrafico", Postazione.class);
		Postazione posRiunioni = ac.getBean("postazioneRiunioni", Postazione.class);
		posSer.savePostazione(posDeveloper);
		posSer.savePostazione(posGrafico);
		posSer.savePostazione(posRiunioni);
		
		Prenotazione test1 = ac.getBean("prenotazione1", Prenotazione.class);
		Prenotazione test2 = ac.getBean("prenotazione2", Prenotazione.class);
		Prenotazione test3 = ac.getBean("prenotazione3", Prenotazione.class);
		Prenotazione test4 = ac.getBean("prenotazione4", Prenotazione.class);
		
		try {
			preSer.savePrenotazione(test1);
		} catch (Exception e) {
			LogColor.errorMessage(e.getMessage());
		}
		
		try {
			preSer.savePrenotazione(test2);
		} catch (Exception e) {
			LogColor.errorMessage(e.getMessage());
		}
		
		try {
			preSer.savePrenotazione(test3);
		} catch (Exception e) {
			LogColor.errorMessage(e.getMessage());
		}
		
		try {
			preSer.savePrenotazione(test4);
		} catch (Exception e) {
			LogColor.errorMessage(e.getMessage());
		}
		
		
		
		((AbstractApplicationContext) ac).close();
	}

}









