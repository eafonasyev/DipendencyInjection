package com.eafonasyev.demo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class GreetingServicePrimary implements GreetingService {
    @Override
    public String getGreeting() {
        return "PRIMARY SERVICE";
    }
}
