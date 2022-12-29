package ro.itschool.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ro.itschool.entity.Sidekick;
import ro.itschool.repository.SidekickRepository;

import java.util.List;

@RestController
@RequestMapping(value = "/sidekick")
public class SidekickController {

    @Autowired
    private SidekickRepository sidekickRepository;

    @GetMapping(value = "/get-all")
    public List<Sidekick> getAllSidekick() {
        return sidekickRepository.findAll();
    }

    @GetMapping(value = "/get-by-id/{id}")
    public void getSidekickById(@PathVariable Long id) {
        sidekickRepository.findById(id);
    }

    @GetMapping(value = "/get-by-name")
    public void getSidekickByName(@RequestParam Sidekick sidekick) {
        sidekickRepository.findByName(sidekick.getName());
    }

    @PostMapping(value = "/save-sidekick")
    public void saveSidekick(@RequestBody Sidekick sidekick) {
        sidekickRepository.save(sidekick);
    }

    @PutMapping(value = "/update-sidekick")
    public void updateSidekick(@RequestBody Sidekick sidekick) {
        sidekickRepository.save(sidekick);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void deleteSidekick(@PathVariable Long id) {
        sidekickRepository.deleteById(id);
    }

}
