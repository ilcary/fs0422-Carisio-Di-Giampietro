package com.davidedalsanto.GP.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.davidedalsanto.GP.entities.Edificio;
import com.davidedalsanto.GP.entities.Postazione;
import com.davidedalsanto.GP.entities.TipoPostazione;
import com.davidedalsanto.GP.services.EdificioService;
import com.davidedalsanto.GP.services.PostazioneService;

@RestController
public class PostazioneController {

	@Autowired
	PostazioneService ps;
	
	@Autowired
	EdificioService es;
	
	//------------GET-----------------

	@GetMapping("api/postazioni")
	public List<Postazione> getAllPostazioni(){
		return ps.findAllPostaziones();
	}

	@GetMapping("/api/postazioni/{id}")
	public Optional<Postazione> findById(@PathVariable long id) {
		return ps.findByIdPostazione(id);
	}
	
	//------------POST-----------------
	
	//enum funziona se scrivi nome giusto in maiuscolo
	
	@PostMapping("api/postazioni")
	public Postazione postNewPostazione(
			@RequestParam("descrizione") String desc,
			@RequestParam("tipo") TipoPostazione tipo,
			@RequestParam("maxPart") int numMaxPart,
			@RequestParam("edificio") long edificio_id
			) 
	{
		
		Optional<Edificio> edi = es.findEdificioById(edificio_id);
		Edificio e = null;
		
		if(edi.isPresent()) {
			e = edi.get();
		}
		
		Postazione pos = Postazione.builder()
				.descrizione(desc)
				.tipo(tipo)
				.maxOccupanti(numMaxPart)
				.edificio(e)
				.build();
		
		ps.savePostazione(pos);
		
		return pos;
	}
	
	//------------PUT-----------------
	
	@PutMapping("/api/postazioni/{id}")
	public Postazione updatePostazione(
			@PathVariable long id,
			@RequestParam(name ="descrizione", required = false) String desc,
			@RequestParam(name ="tipo", required = false) TipoPostazione tipo,
			@RequestParam(name ="maxPart", required = false) Integer numMaxPart,
			@RequestParam(name ="edificio_id", required = false) Long edificio_id
			) 
	{
		
		Optional<Postazione> p = ps.findByIdPostazione(id);
		
		if(p.isPresent()) {
			Postazione pos = p.get();
			
			if(desc != null) {
				pos.setDescrizione(desc);
			}else {
				pos.setDescrizione(pos.getDescrizione());
			}
			
			if(tipo != null) {
				pos.setTipo(tipo);
			}else {
				pos.setTipo(pos.getTipo());
			}
			
			if(numMaxPart != null) {
				pos.setMaxOccupanti((int)numMaxPart);
			}else {
				pos.setMaxOccupanti(pos.getMaxOccupanti());
			}
			
			if(edificio_id != null) {
				Optional<Edificio> hold = es.findEdificioById((long)edificio_id);
				if(hold.isPresent()) {
					Edificio found = hold.get();					
					pos.setEdificio(found);
				}
				//manca logica se id edificio non esiste
			}else {
				pos.setEdificio(pos.getEdificio());
			}
			ps.updatePostazione(pos);
			return pos;
		}
		return null;
	}
	
	//------------DELETE-----------------
	
	@DeleteMapping("/api/postazioni/{id}")
	public Postazione deleteEdificioById(@PathVariable("id") long id) {
		
		Optional<Postazione> pos = ps.findByIdPostazione(id);
		
		if(pos.isPresent()) {
			Postazione p = pos.get();
			ps.deletePostazione(p);
			return p;
		}
		
		return null;
	}
	
	
	
}
















