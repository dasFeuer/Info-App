package com.barun.app.repo;

import com.barun.app.entity.Cars;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CarRepository extends JpaRepository<Cars, Long> {
    Optional<Cars> findCarByCarModel (String carModel);
    List <Cars> findCarsByCarCompany(String carCompany);
}
