package com.example.springbootrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AlienResource {

    @Autowired
    AlienRepository repository;

    @GetMapping("aliens")
    public List<Aliens> getAliens() {
        List<Aliens> aliens = (List<Aliens>) repository.findAll();

        return aliens;
    }
}
