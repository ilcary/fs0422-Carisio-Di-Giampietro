package com.danieleterr.springjpa.springjpa.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.danieleterr.springjpa.springjpa.entities.User;

@Repository
public interface UserRepository extends PagingAndSortingRepository<User, Integer> {//second type = primary key

	@Query(
		nativeQuery = true,
		value = "SELECT * FROM users WHERE name = :n"
	)
	public List<User> findByName(@Param("n") String n);

	@Query(
			nativeQuery = true,
			value = "SELECT * FROM users WHERE lower(name) LIKE %:n%"
	)
	public Page<User> findByNameAndPaginate(@Param("n") String n, Pageable p);
}
