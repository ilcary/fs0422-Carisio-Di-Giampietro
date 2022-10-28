package com.example.carisiodigiampietro.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.carisiodigiampietro.entity.Utente;
import com.example.carisiodigiampietro.repository.UtenteRepo;

@Service
public class UtenteService {

	@Autowired
	private UtenteRepo repo;
	
	public List<Utente> findAll(){
		return (List<Utente>) repo.findAll();
	}
	
	public Utente findById(Long id) {
		return repo.findById(id).get();
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
	
	public void save(Utente utente) {
		repo.save(utente);
	}
	
	public void update(Utente utente) {
		repo.saveAndFlush(utente);
	}
	
}
