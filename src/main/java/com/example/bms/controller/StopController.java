package com.example.bms.controller;

import com.example.bms.model.Stop;
import com.example.bms.service.StopService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/stops")
public class StopController {
    private final StopService stopService;

    public StopController(StopService stopService) {
        this.stopService = stopService;
    }

    @PostMapping
    public Stop addStop(@RequestBody Stop stop) {
        return stopService.createStop(stop);
    }

    @GetMapping
    public List<Stop> getAllStops() {
        return stopService.getAllStops();
    }

    @GetMapping("/{id}")
    public Stop getStopById(@PathVariable Integer id) {
        return stopService.getStopById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteStop(@PathVariable Integer id) {
        stopService.deleteStop(id);
    }
}
