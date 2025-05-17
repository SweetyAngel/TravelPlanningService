package com.travel.planning.controller;

import com.travel.planning.dto.UserDto;
import com.travel.planning.model.User;
import com.travel.planning.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    // POST /api/users/create?username={}&password={}
    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<?> createUser(@RequestParam String username, @RequestParam String password) {
        if (userService.existsByUsername(username)) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("");
        }
        userService.createUser(username, password);
        return ResponseEntity.status(HttpStatus.CREATED).body("");
    }

    // GET /api/users/checkLogin?username={}&password={}
    @GetMapping("/checkLogin")
    public int checkLogin(@RequestParam String username, @RequestParam String password) {
        return userService.checkLogin(username, password) ? 1 : 0;
    }

    // GET /api/users/get?id={}
    @GetMapping("/get")
    public ResponseEntity<UserDto> getUserById(@RequestParam Long id) {
        System.out.println(id);
        return ResponseEntity.ok(userService.getUserById(id));
    }
}
