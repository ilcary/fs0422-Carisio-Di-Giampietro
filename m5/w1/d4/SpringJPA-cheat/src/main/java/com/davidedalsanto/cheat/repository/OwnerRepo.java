package com.davidedalsanto.cheat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.davidedalsanto.cheat.entities.Owner;

/*
 *  1. Mettere @Repository sopra la classe
 *  2. extendere con JpaRepository<NomeClasseRiferimento, TipoPrimaryKey>    ex. JpaRepository<Owner, Integer>
 *  3. O non mettiamo niente (ci serve per far funzionare il service)
 *  3Bis. Query specializzate vedi commento sotto
 * */

@Repository
public interface OwnerRepo extends JpaRepository<Owner, Integer>{

	
	/* Query specializzata esempio
	 * 
	 @Query(
		nativeQuery = true,
		value = "SELECT * FROM users WHERE name = :n"
	)
	public List<User> findByName(@Param("n") String n);
	 * */
}
