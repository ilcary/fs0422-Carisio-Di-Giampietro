package com.example.carisiodigiampietro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.carisiodigiampietro.entity.Edificio;
import com.example.carisiodigiampietro.entity.Postazione;
import com.example.carisiodigiampietro.entity.Tipo;

@Repository
public interface PostazioneRepo extends JpaRepository<Postazione, Long>{
	
	public List<Postazione> findByTipo(Tipo t); 
	public List<Postazione> findByEdificio(Edificio c); 
	
	
	@Query(
            nativeQuery = true,
            value = "SELECT * FROM postazioni WHERE TipoPostazione = :t"
            )
    public List<Postazione> findByTipoPostazione(@Param("t")Tipo tipo);
	
	
	//public List<Postazione> findByTipoAndCitta(Tipo t,String c); 
}
