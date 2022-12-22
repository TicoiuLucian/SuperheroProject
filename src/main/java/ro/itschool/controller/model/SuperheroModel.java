package ro.itschool.controller.model;

import jakarta.persistence.*;
import ro.itschool.entity.Power;
import ro.itschool.entity.Sidekick;
import ro.itschool.entity.Weakness;

import java.util.List;

public class SuperheroModel {

    private Long id;

    private String name;

    private String realName;

    private List<Weakness> weaknesses;

    private List<Power> powers;

    private Sidekick sidekick;
}
