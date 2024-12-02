package com.example.bms.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "depots")
public class Depot {
    @Id
    private Integer depotId;
    private String depotName;
    private String location;
}
