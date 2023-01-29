package com.example.bankaccount;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BankAccountService bankAccountService = new BankAccountServiceImpl();

        int option;
        Scanner entrada = new Scanner(System.in);

        do {

            System.out.println("""
                    Welcome to MarchiBank
                    
                    1. Buscar TODAS las cuentas
                    
                    """);

            option = entrada.nextInt();

            if (option == 1) {

                List<BankAccount> articles = bankAccountService.findAll();
                System.out.println("Hay un total de " + articles.size() + " artículos.");
                for (BankAccount article : articles) {
                    System.out.println(article);
                }

            }

        } while (option != 13);

    }
}
