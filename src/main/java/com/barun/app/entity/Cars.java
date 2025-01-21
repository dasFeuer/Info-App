package com.barun.app.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "cars")
public class Cars {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "car_company")
    private String carCompany;

    @Column(name = "car_model")
    private String carModel;

    @Column(name = "company_establishment")
    private String companyEstablishment;

    @Column(name = "car_details")
    private String carDetails;

    public Cars(Long id, String carModel, String carCompany, String companyEstablishment, String carDetails) {
        this.id = id;
        this.carCompany = carCompany;
        this.carModel = carModel;
        this.companyEstablishment = companyEstablishment;
        this.carDetails = carDetails;
    }

    public Cars(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarCompany() {
        return carCompany;
    }

    public void setCarCompany(String carCompany) {
        this.carCompany = carCompany;
    }

    public String getCompanyEstablishment() {
        return companyEstablishment;
    }

    public void setCompanyEstablishment(String companyEstablishment) {
        this.companyEstablishment = companyEstablishment;
    }

    public String getCarDetails() {
        return carDetails;
    }

    public void setCarDetails(String carDetails) {
        this.carDetails = carDetails;
    }
}
