package com.codeclan.example.Monopoly.repositories;

import com.codeclan.example.Monopoly.models.Cards;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CardsRepository extends JpaRepository<Cards, Long> {
}
