package com.example.bms.service;

import com.example.bms.model.Bus;
import com.example.bms.repository.BusRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusService {
    private final BusRepository busRepository;

    public BusService(BusRepository busRepository) {
        this.busRepository = busRepository;
    }

    public Bus createBus(Bus bus) {
        return busRepository.save(bus);
    }

    public List<Bus> getAllBuses() {
        return busRepository.findAll();
    }

    public Bus getBusById(Integer id) {
        return busRepository.findById(id).orElseThrow(() -> new RuntimeException("Bus not found"));
    }

    public void deleteBus(Integer id) {
        busRepository.deleteById(id);
    }
}
