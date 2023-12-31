package com.example.consumerservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountController {
    @Autowired
    AccountRepository accountRepository;

    @GetMapping("/home")
    public List<Account> home(){
        return accountRepository.getAllAccounts();
    }

    @GetMapping("{number}")
    public Account getEmployee(@PathVariable("number") String number){
        return accountRepository.getAccount(number);
    }
}