package com.davidedalsanto.GP.services;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davidedalsanto.GP.entities.Prenotazione;
import com.davidedalsanto.GP.entities.Utente;
import com.davidedalsanto.GP.repositories.UtenteRepo;

@Service
public class UtenteService {

	@Autowired
	UtenteRepo uterep;
	
	public void saveUtente(Utente u) {
		uterep.save(u);
	}
	
	public void updateUtente(Utente u) {
		uterep.saveAndFlush(u);
	}
	
	public void deleteUtente(Utente u) {
		uterep.delete(u);
	}
	
	public void deleteUtenteById(long id) {
		uterep.deleteById(id);
	}
	
	public List<Utente> finAllUtenti(){
		return uterep.findAll();
	}
	
	public Optional<Utente> findUtenteById(long id) {
		return uterep.findById(id);
	}
	
	
	
}
