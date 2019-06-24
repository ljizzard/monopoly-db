package com.codeclan.example.Monopoly.controllers;


import com.codeclan.example.Monopoly.models.Squares;
import com.codeclan.example.Monopoly.repositories.SquaresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.smartcardio.Card;
import java.util.List;

@RestController
@RequestMapping(value = "/squares")
public class SquaresController {


    @Autowired
    SquaresRepository squaresRepository;

    @GetMapping(value = "")
    public List<Squares> getSquares(){
        return squaresRepository.findAll();
    }
}
