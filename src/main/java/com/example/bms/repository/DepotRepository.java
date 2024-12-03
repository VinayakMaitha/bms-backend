package com.example.bms.repository;

import com.example.bms.model.Depot;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DepotRepository extends MongoRepository<Depot, Integer> {
}
