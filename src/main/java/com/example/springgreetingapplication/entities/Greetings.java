package com.example.springgreetingapplication.entities;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "greeting")
public class Greetings {
    @Id
    private final long id;
    private final String message;

    public Greetings(long id, String message) {
        this.id = id;
        this.message = message;
    }

    public Greetings() {
        id=0;
        message = "";
    }

    public long getId() {
        return id;
    }
    public String getMessage() {
        return message;
    }
}
