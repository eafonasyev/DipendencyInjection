package com.eafonasyev.demo.controllers;

import com.eafonasyev.demo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterController {
    private GreetingService service;

    public GreetingService getService() {
        return service;
    }
    @Autowired
    @Qualifier("greeatingServiceSetter")
    public void setService(GreetingService service) {
        this.service = service;
    }
}
