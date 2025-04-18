package com.travel.planning.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {
    @KafkaListener(topics = "travel-events", groupId = "travel-group")
    public void listenTravelEvents(String message) {
        System.out.println("Received Travel Event: " + message);
    }
}
