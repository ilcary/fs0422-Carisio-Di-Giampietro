package com.manuelsenatore.security.security.services;

import com.manuelsenatore.security.security.entities.User;
import com.manuelsenatore.security.security.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository ur;

    public Iterable<User> getAll() {
        return ur.findAll();
    }
    public void addUser(User u) {
        ur.save(u);
    }
    public Optional<User> getById(int id) {
        return ur.findById(id);
    }
    public void deleteById(int id) {
        ur.deleteById(id);
    }

    public Optional<User> getByName(String u){
        return ur.findByUsername(u);
    }
}
