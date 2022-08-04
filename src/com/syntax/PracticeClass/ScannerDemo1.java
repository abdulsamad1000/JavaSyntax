package com.syntax.PracticeClass;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter your age?");
        String name=scanner.next();
        System.out.println("please enter your address?");
        String address =scanner.nextLine();
        System.out.println("");
        System.out.println("your age is = " +name);
        System.out.println("please enter your address" +address);
    }
}
