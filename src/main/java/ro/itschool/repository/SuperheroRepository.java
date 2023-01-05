package ro.itschool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.itschool.entity.Superhero;

import java.util.List;

public interface SuperheroRepository extends JpaRepository<Superhero, Long> {


    List<Superhero> findByName(String name);

    List<Superhero> findByRealName(String realName);
}