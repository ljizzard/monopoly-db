package com.codeclan.example.Monopoly.models;

import javax.persistence.*;

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
    @Column (name = "rent")
    private int rent;
    @Column (name = "house1")
    private int house1;
    @Column (name = "house2")
    private int house2;
    @Column (name = "house3")
    private int house3;
    @Column (name = "house4")
    private int house4;
    @Column (name = "hotel")
    private int hotel;
    @Column (name = "build_cost")
    private int buildCost;


    public Squares(int squareNumber, String name, String setColour, int purchasePrice,
                   int rent, int house1, int house2, int house3, int house4,
                   int hotel, int buildCost){
        this.squareNumber = squareNumber;
        this.name = name;
        this.setColour = setColour;
        this.purchasePrice =purchasePrice;
        this.rent = rent;
        this.house1 = house1;
        this.house2 = house2;
        this.house3 = house3;
        this.house4 = house4;
        this.hotel = hotel;
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

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }



    public int getHouse1() {
        return house1;
    }

    public void setHouse1(int house1) {
        this.house1 = house1;
    }

    public int getHouse2() {
        return house2;
    }

    public void setHouse2(int house2) {
        this.house2 = house2;
    }

    public int getHouse3() {
        return house3;
    }

    public void setHouse3(int house3) {
        this.house3 = house3;
    }

    public int getHouse4() {
        return house4;
    }

    public void setHouse4(int house4) {
        this.house4 = house4;
    }

    public int getHotel() {
        return hotel;
    }

    public void setHotel(int hotel) {
        this.hotel = hotel;
    }
    public int getBuildCost() {
        return buildCost;
    }

    public void setBuildCost(int buildCost) {
        this.buildCost = buildCost;
    }

}
