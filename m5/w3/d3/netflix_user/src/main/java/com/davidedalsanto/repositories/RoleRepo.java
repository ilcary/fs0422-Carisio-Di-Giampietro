package com.davidedalsanto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.davidedalsanto.models.Role;

@Repository
public interface RoleRepo extends JpaRepository<Role, Long>{

}
