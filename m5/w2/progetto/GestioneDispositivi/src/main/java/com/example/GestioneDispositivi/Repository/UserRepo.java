package com.example.GestioneDispositivi.Repository;

import java.util.Optional;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.GestioneDispositivi.Models.User;

@Repository
public interface UserRepo extends PagingAndSortingRepository<User, Long>{

	public Optional<User> findByUsername(String username);
	
}
