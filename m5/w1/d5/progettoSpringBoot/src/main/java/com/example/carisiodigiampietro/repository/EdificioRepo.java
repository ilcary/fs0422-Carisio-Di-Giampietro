package com.example.carisiodigiampietro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.carisiodigiampietro.entity.Edificio;

@Repository
public interface EdificioRepo extends JpaRepository<Edificio, Long >{

	public List<Edificio> findByCitta(String citta);
	
}
