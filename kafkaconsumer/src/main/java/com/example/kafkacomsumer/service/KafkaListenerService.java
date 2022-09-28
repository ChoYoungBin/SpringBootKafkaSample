package com.example.kafkacomsumer.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaListenerService {

    @KafkaListener(topics = "Mydata-ASSET", groupId = "asset")
    public void listenKafkaMessages(String message) {
        log.error("-_-_-_-_-_-_ Kafka message Received = {}", message);
    }
}
