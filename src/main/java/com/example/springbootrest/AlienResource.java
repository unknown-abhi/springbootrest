package com.example.springbootrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
}
