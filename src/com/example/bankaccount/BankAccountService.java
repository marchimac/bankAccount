package com.example.bankaccount;

import com.example.customer.Customer;
import com.example.enums.AccountType;
import com.example.enums.Currency;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface BankAccountService {

    // Buscar TODAS las cuentas
    List<BankAccount> findAll();

    // Buscar una cuenta por su ID
    BankAccount findById(Long id);

    // Buscar una cuenta por el nif de un cliente
    List<BankAccount> findByClientNif(String nif);

    // Buscar TODAS las cuentas por el tipo de cuenta
    List<BankAccount> findAllByAccountType(AccountType type);

    // Buscar por moneda soportada
    List<BankAccount> findByCurrency(Currency currency);

    // Agrupas por tipo de cuenta
    Map<AccountType, List<BankAccount>> groupByAccountType();

    // Crear cuenta
    BankAccount create(Long id, Double balance, AccountType type, Double cost, Double interest, Customer customer, Set<Currency> supportedCurrencies);

    // Incrementar saldo
    void incrementBalance(Long id, Double amount);

    // Retirar saldo
    void decrementBalance(Long id, Double amount);

    // Actualizar cuenta
    void update(Long id, Double balance, AccountType type, Double cost, Double interest, Customer customer, Set<Currency> supportedCurrencies);

    // Borrar cuenta
    void delete(Long id);

    // Trasferir entre cuentas
    void transfer(Long idFrom, Long idTo, Double amount);
}