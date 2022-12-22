package ro.itschool.scheduler;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import ro.itschool.entity.Power;
import ro.itschool.entity.Sidekick;
import ro.itschool.entity.Superhero;
import ro.itschool.entity.Weakness;
import ro.itschool.repository.SidekickRepository;
import ro.itschool.repository.SuperheroRepository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class SuperheroScheduler {

    @Autowired
    private SuperheroRepository superheroRepository;

    @Autowired
    private SidekickRepository sidekickRepository;

    @Scheduled(cron = "*/45 * * * * *")
    public void insertSuperheroEveryMinute() {

        System.out.println(LocalDateTime.now());
        System.out.println("hello");

        Faker faker = new Faker();
        Random random = new Random();

        Sidekick sidekick = new Sidekick();
        sidekick.setRealName(faker.funnyName().name());
        sidekick.setName(faker.superhero().name());

//        if (sidekickRepository.findByName(sidekick.getName()).isPresent())
//            return;

        while (sidekickRepository.findByName(sidekick.getName()).isPresent()) {
            sidekick.setName(faker.superhero().name());
        }

        List<Power> powers = new ArrayList<>();
        for (int i = 0; i < random.nextInt(1, 3); i++) {
            String fakerPower = faker.superhero().power();
            powers.stream()
                    .filter(power -> power.getName().equalsIgnoreCase(fakerPower))
                    .findAny()
                    .orElseGet(() -> {
                        powers.add(new Power(fakerPower));
                        return new Power();
                    });
        }

        List<String> weaknessList = List.of("Kryptonite", "Cats", "Bullets", "Bankruptcy", "Love",
                "Shrapnel", "Oil", "Rain"); //lista cu toate slabiciunile

        List<Weakness> weaknesses = new ArrayList<>(); //lista pe care o setez pe supererou
        for (int i = 0; i < 3; i++) {
            String randomWeakness = weaknessList.get(random.nextInt(8));
            weaknesses.stream()
                    .filter(w -> w.getName().equalsIgnoreCase(randomWeakness))
                    .findAny()
                    .orElseGet(() -> {
                        Weakness e = new Weakness(randomWeakness);
                        weaknesses.add(e);
                        return e;
                    });
        }


        Superhero superhero = new Superhero();
        superhero.setName(faker.superhero().name());
        superhero.setRealName(faker.funnyName().name());
        superhero.setSidekick(sidekick);
        superhero.setPowers(powers);
        superhero.setWeaknesses(weaknesses);

        superheroRepository.save(superhero);


    }
}
