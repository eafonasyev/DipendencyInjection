package com.eafonasyev.demo.controllers;

import com.eafonasyev.demo.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstractorController {


    private final GreetingService service;

    public ConstractorController( @Qualifier("greetingServiceConstractor")GreetingService service) {
        this.service = service;
    }

    public String getGreeting() {
        return service.getGreeting();
    }
}
