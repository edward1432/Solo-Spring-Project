package com.example.CarsGarages.controller;

import com.example.CarsGarages.model.Car;
import com.example.CarsGarages.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cars")
public class CarController {

    @Autowired
    CarRepository carRepository;

    @GetMapping
    public ResponseEntity<List<Car>> getAllCars(){
    List<Car> cars = carRepository.findAll();
    return ResponseEntity.ok().body(cars);
    }

    @PostMapping
    public ResponseEntity<Car> createCar(@RequestBody Car car){
        Car result = carRepository.save(car);
        return ResponseEntity.ok().body(result);
    }
}