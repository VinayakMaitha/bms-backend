package com.example.bms.repository;

import com.example.bms.model.Bus;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BusRepository extends MongoRepository<Bus, Integer> {
}
