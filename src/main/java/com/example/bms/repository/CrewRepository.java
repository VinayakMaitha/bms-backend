package com.example.bms.repository;

import com.example.bms.model.Crew;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CrewRepository extends MongoRepository<Crew, Integer> {
}
