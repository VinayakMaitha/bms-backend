package com.example.bms.service;

import com.example.bms.model.Depot;
import com.example.bms.repository.DepotRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepotService {
    private final DepotRepository depotRepository;

    public DepotService(DepotRepository depotRepository) {
        this.depotRepository = depotRepository;
    }

    public Depot createDepot(Depot depot) {
        return depotRepository.save(depot);
    }

    public List<Depot> getAllDepots() {
        return depotRepository.findAll();
    }

    public Depot getDepotById(Integer id) {
        return depotRepository.findById(id).orElseThrow(() -> new RuntimeException("Depot not found"));
    }

    public void deleteDepot(Integer id) {
        depotRepository.deleteById(id);
    }
}
