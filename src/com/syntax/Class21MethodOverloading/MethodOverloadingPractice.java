package com.syntax.Class21MethodOverloading;

public class MethodOverloadingPractice {
    static void student(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    static void student(double num1, double num2) {
        System.out.println(num1 + num2);
    }

    static void student(double num1, double num2, double num3) {
        System.out.println(num1 + num2 + num3);
    }

    static void student(int num1, int num2, int num3) {
        System.out.println(num1 + num2 + num3);
    }

    static void student(double num1, double num2, double num3, double num4) {
        System.out.println(num1 + num2 + num3 + num4);
    }

    public static void main(String[] args) {
        student(10, 10, 50);

    }
}
