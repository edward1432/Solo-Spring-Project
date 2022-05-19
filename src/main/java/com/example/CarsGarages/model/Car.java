package com.example.CarsGarages.model;

import javax.persistence.*;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private String manufacturer;
    @Column
    private String model;
    @Column
    private String owner;

    @ManyToOne
    @JoinColumn(name = "garage_id")
    private Garage garage;

    public Car(){
    }

    public Car(Long id, String manufacturer, String model, String owner, Garage garage) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.model = model;
        this.owner = owner;
        this.garage = garage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Garage getGarage() {
        return garage;
    }

    public void setGarage(Garage garage) {
        this.garage = garage;
    }
}
