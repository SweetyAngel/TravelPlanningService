package com.travel.planning.repository;

import com.travel.planning.model.Voting;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface VotingRepository extends JpaRepository<Voting, UUID> {
    List<Voting> findByCreatedBy(UUID userId);
}
