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

import com.davidedalsanto.GP.config.utils.LogColor;
import com.davidedalsanto.GP.entities.Utente;
import com.davidedalsanto.GP.services.UtenteService;

@RestController
public class UtenteController {

	@Autowired
	UtenteService us;
		
	//------------GET-----------------
	
	@GetMapping("/api/utenti")
	public List<Utente> getAll(){
		return us.finAllUtenti();
	}
	
	@GetMapping("/api/utenti/{id}")
	public Optional<Utente> findById(@PathVariable long id){
		return us.findUtenteById(id);
	}
	
	//------------POST-----------------
	
	@PostMapping("/api/utenti")
	public Utente postUser(
			@RequestParam("fullname") String fullname, 
			@RequestParam("email") String email) 
	{
		Utente u = Utente.builder()
				.fullname(fullname)
				.email(email)
				.build();
		
		us.saveUtente(u);
		return u;
	}
	
	//------------PUT-----------------
	
	@PutMapping("/api/utenti/{id}")
	public Utente updateUtente(
			@PathVariable("id") long id,
			@RequestParam(name = "fullname", required = false) String fullname, 
			@RequestParam(name = "email", required = false) String email
			) 
	{
		
		Optional<Utente> u = us.findUtenteById(id);
		
		if(u.isPresent()) {
			Utente user = u.get();
			
			if(fullname == null && email == null) {
				user.setFullname(user.getFullname());
				user.setEmail(user.getEmail());
				us.updateUtente(user);
				return user;
			}
			else if(fullname == null) {
				user.setFullname(user.getFullname());
				user.setEmail(email);
				us.updateUtente(user);
				return user;
			}else if(email == null) {
				user.setFullname(fullname);
				user.setEmail(user.getEmail());
				us.updateUtente(user);
				return user;
			}
			
		}
		return null;
	}
	
	//------------DELETE-----------------
	
	@DeleteMapping("/api/utenti/{id}")
	public Utente deleteUtente(@PathVariable("id") long id) {
		
		Optional<Utente> u = us.findUtenteById(id);
		
		if(u.isPresent()) {
			Utente user = u.get();
			us.deleteUtente(user);
			return user;
		}
		return null;
	}
	
}
