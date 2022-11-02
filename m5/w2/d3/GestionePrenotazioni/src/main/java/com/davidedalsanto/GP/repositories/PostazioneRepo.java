package com.davidedalsanto.GP.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.davidedalsanto.GP.entities.Postazione;
import com.davidedalsanto.GP.entities.TipoPostazione;

@Repository
public interface PostazioneRepo extends JpaRepository<Postazione, Long>{

	@Query(
			nativeQuery = true,
			value = "SELECT * FROM postazioni WHERE TipoPostazione = :t"
			)
	public List<Postazione> findByTipoPostazione(@Param("t")TipoPostazione tipo);
	
	@Query(
			value = "SELECT p FROM Postazione p WHERE p.edificio.city = :c AND p.tipo = :tipo"
			)
	public List<Postazione> findByTipoPostazioneAndCitta(@Param("tipo")TipoPostazione tipo, @Param("c")String citta);
}
