package com.eafonasyev.demo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class GreeatingServiceSetter implements GreetingService {
    @Override
    public String getGreeting() {
        return "hello GreeatingService Setters 33333";
    }
}
