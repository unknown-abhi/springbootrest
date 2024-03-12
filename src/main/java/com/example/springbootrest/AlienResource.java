package com.example.springbootrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class AlienResource {

    @Autowired
    AlienRepository repository;

    @GetMapping("aliens")
    @ResponseBody
    public List<Alien> getAliens() {
        List<Alien> aliens = (List<Alien>) repository.findAll();

        return aliens;
    }

    @GetMapping("aliens/{id}")
    @ResponseBody
    public Optional<Alien> getAlien(@PathVariable("id") int id) {
        Optional<Alien> alien = repository.findById(id);

        return alien;
    }
}
