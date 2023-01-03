package ro.itschool.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ro.itschool.entity.Sidekick;
import ro.itschool.entity.Weakness;
import ro.itschool.repository.WeaknessRepository;

import java.util.List;

@RestController
@RequestMapping(value ="/weakness")
public class WeaknessController {

    @Autowired
    private WeaknessRepository weaknessRepository;

    @GetMapping(value = "/all")
    public List<Weakness> getAllWeaknesses() {
        return weaknessRepository.findAll();
    }

    @PostMapping(value = "/save-weakness")
    public void saveWeakness(@RequestBody Weakness weakness) {
        weaknessRepository.save(weakness);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteWeakness(@PathVariable Long id){
        weaknessRepository.deleteById(id);
    }
    @PutMapping(value = "/update")
    public void updateWeakness(@RequestBody Weakness weakness){
        weaknessRepository.save(new Weakness());
    }
    }


