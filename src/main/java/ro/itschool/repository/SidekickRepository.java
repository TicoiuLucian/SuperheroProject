package ro.itschool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.itschool.entity.Sidekick;

import java.util.Optional;

public interface SidekickRepository extends JpaRepository<Sidekick, Long> {

    Optional<Sidekick> findByName(String name);
}
