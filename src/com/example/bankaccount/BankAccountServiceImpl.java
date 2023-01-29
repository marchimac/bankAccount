package com.example.bankaccount;

import com.example.customer.Customer;
import com.example.enums.AccountType;
import com.example.enums.Currency;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BankAccountServiceImpl implements BankAccountService {
    private final List<BankAccount> database = new ArrayList<>();

    @Override
    public List<BankAccount> findAll() {
        return new ArrayList<>(database);
    }

    @Override
    public BankAccount findById(Long id) {
        return null;
    }

    @Override
    public List<BankAccount> findByClientNif(String nif) {
        return null;
    }

    @Override
    public List<BankAccount> findAllByAccountType(AccountType type) {
        return null;
    }

    @Override
    public List<BankAccount> findByCurrency(Currency currency) {
        return null;
    }

    @Override
    public Map<AccountType, List<BankAccount>> groupByAccountType() {
        return null;
    }

    @Override
    public BankAccount create(Long id, Double balance, AccountType type, Double cost, Double interest, Customer customer, Set<Currency> supportedCurrencies) {
        return null;
    }

    @Override
    public void incrementBalance(Long id, Double amount) {

    }

    @Override
    public void decrementBalance(Long id, Double amount) {

    }

    @Override
    public void update(Long id, Double balance, AccountType type, Double cost, Double interest, Customer customer, Set<Currency> supportedCurrencies) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void transfer(Long idFrom, Long idTo, Double amount) {

    }
}
