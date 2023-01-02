package ro.itschool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.itschool.entity.Superhero;

import java.util.List;

public interface SuperheroRepository extends JpaRepository<Superhero, Long> {


    void findByName(String name);

    void findByRealName(String realName);
}