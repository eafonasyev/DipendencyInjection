package com.eafonasyev.demo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceProperty implements GreetingService {
    @Override
    public String getGreeting() {
        return "My GreetingService Hello Constractor";
    }

}
