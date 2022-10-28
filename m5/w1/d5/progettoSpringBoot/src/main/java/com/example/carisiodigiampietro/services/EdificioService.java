package com.example.carisiodigiampietro.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.carisiodigiampietro.entity.Edificio;
import com.example.carisiodigiampietro.repository.EdificioRepo;

@Service
public class EdificioService {

	@Autowired
	private EdificioRepo repo;
	
	public List<Edificio> findAll(){
		return (List<Edificio>) repo.findAll();
	}
	
	public Edificio findById(Long id) {
		return repo.findById(id).get();
	}
	
	public List<Edificio> findByCitta(String citta) {
		return repo.findByCitta(citta);
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
	
	public void save(Edificio edificio) {
		repo.save(edificio);
	}
	
	public void update(Edificio edificio) {
		repo.saveAndFlush(edificio);
	}
	
}
