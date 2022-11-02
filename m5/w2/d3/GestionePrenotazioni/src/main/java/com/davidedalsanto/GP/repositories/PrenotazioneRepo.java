package com.davidedalsanto.GP.repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.davidedalsanto.GP.entities.Postazione;
import com.davidedalsanto.GP.entities.Prenotazione;
import com.davidedalsanto.GP.entities.Utente;

@Repository
public interface PrenotazioneRepo extends JpaRepository<Prenotazione, Long>{

	public List<Prenotazione> findByPostazioneAndData(Postazione p, LocalDate data);
	
	//public void findPostazioneIn(List<Prenotazione> listaP, Postazione p);
	
	public Prenotazione getPrenotazioneByData(LocalDate data);
	
	public List<Prenotazione> findByUtenteAndData(Utente u, LocalDate data);
	
	public List<Prenotazione> findByUtenteAndPostazioneAndData(Utente u, Postazione p, LocalDate data);
}
