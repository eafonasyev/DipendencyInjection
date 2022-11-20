package com.eafonasyev.demo.controllers;

import com.eafonasyev.demo.services.GreetingService;
import com.eafonasyev.demo.services.GreetingServicePrimary;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

private final GreetingService servicePrimary;

    public MyController(GreetingService servicePrimary) {
        this.servicePrimary = servicePrimary;
    }

    public String getGreeting() {
        return servicePrimary.getGreeting();
    }
}
