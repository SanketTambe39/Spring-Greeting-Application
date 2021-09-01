package com.example.springgreetingapplication.services;

import com.example.springgreetingapplication.entities.Greetings;
import com.example.springgreetingapplication.entities.User;
import com.example.springgreetingapplication.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
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

    @Override
    public Greetings getGreetingById(Long id) {
        return greetingRepository.findById(id).get();
    }
    @Override
    public List<Greetings> getAllGreetings() {
        return greetingRepository.findAll();
    }
    @Override
    public void deleteGreeting(Long id)
    {
        greetingRepository.deleteById(id);
    }
}
