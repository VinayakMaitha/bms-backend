package com.example.bms.controller;

import com.example.bms.model.Crew;
import com.example.bms.service.CrewService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/crew")
public class CrewController {
    private final CrewService crewService;

    public CrewController(CrewService crewService) {
        this.crewService = crewService;
    }

    @PostMapping
    public Crew addCrew(@RequestBody Crew crew) {
        return crewService.createCrew(crew);
    }

    @GetMapping
    public List<Crew> getAllCrew() {
        return crewService.getAllCrew();
    }

    @GetMapping("/{id}")
    public Crew getCrewById(@PathVariable Integer id) {
        return crewService.getCrewById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteCrew(@PathVariable Integer id) {
        crewService.deleteCrew(id);
    }
}
