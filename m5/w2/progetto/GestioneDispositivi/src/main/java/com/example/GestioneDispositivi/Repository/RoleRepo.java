package com.example.GestioneDispositivi.Repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.GestioneDispositivi.Models.Role;

@Repository
public interface RoleRepo extends PagingAndSortingRepository<Role, Long> {

}
