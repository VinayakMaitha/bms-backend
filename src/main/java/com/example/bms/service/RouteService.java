package com.example.bms.service;

import com.example.bms.model.Route;
import com.example.bms.repository.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RouteService {

    @Autowired
    private RouteRepository routeRepository;

    // Create a new route
    public Route createRoute(Route route) {
        return routeRepository.save(route);
    }

    // Get all routes
    public List<Route> getAllRoutes() {
        return routeRepository.findAll();
    }

    // Get a route by ID
    public Optional<Route> getRouteById(Integer id) {
        return routeRepository.findById(id);
    }

    // Update a route
    public Route updateRoute(Integer id, Route routeDetails) {
        Route existingRoute = routeRepository.findById(id).orElseThrow(() -> new RuntimeException("Route not found"));
        existingRoute.setRouteName(routeDetails.getRouteName());
        existingRoute.setStartPoint(routeDetails.getStartPoint());
        existingRoute.setEndPoint(routeDetails.getEndPoint());
        existingRoute.setPassengers(routeDetails.getPassengers());
        existingRoute.setDepotId(routeDetails.getDepotId());
        existingRoute.setActive(routeDetails.getActive());
        return routeRepository.save(existingRoute);
    }

    // Delete a route
    public void deleteRoute(Integer id) {
        routeRepository.deleteById(id);
    }
}
