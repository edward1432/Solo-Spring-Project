package com.example.CarsGarages.controller;

import com.example.CarsGarages.model.Garage;
import com.example.CarsGarages.repository.GarageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class GarageController {

    @Autowired
    GarageRepository garageRepository;

    @GetMapping
    public ResponseEntity<List<Garage>> getAllGarages(){
        List<Garage> garages = garageRepository.findAll();
        return ResponseEntity.ok().body(garages);
    }

    @PostMapping
    public ResponseEntity<Garage> createGarage(@RequestBody Garage garage){
        Garage result = garageRepository.save(garage);
        return ResponseEntity.ok().body(result);
    }
}
