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
    private List<Superhero> getAllSuperheroes() {
        return superheroRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public void getSuperHeroById (@PathVariable Long id){
        superheroRepository.findById(id);
    }

    @GetMapping(value = "/name")
    public void getSuperheroesByName(@RequestParam Superhero superhero){
        superheroRepository.findByName(superhero.getName());
    }

    @GetMapping(value = "/realname")
    public void getAllSuperheroesByRealName(@RequestParam Superhero superhero){
        superheroRepository.findByRealName(superhero.getRealName());
    }

    @PostMapping
    private void saveSuperhero(@RequestBody Superhero superhero) {
        superheroRepository.save(superhero);
    }

    @DeleteMapping(value = "/{id)")
    private void deleteSuperhero(@RequestParam long id) {
        superheroRepository.deleteById(id);
    }

    @PutMapping(value = "/update")
    private void updateSuperhero(@RequestBody Superhero newSuperhero) {
        superheroRepository.save(newSuperhero);
    }

}
