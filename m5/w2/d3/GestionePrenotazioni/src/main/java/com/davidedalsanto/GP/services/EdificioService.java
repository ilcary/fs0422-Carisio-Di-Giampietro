package com.davidedalsanto.GP.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davidedalsanto.GP.entities.Edificio;
import com.davidedalsanto.GP.entities.Postazione;
import com.davidedalsanto.GP.repositories.EdificioRepo;

@Service
public class EdificioService {

	@Autowired
	EdificioRepo edirep;
	
	public void saveEdificio(Edificio e) {
		edirep.save(e);
	}
	
	public void updateEdificio(Edificio e) {
		edirep.saveAndFlush(e);
	}
	
	public void deleteEdificio(Edificio e) {
		edirep.delete(e);
	}
	
	public void deleteEdificioById(long id) {
		edirep.deleteById(id);
	}
	
	public List<Edificio> findAllEdificios(){
		return edirep.findAll();
	}
	
	public Optional<Edificio> findEdificioById(long id){
		return edirep.findById(id);
	}
	
	
	//vedere se quelli sotto funzionano
	
	public List<Edificio> findEdificioByCity(String city){
		return edirep.findByCity(city);
	}
	
//	public List<Postazione> getPostazione(Edificio e){
//		return edirep.findPostazioni(e);
//	}
}
