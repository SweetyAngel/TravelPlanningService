package com.travel.planning.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "routes")
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String origin;
    private String destination;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    
    @ManyToOne
    @JoinColumn(name = "travel_id")
    private Travel travel;
    
    // Геттеры и сеттеры
}
