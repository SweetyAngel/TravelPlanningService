package com.travel.planning.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "travels")
public class Travel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String destination;
    private LocalDate startDate;
    private LocalDate endDate;
    private String description;
    private String transportType;
    
    // Геттеры и сеттеры
}
