package com.codeclan.example.Monopoly.controllers;

import com.codeclan.example.Monopoly.models.Cards;
import com.codeclan.example.Monopoly.models.Squares;
import com.codeclan.example.Monopoly.repositories.CardsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/cards")
public class CardsController {

    @Autowired
    CardsRepository cardsRepository;

    @GetMapping(value = "")
    public List<Cards> getCards(){
        return cardsRepository.findAll();
}
}

