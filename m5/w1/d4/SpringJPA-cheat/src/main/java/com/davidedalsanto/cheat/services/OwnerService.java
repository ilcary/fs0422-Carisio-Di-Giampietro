package com.davidedalsanto.cheat.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davidedalsanto.cheat.entities.Owner;
import com.davidedalsanto.cheat.repository.OwnerRepo;

/*
 *  1. mettere @Service sopra la classe
 *  2. Fare proprietà NomeRepoRif con @Autowired
 *  3. Fare metodi per implementare pappa pronta di NomeRepoRif
 * */

@Service
public class OwnerService {

	@Autowired
	OwnerRepo or;
	
	public void saveOwner(Owner o) {
		or.save(o);
	}
	
	public List<Owner> getAll() {
		return or.findAll();
	}
	
	//DA PROVARE
	public Owner getById(long id) {
		
		Owner found = or.getReferenceById((int) id);
		
		return found;
	}
	
	//DA PROVARE
	public Optional<Owner> getById2(long id) {
		return or.findById((int) id);
	}
	
	public void deleteOwner(long id) {
		or.deleteById((int) id);
	}
	
	
}
