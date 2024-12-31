package com.barun.app.service;

import com.barun.app.entity.Cars;
import com.barun.app.repo.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public List<Cars> getAllCars(){
        return carRepository.findAll();
    }

    public Optional<Cars> findCarByCarModel(String carsDetails){
        return carRepository.findCarByCarModel(carsDetails);
    }

    @Transactional
    public Cars createCarData(Cars cars){
        return carRepository.save(cars);
    }
}