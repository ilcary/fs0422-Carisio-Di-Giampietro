package com.manuelsenatore.security.security.repositories;

import com.manuelsenatore.security.security.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {


    @Query(
       "SELECT u FROM User u WHERE username LIKE concat('%', :u, '%' )"
    )
    Optional<User> findByUsername(@Param("u") String u);
}
