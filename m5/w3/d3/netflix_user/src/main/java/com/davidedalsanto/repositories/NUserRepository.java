package com.davidedalsanto.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.davidedalsanto.models.NUser;

@Repository
public interface NUserRepository extends JpaRepository<NUser, Long>{

	Optional<NUser> findByUsername(String username);

}
