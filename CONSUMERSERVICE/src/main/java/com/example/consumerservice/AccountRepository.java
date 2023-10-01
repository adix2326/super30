package com.example.consumerservice;
import com.example.consumerservice.ConsumerserviceApplication;

import java.util.List;

public interface AccountRepository {
    List<Account> getAllAccounts();

    Account getAccount(String number);

}