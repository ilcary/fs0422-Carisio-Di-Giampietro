package com.davidedalsanto.GP.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.davidedalsanto.GP.entities.Edificio;
import com.davidedalsanto.GP.entities.Postazione;

@Repository
public interface EdificioRepo extends JpaRepository<Edificio, Long>{

	public List<Edificio> findByCity(String city);
	
	//public List<Postazione> findPostazioni(Edificio e);
	
}
