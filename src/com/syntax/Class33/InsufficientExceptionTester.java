package com.syntax.Class33;

public class InsufficientExceptionTester {
    public static void main(String[] args) {
        double balance =100;
        double transferAmount =200;
        if (transferAmount>balance){
           // System.out.println("Insufficient Founds");
            throw new InsufficientFounds("Insufficient Founds");
        }else {
            System.out.println("Founds Transferred");
        }
    }
}
