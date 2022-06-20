package com.syntax.PracticeClass;

public class Bird {
    String name;
    String color;
    int age;
    double weight;

    void printInfo() {
        System.out.println("Name " + name + " Color " + color + " Age " + age + " Weight " + weight);
    }

    Bird(String name, String color, int age, double weight) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    Bird(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }
    }

    class parrote extends Bird {
        parrote(String name, String color, int age, double weight) {
            super(name, color, age, weight);

        }

    }

    class sparrowe extends Bird {
        sparrowe(String name, String color, int age) {
            super(name, color, age);
        }
}



