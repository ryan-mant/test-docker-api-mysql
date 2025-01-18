package com.docker.test_docker.repository;

import com.docker.test_docker.model.Subscriber;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SubscriberRepository extends JpaRepository<Subscriber, UUID> {
}
