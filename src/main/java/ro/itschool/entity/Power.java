package ro.itschool.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@Setter
@Entity

public class Power {
    @Id
    @GeneratedValue()
    @GetMapping (ManyToMany)
    private Long id;
    private String name;
    private String description;


}
