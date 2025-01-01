package com.barun.app.repo;

import com.barun.app.dto.UpdateCarDto;
import com.barun.app.entity.Cars;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CarRepository extends JpaRepository<Cars, Long> {
    Optional<Cars> findCarByCarModel (String carModel);
    public Cars findCarByCarCompany (String carCompany);
//    public Cars updateCar(Long id, UpdateCarDto updateCar);
}
