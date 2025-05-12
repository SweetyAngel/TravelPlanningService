package com.travel.planning.controller;

import com.travel.planning.entity.Travel;
import com.travel.planning.repository.TravelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/travel")
public class TravelController {

    @Autowired
    private TravelRepository travelRepository;

    @GetMapping("/getRooms")
    public ResponseEntity<List<Travel>> getRooms(@RequestParam Long userId) {
        try {
            // 1. Получаем все путешествия пользователя из БД
            List<Travel> userRooms = travelRepository.findByUserId(userId);

            // 2. Если список пуст - возвращаем 204 No Content
            if (userRooms.isEmpty()) {
                return ResponseEntity.noContent().build();
            }

            // 3. Возвращаем список путешествий
            return ResponseEntity.ok(userRooms);

        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }
}