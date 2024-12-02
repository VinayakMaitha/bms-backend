package com.example.bms.service;

import com.example.bms.model.Crew;
import com.example.bms.repository.CrewRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrewService {
    private final CrewRepository crewRepository;

    public CrewService(CrewRepository crewRepository) {
        this.crewRepository = crewRepository;
    }

    public Crew createCrew(Crew crew) {
        return crewRepository.save(crew);
    }

    public List<Crew> getAllCrew() {
        return crewRepository.findAll();
    }

    public Crew getCrewById(Integer id) {
        return crewRepository.findById(id).orElseThrow(() -> new RuntimeException("Crew not found"));
    }

    public void deleteCrew(Integer id) {
        crewRepository.deleteById(id);
    }
}
