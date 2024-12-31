package com.barun.app.controller;

import com.barun.app.dto.CarDto;
import com.barun.app.entity.Cars;
import com.barun.app.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping
    public List<Cars> getAllCars(){
        return carService.getAllCars();
    }

    @PostMapping("/addCar")
    public ResponseEntity<Cars> createCarDetails(@RequestBody Cars cars){
        Cars savedCars = carService.createCarData(cars);
        return ResponseEntity.ok(savedCars);
    }

    @PostMapping("/carModel")
    public Optional<Cars> findCarByCarModel (@RequestBody CarDto carDto){
        String carModel = carDto.getCarModel();
        return carService.findCarByCarModel(carModel);
    }

    @DeleteMapping("/deleteCar/{id}")
    public void deleteCarById(@PathVariable Long id){
        carService.deleteCarById(id);
    }

    @DeleteMapping("/deleteAllCars")
    public void deleteAllCarDetails(){
        carService.deleteAllCarDetails();
    }
}
