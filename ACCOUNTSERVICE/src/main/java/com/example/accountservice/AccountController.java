package com.example.accountservice;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class AccountController {
    @Autowired
    AccountRepository accountRepository;

    @RequestMapping("/accounts")
    public Account[] all(){
        List<Account> accounts =accountRepository.getAllaccounts();
        return accounts.toArray(new Account[accounts.size()]);
    }

    @RequestMapping("/accounts/{id}")
    public Account byId(@PathVariable("id") String id){
        Account account = accountRepository.getAccount(id);
        return account;
    }
}