package com.example.bms.repository;

import com.example.bms.model.Schedule;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ScheduleRepository extends MongoRepository<Schedule, Integer> {
}
