package com.travel.planning.repository;

import com.travel.planning.entity.Travel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TravelRepository extends JpaRepository<Travel, Long> {
    List<Travel> findByUserId(Long userId);

    // Альтернативный вариант с JOIN
    @Query("SELECT t FROM Travel t JOIN t.users u WHERE u.id = :userId")
    List<Travel> findTravelsByUser(@Param("userId") Long userId);
}