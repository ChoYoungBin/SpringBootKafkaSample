package com.example.kafkaproducer.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProducerController {

    private final KafkaTemplate<String, String> kafkaTemplate;

    @GetMapping("/kafka")
    public String sendKafka(@RequestParam String messages) {

        kafkaTemplate.send("Mydata-ASSET", messages);
        return "OK";
    }
}
