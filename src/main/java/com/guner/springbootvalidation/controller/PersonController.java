package com.guner.springbootvalidation.controller;

import com.guner.springbootvalidation.model.Person;
import com.guner.springbootvalidation.model.Person;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/person")
public class PersonController {

    @GetMapping
    public Person getPerson() {
        Person person= Person.builder().id(100L).email("rguner@gmail.com").firstName("Ramazan").lastName("Güner").build();
        return person;
    }

    @GetMapping("/responseEntity")
    public ResponseEntity<Person> getResponseEntityPerson() {
        Person person= Person.builder().id(100L).email("rguner@gmail.com").firstName("Ramazan").lastName("Güner").build();
        return new ResponseEntity<>(person, HttpStatus.OK);
    }

    @PostMapping("/update")
    public Person create(@Valid @RequestBody Person newPerson) {
        return newPerson;
    }

    @PostMapping("/responseEntityUpdate")
    public ResponseEntity<Person> createResponseEntityPerson(@Valid @RequestBody Person newPerson) {
        return new ResponseEntity<>(newPerson, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public Person update(@Valid @RequestBody Person newPerson, @PathVariable Long id) {
        return newPerson;
    }
}
