package com.codeclan.example.Monopoly.models;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "squares")

public class Squares {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (name = "square_number", nullable = false)
    private int squareNumber;
    @Column (name = "name")
    private String name;
    @Column (name = "set_color")
    private String setColour;
    @Column (name  =  "purchase_price")
    private int purchasePrice;
    @Column (name = "rents")
    private ArrayList<Integer> rents;

    @Column (name = "build_cost")
    private int buildCost;




    public Squares(int squareNumber, String name, String setColour, int purchasePrice,
                   ArrayList<Integer> rents, int buildCost){
        this.squareNumber = squareNumber;
        this.name = name;
        this.setColour = setColour;
        this.purchasePrice =purchasePrice;
        this.rents = rents;

        this.buildCost = buildCost;

    }

    public Squares() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getSquareNumber() {
        return squareNumber;
    }

    public void setSquareNumber(int squareNumber) {
        this.squareNumber = squareNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSetColour() {
        return setColour;
    }

    public void setSetColour(String setColour) {
        this.setColour = setColour;
    }

    public int getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(int purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public ArrayList<Integer> getRents() {
        return rents;
    }

    public void setRents(ArrayList<Integer> rents) {
        this.rents = rents;
    }

    public int getBuildCost() {
        return buildCost;
    }

    public void setBuildCost(int buildCost) {
        this.buildCost = buildCost;
    }

}
