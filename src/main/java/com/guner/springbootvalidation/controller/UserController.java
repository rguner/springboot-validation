package com.guner.springbootvalidation.controller;

import com.guner.springbootvalidation.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public User getUser() {
        User user= User.builder().id(100L).email("rguner@gmail.com").firstName("Ramazan").lastName("Güner").build();
        return user;
    }

    @GetMapping("/responseEntity")
    public ResponseEntity<User> getResponseEntityUser() {
        User user= User.builder().id(100L).email("rguner@gmail.com").firstName("Ramazan").lastName("Güner").build();
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @PostMapping("/update")
    public User create(@Valid @RequestBody User newUser) {
        return newUser;
    }

    @PostMapping("/responseEntityUpdate")
    public ResponseEntity<User> createResponseEntityUser(@Valid @RequestBody User newUser) {
        return new ResponseEntity<>(newUser, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public User update(@Valid @RequestBody User newUser, @PathVariable Long id) {
        return newUser;
    }
}
