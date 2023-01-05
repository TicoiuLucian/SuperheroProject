package ro.itschool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.itschool.entity.Power;

public interface PowerRepository extends JpaRepository <Power, Long> {
}
