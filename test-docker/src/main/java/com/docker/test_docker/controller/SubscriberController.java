package com.docker.test_docker.controller;

import com.docker.test_docker.model.Subscriber;
import com.docker.test_docker.repository.SubscriberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/subscriber")
@CrossOrigin("*")
@RequiredArgsConstructor
public class SubscriberController {
    private final SubscriberRepository subscriberRepository;
    @GetMapping
    public ResponseEntity<List<Subscriber>> hello() {
        return ResponseEntity.ok(subscriberRepository.findAll());
    }
    @PostMapping
    public ResponseEntity<Subscriber> save(@RequestBody Subscriber subscriber) {
        return ResponseEntity.ok(subscriberRepository.save(subscriber));
    }
}
