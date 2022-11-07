package com.manuelsenatore.security.security.controllers;

import com.manuelsenatore.security.security.entities.Role;
import com.manuelsenatore.security.security.entities.RoleType;
import com.manuelsenatore.security.security.entities.User;
import com.manuelsenatore.security.security.services.RoleService;
import com.manuelsenatore.security.security.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/app")
public class PageController {

    @Autowired
    UserService us;

    @Autowired
    RoleService rs;
    
    @Autowired
    PasswordEncoder encoder;
    
    @GetMapping("/add-user")
    public String addUser() {
        User user = new User();
        user.setFirstName("John");
        user.setLastName("Pitt");
        user.setUsername("gigio");
        user.setBirthDate(new GregorianCalendar(1990, 10, 8));
        user.setActive(true);
        user.setEmail("gigi@gmail.com");
        user.setPassword(encoder.encode("prova123"));
        user.setCreditCard("12345");
        user.setWord("daniele");
        Set<Role> roles = new HashSet<Role>();
        Role admin = rs.getById(1).get();
        roles.add(admin);
        user.setRoles(roles);

        us.addUser(user);

        return "User added";
    }

    @GetMapping("/add-roles")
    public String addRoles() {
        Role roleAdmin = new Role();
        roleAdmin.setRoleType(RoleType.ROLE_ADMIN);
        rs.addRole(roleAdmin);

        Role roleUser = new Role();
        roleUser.setRoleType(RoleType.ROLE_USER);
        rs.addRole(roleUser);

        return "Roles added";
    }

    @GetMapping("/protected")
    @PreAuthorize("hasRole('ADMIN')")
    public String metodoAuth1() {
        return "se stai vedendo questo sei un admin";
    }

    @GetMapping("/user/{username}")
    //@PreAuthorize("hasRole('ADMIN')")
    public User getByUsername(@PathVariable("username") String username) {

        Optional<User> u = us.getByName(username);
        if (u.isPresent()) {
            return u.get();
        } else {
            return null;
        }
    }

    @GetMapping("/auth-info")
    @PreAuthorize("hasRole('ADMIN')")
    public String getAuthInfo() {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principal instanceof UserDetails) {
            UserDetails u = ((UserDetails) principal);
            User user = us.getByName(u.getUsername()).get();
            return String.format("id:%d, email:%s, active:%b", user.getId(), user.getEmail(), user.getActive());
        }
        return "Utente non trovato";
    }
}
