package ro.itschool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.itschool.entity.Weakness;

public interface WeaknessRepository extends JpaRepository<Weakness,Long> {

}
