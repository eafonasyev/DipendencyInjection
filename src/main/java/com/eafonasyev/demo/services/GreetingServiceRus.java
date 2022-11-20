package com.eafonasyev.demo.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile({"rus","default"})
@Service("langService")
public class GreetingServiceRus implements GreetingService {
    @Override
    public String getGreeting() {
        return " привет братья";
    }
}
