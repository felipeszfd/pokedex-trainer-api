package io.github.felipeszfd.pokedex_trainer_api.repository;

import io.github.felipeszfd.pokedex_trainer_api.model.Type;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeRepository extends JpaRepository<Type, Long> {
}
