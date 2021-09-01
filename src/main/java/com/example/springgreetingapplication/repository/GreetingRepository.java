package com.example.springgreetingapplication.repository;

import com.example.springgreetingapplication.entities.Greetings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepository extends JpaRepository<Greetings, Long> {
}
