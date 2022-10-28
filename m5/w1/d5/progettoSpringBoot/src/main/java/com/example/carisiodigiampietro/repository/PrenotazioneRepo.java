package com.example.carisiodigiampietro.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.carisiodigiampietro.entity.Postazione;
import com.example.carisiodigiampietro.entity.Prenotazione;
import com.example.carisiodigiampietro.entity.Utente;

@Repository
public interface PrenotazioneRepo extends JpaRepository<Prenotazione, Long> {

	public List<Prenotazione> findByData(LocalDate d);
	public List<Prenotazione> findByUtenteAndData(Utente utente, LocalDate data);
	public List<Prenotazione> findByPostazioneAndData(Postazione postazione, LocalDate data);
	
}
