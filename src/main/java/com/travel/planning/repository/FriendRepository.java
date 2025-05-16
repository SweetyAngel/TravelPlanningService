package com.travel.planning.repository;

import com.travel.planning.model.Friend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FriendRepository extends JpaRepository<Friend, Long> {
    @Query("SELECT f FROM Friend f WHERE (f.friend1Id = :id1 AND f.friend2Id = :id2)")
    Friend findByFriend1IdAndFriend2Id(@Param("id1") Long id1, @Param("id2") Long id2);

    List<Friend> findByFriend1IdOrFriend2Id(Long friend1Id, Long friend2Id);
}
