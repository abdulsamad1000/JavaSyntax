package com.syntax.Class21MethodOverloading;

public class AnimalTester {
    public static void main(String[] args) {
        Dog dog=new Dog("Tom","Red","German",25);
        dog.printInfo();
        Cat cat=new Cat("Sasha","Black","Austerlian",20);
        cat.printInfo();
    }
}
