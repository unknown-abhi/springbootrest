package com.example.springbootrest;

import org.springframework.data.repository.CrudRepository;

public interface AlienRepository extends CrudRepository<Aliens, Integer> {
}