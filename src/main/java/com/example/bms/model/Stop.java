package com.example.bms.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "stops")
public class Stop {
    @Id
    private Integer stopId;
    private Integer routeId;
    private String stopName;
    private Integer stopOrder;
    private Float latitude;
    private Float longitude;
}
