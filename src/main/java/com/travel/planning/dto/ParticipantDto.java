package com.travel.planning.dto;

import java.time.LocalDateTime;
import java.util.UUID;

public class ParticipantDto {
    private UUID id;
    private UUID userId;
    private UUID votingId;
    private String role;
    private LocalDateTime joinedAt;

    // Getters and Setters
    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public UUID getUserId() { return userId; }
    public void setUserId(UUID userId) { this.userId = userId; }

    public UUID getVotingId() { return votingId; }
    public void setVotingId(UUID votingId) { this.votingId = votingId; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public LocalDateTime getJoinedAt() { return joinedAt; }
    public void setJoinedAt(LocalDateTime joinedAt) { this.joinedAt = joinedAt; }
}
