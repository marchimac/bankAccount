package com.example.bankaccount;

import com.example.customer.Customer;
import com.example.enums.AccountType;

import java.util.Date;
import java.util.List;

class BankAccount {
    private int id;
    private double balance;
    private AccountType type;
    private double cost;
    private double interest;
    private Customer customer;
    private List<String> Currency;
    private Date creationDate;

    public BankAccount(int id, double balance, AccountType type, double cost, double interest, Customer customer, List<String> Currency, Date creationDate) {
        this.id = id;
        this.balance = balance;
        this.type = type;
        this.cost = cost;
        this.interest = interest;
        this.customer = customer;
        this.Currency = Currency;
        this.creationDate = creationDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<String> getCurrency() {
        return Currency;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", balance=" + balance +
                ", type=" + type +
                ", cost=" + cost +
                ", interest=" + interest +
                ", customer=" + customer +
                ", Currency=" + Currency +
                ", creationDate=" + creationDate +
                '}';
    }
}