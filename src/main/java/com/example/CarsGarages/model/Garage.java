package com.example.CarsGarages.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
public class Garage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private String name;
    @Column
    private int capacity;
    @JsonIgnoreProperties({"garage"})
    @OneToMany(mappedBy = "garage", cascade = CascadeType.ALL)
    private List<Car> cars;
    public Garage(){
    }

    public Garage(Long id, String name, int capacity, List<Car> cars) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.cars = cars;
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

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}
