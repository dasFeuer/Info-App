package com.barun.app.service;

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

    public Cars updateCarData(Long id, Cars cars){
        Cars car = carRepository.findById(id)
                .orElseThrow();
       car.setCarCompany(cars.getCarCompany());
       car.setCarModel(cars.getCarModel());
       car.setCompanyEstablishment(cars.getCompanyEstablishment());
       car.setCarDetails(cars.getCarDetails());
        return carRepository.save(car);
    }

    // Only update fields that are present in the request
    public Cars patchCarData(Long id, Cars updates){
        Cars existingCar = carRepository.findById(id)
                .orElseThrow();

        if(updates.getCarCompany() != null){
            existingCar.setCarCompany(updates.getCarCompany());
        }
        if(updates.getCarModel() != null){
            existingCar.setCarModel(updates.getCarModel());
        }
        if(updates.getCompanyEstablishment() != null){
            existingCar.setCompanyEstablishment(updates.getCompanyEstablishment());
        }
        if(updates.getCarDetails() != null){
            existingCar.setCarDetails(updates.getCarDetails());
        }
        return carRepository.save(existingCar);
    }



    public void deleteCarById(Long id){
        carRepository.deleteById(id);
    }

    public void deleteAllCarDetails(){
        carRepository.deleteAll();
    }
}
