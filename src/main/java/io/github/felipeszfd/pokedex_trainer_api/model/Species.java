package io.github.felipeszfd.pokedex_trainer_api.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "species")
@Getter
@Setter
public class Species {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "pokedex_number", nullable = false, unique = true)
    private Integer pokedexNumber;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "height", nullable = false)
    private Integer height;

    @Column(name = "weight", nullable = false)
    private Integer weight;

    @Column(name = "base_hp", nullable = false)
    private Integer baseHp;

    @Column(name = "base_attack", nullable = false)
    private Integer baseAttack;

    @Column(name = "base_defense", nullable = false)
    private Integer baseDefense;

    @Column(name = "base_speed", nullable = false)
    private Integer baseSpeed;

    @Column(name = "sprite_url", nullable = false, length = 200)
    private String spriteUrl;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "species_type", joinColumns = @JoinColumn(name = "species_id"), inverseJoinColumns = @JoinColumn(name = "type_id"))
    private Set<Type> types = new HashSet<>();
}