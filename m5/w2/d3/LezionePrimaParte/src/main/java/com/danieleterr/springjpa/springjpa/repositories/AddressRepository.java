package com.danieleterr.springjpa.springjpa.repositories;


import com.danieleterr.springjpa.springjpa.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {
}
