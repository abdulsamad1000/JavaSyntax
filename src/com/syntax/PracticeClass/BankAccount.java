package com.syntax.PracticeClass;

public class BankAccount {
    String name;
    String username;
    String password;
    String Balance;
    String totalCheckingAcc;
    String totalSavingAcc;

    public String getName(String abdulsamad) {
        System.out.println("please get a name");
        return name;
    }

    public void setName(String abdul12) {
        System.out.println("please set a name");
        this.name = name;
    }

    public String getUsername() {
        System.out.println("please create a username ");
        return username;
    }

    public void setUsername(String username) {
        System.out.println("your username should not be less than 10 characters");
        this.username = username;
    }

    public String getPassword() {
        System.out.println("please create a passwor");
        return password;
    }

    public void setPassword(String password) {
        System.out.println("please set a passweord that should not be more than 12 characters");
        this.password = password;
    }

    public String getBalance() {
        System.out.println("show a balance ");
        return Balance;
    }

    public void setBalance(String balance) {
        System.out.println("please show a balance");
        Balance = balance;
    }

    public String getTotalCheckingAcc() {
        System.out.println("show the total checking account balance");
        return totalCheckingAcc;
    }

    public void setTotalCheckingAcc(String totalCheckingAcc) {
        System.out.println("please show the total cheking acc balance");
        this.totalCheckingAcc = totalCheckingAcc;
    }

    public String getTotalSavingAcc() {
        System.out.println("get your saving account balance");
        return totalSavingAcc;
    }

    public void setTotalSavingAcc(String totalSavingAcc) {
        System.out.println("please show the total saving accont balance");
        this.totalSavingAcc = totalSavingAcc;
    }
}
