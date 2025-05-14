package com.travel.planning.controller;

import com.travel.planning.dto.UserDto;
import com.travel.planning.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    // POST /api/users/create?username={}&password={}
    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void createUser(@RequestParam String username, @RequestParam String password) {
        if (userService.existsByUsername(username)) {
            throw new RuntimeException("Username already exists");
        }
        userService.createUser(username, password);
    }

    // GET /api/users/checkLogin?username={}&password={}
    @GetMapping("/checkLogin")
    public int checkLogin(@RequestParam String username, @RequestParam String password) {
        return userService.checkLogin(username, password) ? 1 : 0;
    }

    // GET /api/users/get?id={}
    @GetMapping("/get")
    public UserDto getUserById(@RequestParam String id) {
        return userService.getUserById(UUID.fromString(id));
    }
}
