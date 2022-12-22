package ro.itschool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.itschool.entity.Superhero;

public interface SuperheroRepository extends JpaRepository<Superhero, Long> {


}
