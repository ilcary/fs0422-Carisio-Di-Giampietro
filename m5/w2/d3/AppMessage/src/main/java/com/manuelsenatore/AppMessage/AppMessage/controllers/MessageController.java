package com.manuelsenatore.AppMessage.AppMessage.controllers;

import com.manuelsenatore.AppMessage.AppMessage.entities.Message;
import com.manuelsenatore.AppMessage.AppMessage.entities.User;
import com.manuelsenatore.AppMessage.AppMessage.services.MessageService;
import com.manuelsenatore.AppMessage.AppMessage.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Optional;

@RestController
@RequestMapping("/messages/")
public class MessageController {

    @Autowired
    MessageService ms;

    @Autowired
    UserService us;

    @GetMapping("{id}")
    public Optional<Message> getById(@PathVariable("id") Long id){
        return  ms.getById(id);
    }

    @GetMapping("content/{subString}")
    public Page<Message> getBySubString(@PathVariable("subString") String s, Pageable p){
        return ms.getByMessageAndPaginate(s, p);
    }

    @GetMapping("author/{username}")
    public Page<Message> getByAuthor(@PathVariable("username") String s, Pageable p){
        return ms.getByAuthorAndPaginate(s, p);
    }

    @PostMapping
    public Message postMessage(
            @RequestParam("title") String title,
            @RequestParam("content") String content,
            @RequestParam("author") Long author,
            @RequestParam("receiver") Long receiver
            ) {
        Optional<User> aut = us.getById(author);
        Optional<User> rec = us.getById(receiver);
        if(aut.isPresent() && rec.isPresent()) {
            Message m = Message.builder().
                    author(aut.get()).
                    content(content).
                    title(title).
                    sendDate(LocalDate.now()).
                    receiver(rec.get()).
                    build();
            ms.addMessage(m);
            return m;
        }
        return null;
    }
}
