package com.danieleterr.springjpa.springjpa.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danieleterr.springjpa.springjpa.entities.Address;
import com.danieleterr.springjpa.springjpa.repositories.AddressRepository;

@Service
public class AddressService {

	@Autowired
	AddressRepository ar;
	
	public Optional<Address> getById(int id){
		return ar.findById(id);
	}
}
