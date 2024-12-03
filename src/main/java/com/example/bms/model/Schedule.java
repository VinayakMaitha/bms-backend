package com.example.bms.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Getter
@Setter
@Document(collection = "schedules")
public class Schedule {
    @Id
    private Integer scheduleId;
    private Integer busId;
    private Integer crewId;
    private Integer routeId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Integer frequency;
}
