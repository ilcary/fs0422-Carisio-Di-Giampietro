package com.manuelsenatore.security.security.services;


import com.manuelsenatore.security.security.entities.Role;
import com.manuelsenatore.security.security.entities.User;
import com.manuelsenatore.security.security.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleService {

    @Autowired
    RoleRepository rr;

    public void addRole(Role r) {
        rr.save(r);
    }
    public Optional<Role> getById(int id) {
        return rr.findById(id);
    }
}
