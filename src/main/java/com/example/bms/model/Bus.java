package com.example.bms.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "buses")
public class Bus {
    @Id
    private Integer busId;
    private String registrationNumber;
    private String busType;
    private Integer depotId;
    private String status;
}
