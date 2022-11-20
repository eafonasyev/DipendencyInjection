package com.eafonasyev.demo.controllers;

import com.eafonasyev.demo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyController {

    @Autowired
    @Qualifier("greetingServiceProperty")
    GreetingService greetingService ;

    public String getGreeting(){
        return greetingService.getGreeting();
    }
}
