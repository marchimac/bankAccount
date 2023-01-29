package com.example.bankaccount;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        BankAccountService bankAccountService = new BankAccountServiceImpl();

        List<BankAccount> articles = bankAccountService.findAll();
        System.out.println("Hay un total de " + articles.size() + " artículos.");
        for (BankAccount article : articles)
            System.out.println(article);
    }
}
