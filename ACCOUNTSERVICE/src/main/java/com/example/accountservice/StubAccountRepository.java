package com.example.accountservice;

import org.springframework.stereotype.Repository;
import java.util.*;
@Repository
public class StubAccountRepository implements AccountRepository{
    private Map<String, Account> accountByNumber = new HashMap<>();
    public StubAccountRepository(){
        Account account = new Account(1001L,"Arnav","9921153319");
        accountByNumber.put("9921153319",account);
        account = new Account(1002L,"Samarp Jain","9423461701");
        accountByNumber.put("9423461701",account);


    }
    @Override
    public Account getAccount(String number){
        return accountByNumber.get(number);
    }

    @Override
    public List<Account> getAllaccounts() {
        return new ArrayList<>(accountByNumber.values());
    }
}