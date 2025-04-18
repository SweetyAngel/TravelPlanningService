package com.travel.planning.service;

import com.travel.planning.entity.Travel;
import com.travel.planning.repository.TravelRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TravelService {
    private final TravelRepository travelRepository;
    
    public TravelService(TravelRepository travelRepository) {
        this.travelRepository = travelRepository;
    }
    
    public List<Travel> findAll() {
        return travelRepository.findAll();
    }
    
    public Optional<Travel> findById(Long id) {
        return travelRepository.findById(id);
    }
    
    public Travel save(Travel travel) {
        return travelRepository.save(travel);
    }
    
    public void deleteById(Long id) {
        travelRepository.deleteById(id);
    }
}
