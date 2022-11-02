package com.danieleterr.springjpa.springjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.danieleterr.springjpa.springjpa.entities.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer>{

}
