package com.travel.planning.controller;

import com.travel.planning.dto.VotingDto;
import com.travel.planning.service.VotingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/votings")
public class VotingController {

    @Autowired
    private VotingService votingService;

    // POST /api/votings/create?id={}&title={}&description={}&end_date={}
    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void createVoting(
            @RequestParam String id,
            @RequestParam String title,
            @RequestParam String description,
            @RequestParam String end_date) {

        try {
            votingService.createVoting(
                    Long.parseLong(id),
                    title,
                    description,
                    LocalDate.parse(end_date)
            );
        } catch (Exception e) {
            throw new RuntimeException("Failed to create voting");
        }
    }

    // GET /api/votings/get?id={}
    @GetMapping("/get")
    public List<VotingDto> getVotingsByUserId(@RequestParam String id) {
        return votingService.getVotingsByUserId(Long.parseLong(id));
    }
}
