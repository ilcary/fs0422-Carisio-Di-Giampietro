package com.davidedalsanto.GP.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davidedalsanto.GP.entities.Postazione;
import com.davidedalsanto.GP.entities.TipoPostazione;
import com.davidedalsanto.GP.repositories.PostazioneRepo;

@Service
public class PostazioneService {

	@Autowired
	PostazioneRepo posrep;
	
	public void savePostazione(Postazione p) {
		posrep.save(p);
	}
	
	public void updatePostazione(Postazione p) {
		posrep.saveAndFlush(p);
	}
	
	public void deletePostazione(Postazione p) {
		posrep.delete(p);
	}
	
	public void deletePostazioneById(long id) {
		posrep.deleteById(id);
	}
	
	public List<Postazione> findAllPostaziones(){
		return posrep.findAll();
	}
	
	public Optional<Postazione> findByIdPostazione(long id) {
		return posrep.findById(id);
	}
	
	//testare se funziona
	public List<Postazione> findByTipoPostazione(TipoPostazione t) {
		return posrep.findByTipoPostazione(t);
	}
	
	public List<Postazione> findByTipoAndCitta(TipoPostazione t, String c){
		return posrep.findByTipoPostazioneAndCitta(t, c);
	}
	
}
