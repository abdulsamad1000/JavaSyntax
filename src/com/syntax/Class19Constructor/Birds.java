package com.syntax.Class19Constructor;

public class Birds {
    String name;
    String color;
    String breed;
    char gender;


    void printInfo() {
        System.out.println("Name " + name + " Color " + color + " breed " + breed + "Gender " + gender);
        }
    }

    class ParrotBird extends Birds {
        ParrotBird(String name, String color, String breed, char gender) {
            this.name = name;
            this.color = color;
            this.breed = breed;
            this.gender = gender;
        }
    }

    class EagleBird extends Birds {
        EagleBird(String name, String color, String breed, char gender) {
            this.name = name;
            this.color = color;
            this.breed = breed;
            this.gender = gender;
        }
    }

    class OwlBird extends Birds {
        OwlBird(String name, String color, String breed, char gender) {
            this.name = name;
            this.color = color;
            this.breed = breed;
            this.gender = gender;
        }
    }

    class FalconBird extends Birds {
        FalconBird(String name, String color, String breed, char gender) {
            this.name = name;
            this.color = color;
            this.breed = breed;
            this.gender = gender;
        }
    }

