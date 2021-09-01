package com.example.springgreetingapplication.services;

import com.example.springgreetingapplication.entities.Greetings;
import com.example.springgreetingapplication.entities.User;

import java.util.List;

public interface IGreetingService {
    Greetings addGreeting(User user);
    Greetings getGreetingById(Long id);
    List<Greetings> getAllGreetings();
    void deleteGreeting(Long id);
}
