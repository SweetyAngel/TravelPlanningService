package com.travel.planning.dto;

import java.time.LocalDateTime;

public class ParticipantDto {
    private Long id;
    private Long userId;
    private Long votingId;
    private String role;
    private LocalDateTime joinedAt;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }

    public Long getVotingId() { return votingId; }
    public void setVotingId(Long votingId) { this.votingId = votingId; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public LocalDateTime getJoinedAt() { return joinedAt; }
    public void setJoinedAt(LocalDateTime joinedAt) { this.joinedAt = joinedAt; }
}
