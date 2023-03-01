package com.guner.springbootvalidation.controller;

import com.guner.springbootvalidation.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/")
    public User getUser() {
        User user= User.builder().id(100L).email("rguner@gmail.com").firstName("Ramazan").lastName("Güner").build();
        return user;
    }
    @PostMapping("/update")
    public User create(@Valid @RequestBody User newUser) {
        //User user= User.builder().id(100L).email("rguner@gmail.com").firstName("Ramazan").lastName("Güner").build();
        return newUser;
    }

    @PutMapping("/{id}")
    public User update(@Valid @RequestBody User newUser, @PathVariable Long id) {
        return newUser;
    }
}
