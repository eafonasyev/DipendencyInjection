package com.eafonasyev.demo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("kaz")
@Service("langService")
public class GreetingServiceKaz implements GreetingService {
    @Override
    public String getGreeting() {
        return "Салем Баурым";
    }
}
