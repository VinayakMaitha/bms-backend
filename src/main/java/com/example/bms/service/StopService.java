package com.example.bms.service;

import com.example.bms.model.Stop;
import com.example.bms.repository.StopRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StopService {
    private final StopRepository stopRepository;

    public StopService(StopRepository stopRepository) {
        this.stopRepository = stopRepository;
    }

    public Stop createStop(Stop stop) {
        return stopRepository.save(stop);
    }

    public List<Stop> getAllStops() {
        return stopRepository.findAll();
    }

    public Stop getStopById(Integer id) {
        return stopRepository.findById(id).orElseThrow(() -> new RuntimeException("Stop not found"));
    }

    public void deleteStop(Integer id) {
        stopRepository.deleteById(id);
    }
}
