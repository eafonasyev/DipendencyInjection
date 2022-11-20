package com.eafonasyev.demo.controllers;

import com.eafonasyev.demo.services.GreetingServiceProperty;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterControllerTest {

    SetterController controller;
    @BeforeEach
    void setUp() {
        controller = new SetterController();
        controller.setService(new GreetingServiceProperty());
    }

    @Test
    void setService() {
        System.out.println(controller.getService().getGreeting());
    }
}