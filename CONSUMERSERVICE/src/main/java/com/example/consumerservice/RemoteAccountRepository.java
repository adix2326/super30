package com.example.consumerservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

public class RemoteAccountRepository implements AccountRepository {
    @Autowired
    protected RestTemplate restTemplate;

    protected String serviceUrl;

    public RemoteAccountRepository(String serviceUrl) {
        this.serviceUrl = serviceUrl.startsWith("https") ? serviceUrl : "http://" + serviceUrl;
    }

    @Override
    public List<Account> getAllAccounts() {
        Account[] accounts = restTemplate.getForObject(serviceUrl + "/accounts", Account[].class);
        return Arrays.asList(accounts);
    }

    @Override
    public Account getAccount(String number) {
        return restTemplate.getForObject(serviceUrl + "/accounts/{id}", Account.class, number);
    }
}