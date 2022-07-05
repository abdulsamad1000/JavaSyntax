package com.syntax.Class4NestedIfAndScannerPractice;

import java.util.Scanner;

public class ScannerExp1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your name");
        String name=scanner.nextLine();
        System.out.println("please enter your age");
        int age=scanner.nextInt();
        System.out.println("please enter your gender");
        char character=scanner.next().charAt(0);
        System.out.println("please enter the price of item you want");
        double price=scanner.nextDouble();
        System.out.println("please enter the boolean");
        boolean boo=scanner.nextBoolean();


    }
}
