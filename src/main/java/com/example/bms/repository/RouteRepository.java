package com.example.bms.repository;

import com.example.bms.model.Route;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RouteRepository extends MongoRepository<Route, Integer> {
    // You can add custom queries if needed
}
