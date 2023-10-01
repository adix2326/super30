package com.example.mainoperation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//@EnableDiscoveryClient
public class MainOperationApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainOperationApplication.class, args);
        System.out.println("main crud operation");
    }

}
