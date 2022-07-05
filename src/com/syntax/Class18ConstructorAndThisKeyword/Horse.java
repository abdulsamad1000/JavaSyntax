package com.syntax.Class18ConstructorAndThisKeyword;

public class Horse {
    String name;
    String color;
    String breed;
    int age;
    double weight;

    public Horse(String name, String color, String breed, int age, double weight) {
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }
    String getHorseInfo(){

        return "Name"+name+"Color"+color+"Breed"+breed+"Age"+age+"Weight"+weight;
    }
   }

