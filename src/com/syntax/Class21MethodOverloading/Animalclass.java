package com.syntax.Class21MethodOverloading;

public class Animalclass {
    String name;
    String color;
    String breed;
    int age;

    public Animalclass(String name, String color, String breed, int age) {
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.age = age;
    }

    void printInfo() {
        System.out.println("Name " + name + " Color " + color + " Breed " + breed + "Age " + age);
    }
}
class Dog extends Animalclass {
    public Dog(String name, String color, String breed, int age){
    super(name,color,breed,age);
}
}
class Cat extends Animalclass {
    public Cat(String name, String color, String breed, int age){
        super(name,color,breed,age);
    }
}