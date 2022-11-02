package com.davidedalsanto.GP.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davidedalsanto.GP.config.utils.LogColor;
import com.davidedalsanto.GP.entities.Prenotazione;
import com.davidedalsanto.GP.entities.Utente;
import com.davidedalsanto.GP.repositories.PrenotazioneRepo;

@Service
public class PrenotazioneService {

	@Autowired
	PrenotazioneRepo prerep;
	
	@Autowired
	UtenteService uteSer;
	
	//Don't touch. Magic inside
	public void savePrenotazione(Prenotazione p) throws Exception{
		
		//controllo che utente non abbia gia una prenotazione per quel giorno
		List<Prenotazione> sameDayPrenot = prerep.findByUtenteAndData(p.getUtente(), p.getData());
		
		//controllo che la postazione non sia gia prenotata per quel giorno
		List<Prenotazione> samePostzPrenot = prerep.findByPostazioneAndData(p.getPostazione(), p.getData());
		
		if(sameDayPrenot.size() != 0 || samePostzPrenot.size() != 0) {
			throw new Exception("Impossibile prenotare, hai gia' una prenotazione in data " + p.getData() + " o la postazione e' gia prenotata");
		}else {
			prerep.save(p);
		}
		
	}
	
	
	public void updatePrenotazione(Prenotazione p) {
		prerep.saveAndFlush(p);
	}
	
	public void deletePrenotazione(Prenotazione p) {
		prerep.delete(p);
	}
	
	public void deletePrenotazioneById(long id) {
		prerep.deleteById(id);
	}
	
	public List<Prenotazione> findAllPrenotaziones(){
		return prerep.findAll();
	}
	
	public Optional<Prenotazione> finPrenotazioneById(long id) {
		return prerep.findById(id);
	}
	
	public Prenotazione getPrenotazioniByData(LocalDate data) {
		return prerep.getPrenotazioneByData(data);
	}
}
