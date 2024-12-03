package com.example.bms.repository;

import com.example.bms.model.Stop;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StopRepository extends MongoRepository<Stop, Integer> {
}
