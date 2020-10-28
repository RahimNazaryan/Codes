package com.syntax.Class13;

public class BankApplication {
    public static void main(String[] args) {

        Account rahimAccount = new Account();
        rahimAccount.accountId="001";
        rahimAccount.userName="rahim";
        rahimAccount.password="12345";
        rahimAccount.balance=1000;
        rahimAccount.typeOfAccount="Checking";
        rahimAccount.limit=123;
        boolean isLoggedIn=rahimAccount.login("rahim","12345");
        System.out.println(isLoggedIn);

        Account esmatAccount = new Account();
        esmatAccount.accountId = "002";
        esmatAccount.userName = "esmat";
        esmatAccount.password = "00000";
        esmatAccount.balance = 2000;
        esmatAccount.typeOfAccount = "Checking";
        esmatAccount.limit = 124;





    }
}
