package com.danieleterr.springjpa.springjpa.services;

import com.danieleterr.springjpa.springjpa.entities.Address;
import com.danieleterr.springjpa.springjpa.entities.User;
import com.danieleterr.springjpa.springjpa.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressService {

    @Autowired
    AddressRepository ar;

    public Optional<Address> getById(int id) {
        return ar.findById(id);
    }
}
