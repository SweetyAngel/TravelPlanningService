package com.travel.planning.repository;

import com.travel.planning.model.Voting;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VotingRepository extends JpaRepository<Voting, Long> {
    List<Voting> findByCreatedBy(Long userId);
}
