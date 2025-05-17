package com.travel.planning.controller;

import com.travel.planning.dto.FriendDto;
import com.travel.planning.repository.UserRepository;
import com.travel.planning.service.FriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/friends")
public class FriendController {

    @Autowired
    private FriendService friendService;
    private UserRepository userRepository;

    // POST /api/friends/create?friend1_id={}&friend2_id={}
    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<?> createFriendship(
            @RequestParam String friend1_id,
            @RequestParam String friend2_id) {
        if (!userRepository.existsById(Long.parseLong(friend1_id)) || !userRepository.existsById(Long.parseLong(friend2_id))) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("");
        }

        if (friendService.isAlreadyFriends(Long.parseLong(friend1_id), Long.parseLong(friend2_id))) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("");
        }

        friendService.createFriendship(Long.parseLong(friend1_id), Long.parseLong(friend2_id));
        return ResponseEntity.status(HttpStatus.CREATED).body("");
    }

    // GET /api/friends/get?id={}
    @GetMapping("/get")
    public List<FriendDto> getFriendsById(@RequestParam String id) {
        return friendService.getFriendsByUserId(Long.parseLong(id));
    }
}
