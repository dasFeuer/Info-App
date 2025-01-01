package com.barun.app.service;

import com.barun.app.dto.UpdateCarDto;
import com.barun.app.entity.Cars;
import com.barun.app.repo.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public List<Cars> getAllCars(){
        return carRepository.findAll();
    }

    public Optional<Cars> findCarByCarModel(String carModels){
        return carRepository.findCarByCarModel(carModels);
    }

    public Cars findCarByCarCompany(String carCompany){
        return carRepository.findCarByCarCompany(carCompany);
    }

    public Cars createCarData(Cars cars){
        return carRepository.save(cars);
    }

    // Need some changes to make it work properly
//    public Cars updateCarData(Long id, UpdateCarDto cars){
//        Cars car = carRepository.updateCar(id, cars);
//       car.setCarCompany(cars.getCarCompany());
//       car.setCarModel(cars.getCarModel());
//       car.setCompanyEstablishment(cars.getCompanyEstablishment());
//       car.setCarDetails(cars.getCarDetails());
//        return carRepository.save(car);
//    }

    public void deleteCarById(Long id){
        carRepository.deleteById(id);
    }

    public void deleteAllCarDetails(){
        carRepository.deleteAll();
    }
}
