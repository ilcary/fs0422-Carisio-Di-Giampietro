package com.manuelsenatore.AppMessage.AppMessage.repositories;

import com.manuelsenatore.AppMessage.AppMessage.entities.Message;
import com.manuelsenatore.AppMessage.AppMessage.entities.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends PagingAndSortingRepository<Message, Long> {
    //        - trovare tutti i messaggi inviati da un utente recuperato tramite username
    @Query(
            nativeQuery = true,
            value = "SELECT * FROM message WHERE lower(title) LIKE %:n% OR WHERE lower(content) LIKE %:n%"
    )
    public Page<Message> findByMessageAndPaginate(@Param("n") String n, Pageable p);

    @Query(
            value = "SELECT m FROM Message m WHERE m.author.username LIKE lower(concat('%', :n, '%'))"
    )
    public Page<Message> findByAuthorAndPaginate(@Param("n") String n, Pageable p);
}
