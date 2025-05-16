package com.travel.planning.controller;

import com.travel.planning.dto.FriendDto;
import com.travel.planning.service.FriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

        if (friendService.isAlreadyFriends(Long.parseLong(friend1_id), Long.parseLong(friend2_id))) {
            throw new RuntimeException("Friendship already exists");
        }

        friendService.createFriendship(Long.parseLong(friend1_id), Long.parseLong(friend2_id));
    }

    // GET /api/friends/get?id={}
    @GetMapping("/get")
    public List<FriendDto> getFriendsById(@RequestParam String id) {
        return friendService.getFriendsByUserId(Long.parseLong(id));
    }
}
