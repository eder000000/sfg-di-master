package com.eder000000.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{
@Override
    public String sayGreeting(){
        return "Hello World";
    }
}
