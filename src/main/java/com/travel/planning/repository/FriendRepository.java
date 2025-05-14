package com.travel.planning.repository;

import com.travel.planning.model.Friend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface FriendRepository extends JpaRepository<Friend, UUID> {
    @Query("SELECT f FROM Friend f WHERE (f.friend1Id = :id1 AND f.friend2Id = :id2)")
    Friend findByFriend1IdAndFriend2Id(@Param("id1") UUID id1, @Param("id2") UUID id2);

    List<Friend> findByFriend1IdOrFriend2Id(UUID friend1Id, UUID friend2Id);
}
