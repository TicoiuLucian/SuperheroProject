 package ro.itschool.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ro.itschool.entity.Power;
import ro.itschool.repository.PowerRepository;
import java.util.List;

@RestController
@RequestMapping(value = "/power")
public class PowerController {

    @Autowired
    private PowerRepository powerRepository;

    @GetMapping(value = "/get-all-powers")
    public List<Power> getPowers () {
        return powerRepository.findAll();
    }

    @PostMapping(value = "/save-power")
    public void savePowers(@RequestBody Power power) {
        powerRepository.save(power);
    }

    @PutMapping
    public void updatePower (@RequestBody Power power) {
        powerRepository.save(power);
    }

    @DeleteMapping (value = "/{id}")
    public void deletePower (@PathVariable Long id ){
        powerRepository.deleteById(id);
    }

}
