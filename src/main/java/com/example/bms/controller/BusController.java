package com.example.bms.controller;

import com.example.bms.model.Bus;
import com.example.bms.service.BusService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/buses")
public class BusController {
    private final BusService busService;

    public BusController(BusService busService) {
        this.busService = busService;
    }

    @PostMapping
    public Bus addBus(@RequestBody Bus bus) {
        return busService.createBus(bus);
    }

    @GetMapping
    public List<Bus> getAllBuses() {
        return busService.getAllBuses();
    }

    @GetMapping("/{id}")
    public Bus getBusById(@PathVariable Integer id) {
        return busService.getBusById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteBus(@PathVariable Integer id) {
        busService.deleteBus(id);
    }
}
