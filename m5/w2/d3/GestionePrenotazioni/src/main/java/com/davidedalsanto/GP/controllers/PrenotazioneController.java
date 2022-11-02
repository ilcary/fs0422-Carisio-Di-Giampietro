package com.davidedalsanto.GP.controllers;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.davidedalsanto.GP.entities.Postazione;
import com.davidedalsanto.GP.entities.Prenotazione;
import com.davidedalsanto.GP.entities.Utente;
import com.davidedalsanto.GP.services.PostazioneService;
import com.davidedalsanto.GP.services.PrenotazioneService;
import com.davidedalsanto.GP.services.UtenteService;

@RestController
public class PrenotazioneController {

	@Autowired
	PrenotazioneService prS;
	
	@Autowired
	UtenteService us;
	
	@Autowired
	PostazioneService ps;
	
	//------------GET-----------------
	
	@GetMapping("api/prenotazioni")
	public List<Prenotazione> getAllPrenotazioni(){
		return prS.findAllPrenotaziones();
	}
	
	@GetMapping("api/prenotazioni/{id}")
	public Optional<Prenotazione> getPrenById(@PathVariable long id){
		
		return prS.finPrenotazioneById(id);
	}
	
	//------------POST-----------------
	
	@PostMapping("api/prenotazioni")
	public Prenotazione postNewPrenotazione(
			@RequestParam("utente_id") long ut_id,
			@RequestParam("postazione_id") long pos_id,
			@RequestParam("data") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate data
			) throws Exception {
		
		Optional<Utente> ute = us.findUtenteById(ut_id);
		Optional<Postazione> pos = ps.findByIdPostazione(pos_id);
		
		if(ute != null && pos != null) {
			
			Prenotazione pren = Prenotazione.builder()
					.utente(ute.get())
					.postazione(pos.get())
					.data(data)
					.build();
			
			prS.savePrenotazione(pren);
			return pren;
		}
		
		return null;
	}
	
	//------------PUT-----------------
	
	@PutMapping("api/prenotazioni/{id}")
	public Prenotazione updatePrenotazione(
			@PathVariable long id,
			@RequestParam(name = "utente_id", required = false) Long ut_id,
			@RequestParam(name = "postazione_id", required = false) Long pos_id,
			@RequestParam(name = "data", required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate data
			) 
	{
		
		Optional<Prenotazione> p = prS.finPrenotazioneById(id);
		
		if(p.isPresent()) {
			
			Prenotazione pren = p.get();
			
			if(ut_id != null) {
				Optional<Utente> ut = us.findUtenteById((long)ut_id);
				if(ut.isPresent()) {					
					pren.setUtente(ut.get());
				}
				//manca logica per id non corrisp
			}else {
				pren.setUtente(pren.getUtente());
			}
			
			if(pos_id != null) {
				Optional<Postazione> pos = ps.findByIdPostazione(pos_id);
				if(pos.isPresent()) {
					pren.setPostazione(pos.get());
				}
				//manca logica per id non corrisp
			}else {
				pren.setPostazione(pren.getPostazione());
			}
			
			if(data != null) {
				pren.setData(data);
			}else {
				pren.setData(pren.getData());
			}
			
			prS.updatePrenotazione(pren);
			return pren;
			
		}
		
		return null;
	}
	
	//------------DELETE-----------------
	
	@DeleteMapping("/api/prenotazioni/{id}")
	public Prenotazione deletePrenotazioneById(@PathVariable("id") long id) {

		Optional<Prenotazione> pren = prS.finPrenotazioneById(id);

		if (pren.isPresent()) {
			Prenotazione p = pren.get();
			prS.deletePrenotazione(p);
			return p;
		}

		return null;
	}
	
	
}









