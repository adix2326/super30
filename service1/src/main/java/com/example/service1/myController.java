package com.example.service1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class myController {
    @GetMapping(name = "/say", value = "/say")
    public String sayHello(){
        return "Hello from service1";
    }
}
