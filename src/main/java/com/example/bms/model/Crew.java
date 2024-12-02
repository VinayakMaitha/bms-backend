package com.example.bms.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "crew")
public class Crew {
    @Id
    private Integer crewId;
    private String name;
    private String role; // e.g., "Driver", "Conductor", etc.
    private String licenseNumber;
}
