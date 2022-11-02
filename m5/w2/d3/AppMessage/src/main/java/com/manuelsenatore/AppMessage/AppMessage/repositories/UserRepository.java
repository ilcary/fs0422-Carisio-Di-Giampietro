package com.manuelsenatore.AppMessage.AppMessage.repositories;

import com.manuelsenatore.AppMessage.AppMessage.entities.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends PagingAndSortingRepository<User, Long> {

    @Query(
            nativeQuery = true,
            value = "SELECT * FROM users WHERE lower(username) LIKE %:n%"
    )
    public Page<User> findByNameAndPaginate(@Param("n") String n, Pageable p);
}
