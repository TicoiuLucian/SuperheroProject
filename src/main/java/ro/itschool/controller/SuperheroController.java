package ro.itschool.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.itschool.entity.Superhero;
import ro.itschool.repository.SuperheroRepository;

import java.util.List;

@RestController
@RequestMapping("/superhero")
public class SuperheroController {


    @Autowired
    private SuperheroRepository superheroRepository;

    @GetMapping
    private List<Superhero> getAllSuperheroes() {
        return superheroRepository.findAll();
    }

}
