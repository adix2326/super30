package com.example.project1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class MyController {
    private HashMap<String, String> map1 = new HashMap<>();

    MyController(){
        map1.put("aditya1dhamale1@gmail.com", "Aditya Dhamale");
        map1.put("aditya.dhamale@mitaoe.ac.in", "Aditya Dhamale 1");
        map1.put("adityadhamale2303@gmail.com", "Aditya Dhamale 2");
    }

    @GetMapping("/hello")
    public HashMap<String, String> GetAllDetails(){
        return map1;
    }

    @GetMapping("/hello/{mail}")
    public String SingleDetail(@PathVariable String mail)
    {
        System.out.println("Hello");
        System.out.println(map1.get(mail));
        return map1.get(mail);
    }
}
