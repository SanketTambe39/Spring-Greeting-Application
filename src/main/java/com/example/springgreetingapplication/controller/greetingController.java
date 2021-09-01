package com.example.springgreetingapplication.controller;

import com.example.springgreetingapplication.entities.Greetings;
import com.example.springgreetingapplication.entities.User;
import com.example.springgreetingapplication.services.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class greetingController {
    @Autowired
    public IGreetingService greetingService;

    @GetMapping(value = {"","/","/home"})
    public Greetings greetings(@RequestParam(value = "name", defaultValue = "world") String name)
    {
        User user = new User();
        user.setFirstName(name);
        return greetingService.addGreeting(user);
    }
}
