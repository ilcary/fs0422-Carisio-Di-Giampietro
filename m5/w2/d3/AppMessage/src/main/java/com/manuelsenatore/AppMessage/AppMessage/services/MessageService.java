package com.manuelsenatore.AppMessage.AppMessage.services;

import com.manuelsenatore.AppMessage.AppMessage.entities.Message;
import com.manuelsenatore.AppMessage.AppMessage.entities.User;
import com.manuelsenatore.AppMessage.AppMessage.repositories.MessageRepository;
import com.manuelsenatore.AppMessage.AppMessage.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

//- trovare tutti i messaggi che contengono (nel titolo o nel testo) una particolare sottostringa
//        - trovare tutti i messaggi inviati da un utente recuperato tramite username

@Service
public class MessageService {

    @Autowired
    MessageRepository mr;

    public Iterable<Message> getAll() {
        return mr.findAll();
    }
    public void addMessage(Message u) {
        mr.save(u);
    }
    public Optional<Message> getById(Long id) {
        return mr.findById(id);
    }
    public void deleteById(Long id) {
        mr.deleteById(id);
    }

    public Page<Message> getByMessageAndPaginate(String n, Pageable p){
        return mr.findByMessageAndPaginate(n, p);
    }

    public Page<Message> getByAuthorAndPaginate(String n, Pageable p){
        return mr.findByAuthorAndPaginate(n, p);
    }
}
