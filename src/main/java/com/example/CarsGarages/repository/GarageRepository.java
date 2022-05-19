package com.example.CarsGarages.repository;

import com.example.CarsGarages.model.Garage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GarageRepository extends JpaRepository<Garage, Long> {
}
