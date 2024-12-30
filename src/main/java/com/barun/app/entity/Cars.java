package com.barun.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cars {

    @Id
    private Long id;
    private String carModel;
    private String carCompany;
    private String companyEstablishment;

}
