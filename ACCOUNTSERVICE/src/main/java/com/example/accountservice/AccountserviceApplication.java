package com.example.accountservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaServer
public class AccountserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(com.example.accountservice.AccountserviceApplication.class, args);
        System.out.println("account");
    }

}