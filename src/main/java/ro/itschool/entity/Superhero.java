package ro.itschool.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Entity
@Setter
@Getter
public class Superhero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String realName;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Weakness> weaknesses;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Power> powers;

    @OneToOne(cascade = CascadeType.ALL)
    private Sidekick sidekick;


}
