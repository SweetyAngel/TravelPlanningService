package com.travel.planning.dto;

import java.time.LocalDateTime;
import java.util.UUID;

public class FriendDto {
    private UUID id;
    private UUID friend1Id;
    private UUID friend2Id;
    private LocalDateTime friendedAt;

    // Getters and Setters
    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public UUID getFriend1Id() { return friend1Id; }
    public void setFriend1Id(UUID friend1Id) { this.friend1Id = friend1Id; }

    public UUID getFriend2Id() { return friend2Id; }
    public void setFriend2Id(UUID friend2Id) { this.friend2Id = friend2Id; }

    public LocalDateTime getFriendedAt() { return friendedAt; }
    public void setFriendedAt(LocalDateTime friendedAt) { this.friendedAt = friendedAt; }
}
