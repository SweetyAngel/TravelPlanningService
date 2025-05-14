package com.travel.planning.service;

import com.travel.planning.dto.UserDto;
import com.travel.planning.model.User;
import com.travel.planning.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public boolean existsByUsername(String username) {
        return userRepository.findByUsername(username).isPresent();
    }

    public boolean checkLogin(String username, String password) {
        Optional<User> user = userRepository.findByUsername(username);
        return user.filter(value -> value.getPassword().equals(password)).isPresent();
    }

    public UserDto createUser(String username, String password) {
        User user = new User();
        user.setId(UUID.randomUUID());
        user.setUsername(username);
        user.setPassword(password);
        user.setCreatedAt(LocalDateTime.now());

        return convertToDto(userRepository.save(user));
    }

    public UserDto getUserById(UUID id) {
        return userRepository.findById(id).map(this::convertToDto).orElse(null);
    }

    private UserDto convertToDto(User user) {
        UserDto dto = new UserDto();
        dto.setId(user.getId());
        dto.setUsername(user.getUsername());
        dto.setCreatedAt(user.getCreatedAt().toString());
        return dto;
    }
}
