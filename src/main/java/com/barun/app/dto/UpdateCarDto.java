package com.barun.app.dto;


public class UpdateCarDto {

    private String carCompany;

    private String carModel;

    private String companyEstablishment;

    private String carDetails;

    public String getCarCompany() {
        return carCompany;
    }

    public void setCarCompany(String carCompany) {
        this.carCompany = carCompany;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
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
