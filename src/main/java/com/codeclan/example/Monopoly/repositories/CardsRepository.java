package com.codeclan.example.Monopoly.repositories;

import com.codeclan.example.Monopoly.models.Cards;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardsRepository extends JpaRepository<Cards, Long> {
}
