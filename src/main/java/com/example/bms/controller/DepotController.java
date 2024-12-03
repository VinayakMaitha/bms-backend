package com.example.bms.controller;

import com.example.bms.model.Depot;
import com.example.bms.service.DepotService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/depots")
public class DepotController {
    private final DepotService depotService;

    public DepotController(DepotService depotService) {
        this.depotService = depotService;
    }

    @PostMapping
    public Depot addDepot(@RequestBody Depot depot) {
        return depotService.createDepot(depot);
    }

    @GetMapping
    public List<Depot> getAllDepots() {
        return depotService.getAllDepots();
    }

    @GetMapping("/{id}")
    public Depot getDepotById(@PathVariable Integer id) {
        return depotService.getDepotById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteDepot(@PathVariable Integer id) {
        depotService.deleteDepot(id);
    }
}
