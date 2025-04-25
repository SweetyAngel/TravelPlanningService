package com.travel.planning.controller;

import com.travel.planning.entity.Travel;
import com.travel.planning.service.TravelService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/travels")
public class TravelController {
    private final TravelService travelService;
    
    public TravelController(TravelService travelService) {
        this.travelService = travelService;
    }
    
    @GetMapping
    public List<Travel> getAllTravels() {
        return travelService.findAll();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Travel> getTravelById(@PathVariable Long id) {
        return travelService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    
    @PostMapping
    public Travel createTravel(@RequestBody Travel travel) {
        return travelService.save(travel);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTravel(@PathVariable Long id) {
        travelService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
