package com.eafonasyev.demo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceConstractor implements  GreetingService{

    @Override
    public String getGreeting() {
        return "hello GreeatingService Constractor";
    }


}
