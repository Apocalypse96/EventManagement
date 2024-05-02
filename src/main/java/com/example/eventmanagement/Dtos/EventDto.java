package com.example.eventmanagement.Dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EventDto {
    private String name;
    private String description;
    private String password;

    public String toString() {
        return "{ name: "+ name +", description: " + description +", password: " + password +"}";
    }
}
