package com.example.springgreetingapplication.controller;

import com.example.springgreetingapplication.entities.Greetings;
import com.example.springgreetingapplication.entities.User;
import com.example.springgreetingapplication.services.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/greeting")
public class greetingController {
    @Autowired
    private IGreetingService greetingService;

    @GetMapping(value = {"","/","/home"})
    public Greetings greeting(@RequestParam(value = "name", defaultValue = "world") String name)
    {
        User user = new User();
        user.setFirstName(name);
        return greetingService.addGreeting(user);
    }
    @GetMapping("/greetingid")
    public Greetings getGreetingById(@RequestParam(value = "id") Long id)
    {
        return greetingService.getGreetingById(id);
    }
    @GetMapping("/allgreetings")
    public List<Greetings> getAllGreetings()
    {
        return greetingService.getAllGreetings();
    }
}
