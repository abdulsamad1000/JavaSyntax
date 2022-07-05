package com.syntax.Class11;

public class Dog {
    String name;
    String color;
    int age;
    double weight;
    void eat(){
        System.out.println("dog eate");
    }
    void run(){
        System.out.println("dog runing");
    }
    void bark(){
        System.out.println("dog bark");
    }

    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.name="chalo";
        dog.color="black";
        dog.age=12;
        dog.weight=5;
        System.out.println(dog.age);
        dog.eat();
        dog.bark();
        dog.run();
        System.out.println("=============================");
        Dog dog1=new Dog();
        dog1.name="jahna";
        dog1.color="white";
        dog1.age=4;
        System.out.println(dog1.name);
        dog1.run();
        dog1.eat();
    }

}

