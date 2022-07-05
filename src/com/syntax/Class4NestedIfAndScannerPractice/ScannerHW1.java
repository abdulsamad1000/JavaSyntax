package com.syntax.Class4NestedIfAndScannerPractice;

import java.util.Scanner;

public class ScannerHW1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("what is the amount of loan you need to buy a house");
        double loan=scan.nextDouble();
        int loan1=200000;
        if (loan<=200000){
            System.out.println("you would lend the money to buy a house2100 ");
        }else {
            System.out.println("you would reject the money");
        }


    }
}
