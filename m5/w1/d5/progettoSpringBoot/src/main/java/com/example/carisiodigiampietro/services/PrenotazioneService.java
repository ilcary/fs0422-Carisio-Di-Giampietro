package com.example.carisiodigiampietro.services;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.carisiodigiampietro.entity.Postazione;
import com.example.carisiodigiampietro.entity.Prenotazione;
import com.example.carisiodigiampietro.repository.PrenotazioneRepo;

@Service
public class PrenotazioneService {

	@Autowired
	private PrenotazioneRepo repo;
	
	public List<Prenotazione> findAll(){
		return (List<Prenotazione>) repo.findAll();
	}
	
	public Prenotazione findById(Long id) {
		return repo.findById(id).get();
	}
	
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
	
	public void findByPostazioneAndData(Postazione p, LocalDate d) {
		repo.findByPostazioneAndData(p, d);
	}
	
	public void savePrenotazione(Prenotazione p) throws Exception{
         
        //controllo che utente non abbia gia una prenotazione per quel giorno
        List<Prenotazione> prenot = repo.findByUtenteAndData(p.getUtente(), p.getData());
        
        //controllo che la postazione non sia gia prenotata per quel giorno
        List<Prenotazione> check = repo.findByPostazioneAndData(p.getPostazione(), p.getData());
        
        if(prenot.size() != 0 || check.size() != 0) {
            throw new Exception("c'e' gia una prenotazione");
        }else {
        	repo.save(p);
        }
        
    }
	
	public void update(Prenotazione prenotazione) {
		repo.saveAndFlush(prenotazione);
	}
	
}
