package com.travel.planning.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "friends")
public class Friend {

    @Id
    private UUID id;

    @Column(name = "friend1_id", nullable = false)
    private UUID friend1Id;

    @Column(name = "friend2_id", nullable = false)
    private UUID friend2Id;

    @Column(name = "friended_at", nullable = false)
    private LocalDateTime friendedAt;

    public Friend() {}

    // Геттеры и сеттеры
    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public UUID getFriend1Id() { return friend1Id; }
    public void setFriend1Id(UUID friend1Id) { this.friend1Id = friend1Id; }

    public UUID getFriend2Id() { return friend2Id; }
    public void setFriend2Id(UUID friend2Id) { this.friend2Id = friend2Id; }

    public LocalDateTime getFriendedAt() { return friendedAt; }
    public void setFriendedAt(LocalDateTime friendedAt) { this.friendedAt = friendedAt; }
}
