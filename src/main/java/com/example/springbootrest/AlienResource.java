package com.example.springbootrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AlienResource {

    @Autowired
    AlienRepository repository;

    @GetMapping("aliens")
    public List<Alien> getAliens() {
        List<Alien> aliens = (List<Alien>) repository.findAll();

        return aliens;
    }

    @GetMapping("aliens/{id}")
    public Optional<Alien> getAlien(@PathVariable("id") int id) {
        Optional<Alien> alien = repository.findById(id);

        return alien;
    }

    @PostMapping("alien")
    public Alien addAlien(Alien alien) {

        repository.save(alien);

        return alien;
    }
}
