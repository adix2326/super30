package com.example.accountservice;
import com.example.accountservice.AccountserviceApplication;

import java.util.List;

public interface AccountRepository {
    List<Account> getAllaccounts();

    Account getAccount(String number);


}