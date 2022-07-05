package com.syntax.Class13UsingOOPCreatingClasses;

public class Human {
    String name;
    String color;
    int age;
    int weight;
    char gender;

    // here we created the methods of our classes
    void eat(){
        System.out.println("human eat");
    }
    void talking(){
        System.out.println(" human talk");
    }
    void listen(){
        System.out.println("human listen");
    }
    void hearing(){
        System.out.println("human hearing");
    }

    public static void main(String[] args) {
        Human human=new Human();
        human.name="abdul";
        human.color="white";
        human.age=30;
        human.weight=185;
        human.gender='M';
        System.out.println(human.age);
        human.eat();
        human.listen();
        human.hearing();
        human.talking();
    }
}
