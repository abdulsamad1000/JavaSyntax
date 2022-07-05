package com.syntax.Class4NestedIfAndScannerPractice;

import java.util.Scanner;

public class ScannerHW2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your age");
        int age=sc.nextInt();
        int age1=18;
        if (age>=18){
            System.out.println(" you wll issue them a drive license");
        }else {
            System.out.println("you will offer them to get a permite");
        }

    }
}
