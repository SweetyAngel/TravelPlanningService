package com.travel.planning.dto;

import java.util.UUID;

public class CreateFriendRequest {
    private UUID friend1Id;
    private UUID friend2Id;

    public UUID getFriend1Id() { return friend1Id; }
    public void setFriend1Id(UUID friend1Id) { this.friend1Id = friend1Id; }

    public UUID getFriend2Id() { return friend2Id; }
    public void setFriend2Id(UUID friend2Id) { this.friend2Id = friend2Id; }
}
