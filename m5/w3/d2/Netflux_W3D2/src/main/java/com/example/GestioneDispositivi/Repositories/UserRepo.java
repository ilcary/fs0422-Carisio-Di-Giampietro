package com.example.GestioneDispositivi.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.GestioneDispositivi.Entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

}
