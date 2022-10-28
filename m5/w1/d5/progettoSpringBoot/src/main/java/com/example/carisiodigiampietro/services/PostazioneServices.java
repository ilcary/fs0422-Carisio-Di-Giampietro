package com.example.carisiodigiampietro.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.carisiodigiampietro.entity.Edificio;
import com.example.carisiodigiampietro.entity.Postazione;
import com.example.carisiodigiampietro.entity.Tipo;
import com.example.carisiodigiampietro.repository.PostazioneRepo;
import com.example.carisiodigiampietro.repository.PrenotazioneRepo;

@Service
public class PostazioneServices {

	@Autowired
	private PostazioneRepo repo;
	
	public List<Postazione> findAll(){
		return (List<Postazione>) repo.findAll();
	}
	
	public Postazione findById(Long id) {
		return repo.findById(id).get();
	}
	
	public List<Postazione> findByTipo(Tipo t) {
		return repo.findByTipo(t);
	}
	
//	public List<Postazione> findByTipoAndCitta(Tipo t, String c) {
//		return repo.findByTipoAndCitta(t, c);
//	}
	
	public List<Postazione> findByCittaAndTipo(String c, Tipo t){
		return repo.findByCittaAndTipo(c, t);
	}
	
	public List<Postazione> findByEdificio(Edificio e) {
		return repo.findByEdificio(e);
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
	
	public void save(Postazione postazione) {
		repo.save(postazione);
	}
	
	public void update(Postazione postazione) {
		repo.saveAndFlush(postazione);
	}
	
}
