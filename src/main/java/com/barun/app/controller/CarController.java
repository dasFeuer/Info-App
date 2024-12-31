package com.barun.app.controller;

import com.barun.app.dto.CarDto;
import com.barun.app.entity.Cars;
import com.barun.app.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping
    public List<Cars> getAllCars(){
        return carService.getAllCars();
    }

    @PostMapping("/create-car-data")
    public Cars createCarDetails(Cars cars){
        return carService.createCarData(cars);
    }

    @GetMapping("/car-model")
    public Optional<Cars> findCarByCarModel (CarDto carDto){
        return carService.findCarByCarModel(String.valueOf(carDto));
    }
}
