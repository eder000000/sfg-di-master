package com.eder000000.sfgdi.services;

public class SetterInjectionGreetingService implements GreetingService {
    @Override
    public String sayGreeting(){
        return "Hello World - Setter";
    }
}
