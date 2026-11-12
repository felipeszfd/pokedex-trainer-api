package io.github.felipeszfd.pokedex_trainer_api.repository;

import io.github.felipeszfd.pokedex_trainer_api.model.Species;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeciesRepository extends JpaRepository<Species, Long> {
}
