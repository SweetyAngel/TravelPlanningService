package com.travel.planning.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "travels")
@Getter
@Setter
public class Travel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 100)
    @Column(nullable = false)
    private String destination;

    @Column(name = "start_date", nullable = false)
    private LocalDate startDate;

    @Column(name = "end_date", nullable = false)
    private LocalDate endDate;

    @Size(max = 500)
    private String description;

    @Column(name = "transport_type")
    private String transportType;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    // Связь с пользователями (участниками путешествия)
    @ManyToMany
    @JoinTable(
            name = "user_travel",
            joinColumns = @JoinColumn(name = "travel_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id"))
    private Set<User> participants = new HashSet<>();

    // Связь с маршрутами
    @OneToMany(mappedBy = "travel", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Route> routes = new HashSet<>();

    // Конструкторы
    public Travel() {
    }

    public Travel(String destination, LocalDate startDate, LocalDate endDate) {
        this.destination = destination;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // Дополнительные методы
    public void addParticipant(User user) {
        this.participants.add(user);
        user.getTravels().add(this);
    }

    public void removeParticipant(User user) {
        this.participants.remove(user);
        user.getTravels().remove(this);
    }

    public void addRoute(Route route) {
        this.routes.add(route);
        route.setTravel(this);
    }

    public void removeRoute(Route route) {
        this.routes.remove(route);
        route.setTravel(null);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }


    @Override
    public String toString() {
        return "Travel{" +
                "id=" + id +
                ", destination='" + destination + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}