package com.codeclan.example.Monopoly.controllers;


import com.codeclan.example.Monopoly.repositories.SquaresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/Squares")
public class SquaresController {


    @Autowired
    SquaresRepository squaresRepository;
}
