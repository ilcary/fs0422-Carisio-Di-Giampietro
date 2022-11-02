package com.davidedalsanto.GP.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.davidedalsanto.GP.entities.Edificio;
import com.davidedalsanto.GP.services.EdificioService;

@RestController
public class EdificioController {

	@Autowired
	EdificioService es;
	
	//------------GET-----------------
	
	@GetMapping("/api/edifici")
	public List<Edificio> getAllEdifici() {
		return es.findAllEdificios();
	}
	
	@GetMapping("/api/edifici/{id}")
	public Optional<Edificio> findById(@PathVariable long id) {
		return es.findEdificioById(id);
	}
	
	
	//------------POST-----------------
	
	@PostMapping("/api/edifici")
	public Edificio postNewEdificio(
			@RequestParam("nome") String name, 
			@RequestParam("indirizzo") String indirizzo,
			@RequestParam("city") String city
			) 
	{
		
		Edificio edi = Edificio.builder()
				.nome(name)
				.indirizzo(indirizzo)
				.city(city)
				.build();
		
		es.saveEdificio(edi);
		
		return edi;
	}
	
	//------------PUT-----------------
	
	@PutMapping("/api/edifici/{id}")
	public Edificio updateEdificio(@PathVariable("id") long id,
			@RequestParam(name = "nome", required = false) String nome, 
			@RequestParam(name = "indirizzo", required = false) String indirizzo,
			@RequestParam(name = "city", required = false) String city
			) {
		
		Optional<Edificio> edi = es.findEdificioById(id);
		
		if(edi.isPresent()) {
			
			Edificio e = edi.get();
			
			if(nome != null) {
				e.setNome(nome);
			}else {
				e.setNome(e.getNome());
			}
			
			if(indirizzo != null) {
				e.setIndirizzo(indirizzo);
			}else {
				e.setIndirizzo(e.getIndirizzo());
			}
			
			if(city != null) {
				e.setCity(city);
			}else {
				e.setCity(e.getCity());
			}
			
			es.updateEdificio(e);
			return e;		
		}
		return null;
	}
	
	//------------DELETE-----------------
	
	@DeleteMapping("/api/edifici/{id}")
	public Edificio deleteEdificioById(@PathVariable("id") long id) {
		
		Optional<Edificio> edi = es.findEdificioById(id);
		
		if(edi.isPresent()) {
			Edificio e = edi.get();
			es.deleteEdificio(e);
			return e;
		}
		
		return null;
	}
}











