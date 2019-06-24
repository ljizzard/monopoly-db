package com.codeclan.example.Monopoly.models;


import javax.persistence.*;

@Entity
@Table(name = "cards")
public class Cards {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "information")
    private String information;
    @Column(name = "method")
    private int method;
    @Column(name = "adjuster")
    private int adjuster;

    public Cards( String name, String information, int method,
                 int adjuster) {

        this.name = name;
        this.information = information;
        this.method = method;
        this.adjuster = adjuster;

    }

    public Cards() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public int getMethod() {
        return method;
    }

    public void setMethod(int method) {
        this.method = method;
    }

    public int getAdjuster() {
        return adjuster;
    }

    public void setAdjuster(int adjuster) {
        this.adjuster = adjuster;
    }


}
