package com.davidedalsanto.GP.repositories;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.davidedalsanto.GP.entities.Prenotazione;
import com.davidedalsanto.GP.entities.Utente;

@Repository
public interface UtenteRepo extends JpaRepository<Utente, Long>{

	
}
