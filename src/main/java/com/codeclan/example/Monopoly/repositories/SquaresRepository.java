package com.codeclan.example.Monopoly.repositories;

import com.codeclan.example.Monopoly.models.Squares;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SquaresRepository extends JpaRepository<Squares, Long> {
}
