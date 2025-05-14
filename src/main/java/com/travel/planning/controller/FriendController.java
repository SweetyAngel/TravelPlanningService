package com.travel.planning.controller;

import com.travel.planning.dto.FriendDto;
import com.travel.planning.service.FriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/friends")
public class FriendController {

    @Autowired
    private FriendService friendService;

    // POST /api/friends/create?friend1_id={}&friend2_id={}
    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void createFriendship(
            @RequestParam String friend1_id,
            @RequestParam String friend2_id) {

        if (friendService.isAlreadyFriends(UUID.fromString(friend1_id), UUID.fromString(friend2_id))) {
            throw new RuntimeException("Friendship already exists");
        }

        friendService.createFriendship(UUID.fromString(friend1_id), UUID.fromString(friend2_id));
    }

    // GET /api/friends/get?id={}
    @GetMapping("/get")
    public List<FriendDto> getFriendsById(@RequestParam String id) {
        return friendService.getFriendsByUserId(UUID.fromString(id));
    }
}
