package com.travel.planning.service;

import com.travel.planning.dto.FriendDto;
import com.travel.planning.model.Friend;
import com.travel.planning.repository.FriendRepository;
import com.travel.planning.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.UUID;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FriendService {

    @Autowired
    private FriendRepository friendRepository;

    @Autowired
    private UserRepository userRepository;

    public boolean isAlreadyFriends(UUID friend1Id, UUID friend2Id) {
        return friendRepository.findByFriend1IdAndFriend2Id(friend1Id, friend2Id) != null ||
               friendRepository.findByFriend1IdAndFriend2Id(friend2Id, friend1Id) != null;
    }

    public void createFriendship(UUID friend1Id, UUID friend2Id) {
        if (!userRepository.existsById(friend1Id) || !userRepository.existsById(friend2Id)) {
            throw new RuntimeException("One or both users do not exist");
        }

        Friend friend = new Friend();
        friend.setId(UUID.randomUUID());
        friend.setFriend1Id(friend1Id);
        friend.setFriend2Id(friend2Id);
        friend.setFriendedAt(LocalDateTime.now());

        friendRepository.save(friend);
    }

    public List<FriendDto> getFriendsByUserId(UUID userId) {
        return friendRepository.findByFriend1IdOrFriend2Id(userId, userId).stream()
                .map(this::convertToDto)
                .collect(java.util.stream.Collectors.toList());
    }

    public Friend findByFriend1IdAndFriend2Id(UUID friend1Id, UUID friend2Id) {
        return friendRepository.findByFriend1IdAndFriend2Id(friend1Id, friend2Id);
    }

    private FriendDto convertToDto(Friend friend) {
        FriendDto dto = new FriendDto();
        dto.setId(friend.getId());
        dto.setFriend1Id(friend.getFriend1Id());
        dto.setFriend2Id(friend.getFriend2Id());
        dto.setFriendedAt(friend.getFriendedAt());
        return dto;
    }
}
