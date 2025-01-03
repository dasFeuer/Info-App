package com.barun.app.service;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class CarDataLoaderService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Value("${spring.jpa.hibernate.ddl-auto}")
    private String ddlAuto;

    @PostConstruct
    public void loadData() {
        Long count = jdbcTemplate.queryForObject("SELECT COUNT(*) FROM cars", Long.class);

        if(count == 0){
            try{
                String sql = """
                        COPY cars(car_company, car_model, company_establishment, car_details)
                        FROM 'C:\\Users\\Acer\\Documents\\cars.csv'
                        DELIMITER ','
                        CSV HEADER;
                        """;

                jdbcTemplate.execute(sql);

            } catch (Exception e){
                System.err.println("Error loading car data " + e.getMessage());
            }
        }
    }
}