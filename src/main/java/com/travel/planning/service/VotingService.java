package com.travel.planning.service;

import com.travel.planning.dto.VotingDto;
import com.travel.planning.model.Voting;
import com.travel.planning.repository.VotingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class VotingService {

    @Autowired
    private VotingRepository votingRepository;

    public void createVoting(UUID createdBy, String title, String description, LocalDate endDate) {
        Voting voting = new Voting();
        voting.setId(UUID.randomUUID());
        voting.setTitle(title);
        voting.setDescription(description);
        voting.setStartDate(LocalDate.now());
        voting.setEndDate(endDate);
        voting.setCreatedBy(createdBy);
        voting.setCreatedAt(LocalDateTime.now());

        votingRepository.save(voting);
    }

    public List<VotingDto> getVotingsByUserId(UUID userId) {
        return votingRepository.findByCreatedBy(userId).stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    private VotingDto convertToDto(Voting voting) {
        VotingDto dto = new VotingDto();
        dto.setId(voting.getId());
        dto.setTitle(voting.getTitle());
        dto.setDescription(voting.getDescription());
        dto.setStartDate(voting.getStartDate());
        dto.setEndDate(voting.getEndDate());
        dto.setCreatedBy(voting.getCreatedBy());
        dto.setCreatedAt(voting.getCreatedAt().toString());
        return dto;
    }
}
