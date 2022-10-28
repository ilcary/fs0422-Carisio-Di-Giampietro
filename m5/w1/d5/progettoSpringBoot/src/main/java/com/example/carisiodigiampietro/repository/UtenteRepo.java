package com.example.carisiodigiampietro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.carisiodigiampietro.entity.Utente;

@Repository
public interface UtenteRepo extends JpaRepository<Utente, Long>{

	
	
}
