package com.manuelsenatore.AppMessage.AppMessage.controllers;

import com.manuelsenatore.AppMessage.AppMessage.entities.User;
import com.manuelsenatore.AppMessage.AppMessage.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/users/")
public class UserController {

    @Autowired
    UserService us;

    @GetMapping()
    public Page<User> getAllAndPaginate(Pageable p){
       return us.getAllAndPaginate(p);
    }

    @GetMapping("name/{name}")
    public Page<User> getByNameAndPaginate(@PathVariable("name")String name, Pageable p){
        return us.getByNameAndPaginate(name, p);
    }

    @PostMapping
    public User postUser(
            @RequestParam("username") String username,
            @RequestParam(value = "birthDate", required = false)LocalDate birthDate
            ){
        User user;
        if(birthDate == null){
            user = User.builder()
                    .username(username)
                    .build();
        } else {
            user = User.builder()
                    .username(username)
                    .birthDate(birthDate)
                    .build();
        }
        us.addUser(user);
        return user;
    }
}
