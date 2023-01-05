package ro.itschool.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ro.itschool.entity.Superhero;
import ro.itschool.repository.SuperheroRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/superhero")
public class SuperheroController {


    @Autowired
    private SuperheroRepository superheroRepository;

    @GetMapping(value = "/all")
    public List<Superhero> getAllSuperheroes() {
        return superheroRepository.findAll();
    }

    @GetMapping(value = "/get-by-id/{id}")
    public void getSuperHeroById(@PathVariable Long id) {
        superheroRepository.findById(id);
    }

    @GetMapping(value = "/name")
    public List<Superhero> getSuperheroesByName(@RequestParam Superhero superhero) {
        return superheroRepository.findByName(superhero.getName());
    }

    @GetMapping(value = "/realname")
    public List<Superhero> getAllSuperheroesByRealName(@RequestParam Superhero superhero) {
        return superheroRepository.findByRealName(superhero.getRealName());
    }

    @PostMapping
    public void saveSuperhero(@RequestBody Superhero superhero) {
        superheroRepository.save(superhero);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteSuperhero(@RequestParam long id) {
        superheroRepository.deleteById(id);
    }

    @PutMapping(value = "/update")
    public void updateSuperhero(@RequestBody Superhero newSuperhero) {
        if (newSuperhero.getId() != null && superheroRepository.findById(newSuperhero.getId()).isPresent())
            superheroRepository.save(newSuperhero);
        else
            throw new RuntimeException("Superhero not found ! Try again");
    }

}
