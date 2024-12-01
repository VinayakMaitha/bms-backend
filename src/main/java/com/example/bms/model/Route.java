package com.example.bms.model;

import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Getter;

@Getter
@Setter
@Document(collection = "route")
public class Route {
    @Id
    private Integer routeId;
    private String routeName;
    private String startPoint;
    private String endPoint;
    private Integer passengers;
    private Integer depotId;
    private Boolean active;

    // Getters and Setters
}

