package ro.itschool.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.itschool.entity.Superhero;

@RestController
@RequestMapping("/Superhero")
public class SuperheroController {


    @Autowired
    private Superhero superhero;

}
