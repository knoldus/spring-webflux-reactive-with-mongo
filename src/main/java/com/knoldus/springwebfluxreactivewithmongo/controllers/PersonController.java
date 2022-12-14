package com.knoldus.springwebfluxreactivewithmongo.controllers;

import com.knoldus.springwebfluxreactivewithmongo.models.Person;
import com.knoldus.springwebfluxreactivewithmongo.repo.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping
    public Flux<Person> index() {
        return personRepository.findAll();
    }
}
