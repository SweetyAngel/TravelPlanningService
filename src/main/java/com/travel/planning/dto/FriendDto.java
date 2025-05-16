package com.travel.planning.dto;

import java.time.LocalDateTime;

public class FriendDto {
    private Long id;
    private Long friend1Id;
    private Long friend2Id;
    private LocalDateTime friendedAt;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getFriend1Id() { return friend1Id; }
    public void setFriend1Id(Long friend1Id) { this.friend1Id = friend1Id; }

    public Long getFriend2Id() { return friend2Id; }
    public void setFriend2Id(Long friend2Id) { this.friend2Id = friend2Id; }

    public LocalDateTime getFriendedAt() { return friendedAt; }
    public void setFriendedAt(LocalDateTime friendedAt) { this.friendedAt = friendedAt; }
}
