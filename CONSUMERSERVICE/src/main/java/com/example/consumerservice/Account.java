package com.example.consumerservice;

import java.io.Serial;
import java.io.Serializable;

public class Account implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Account(Long amount, String name, String number) {
        this.amount = amount;
        this.name = name;
        this.number = number;
    }

    private Long amount;
    private String name;
    private String number;

    @Override
    public String toString() {
        return "Account{" +
                "amount=" + amount +
                ", name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

}