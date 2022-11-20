package com.eafonasyev.demo.controllers;

import com.eafonasyev.demo.services.GreetingServiceProperty;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GreetingControllerTest {

    PropertyController controller;

    @BeforeEach
    void setUp() {
        controller  = new PropertyController();
        controller.greetingService = new GreetingServiceProperty();

    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}