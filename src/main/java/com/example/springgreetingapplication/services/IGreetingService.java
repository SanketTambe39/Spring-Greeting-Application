package com.example.springgreetingapplication.services;

import com.example.springgreetingapplication.entities.Greetings;
import com.example.springgreetingapplication.entities.User;

public interface IGreetingService {
    Greetings addGreeting(User user);
}
