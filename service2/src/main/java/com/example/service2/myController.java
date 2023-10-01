package com.example.service2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class myController {
    @GetMapping(name = "/say", value = "/say")
    public String sayHello(){
        return "Hello from service 2";
    }
}
