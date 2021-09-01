package com.example.springgreetingapplication.services;

import com.example.springgreetingapplication.entities.Greetings;
import com.example.springgreetingapplication.entities.User;
import com.example.springgreetingapplication.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.atomic.AtomicLong;

public class greetingService implements IGreetingService{
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    @Autowired
    private GreetingRepository greetingRepository;

    @Override
    public Greetings addGreeting(User user) {
        String message = String.format(template,(user.toString().isEmpty()) ? "Hello World" : user.toString());
        return greetingRepository.save(new Greetings(counter.incrementAndGet(), message));
    }
}