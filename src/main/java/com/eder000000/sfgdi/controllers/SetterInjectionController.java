package com.eder000000.sfgdi.controllers;

import com.eder000000.sfgdi.services.GreetingService;

public class SetterInjectionController {
    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
