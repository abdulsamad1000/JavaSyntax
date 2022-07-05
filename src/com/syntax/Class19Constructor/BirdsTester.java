package com.syntax.Class19Constructor;

public class BirdsTester {
    public static void main(String[] args) {
        ParrotBird parrotbird=new ParrotBird("is Abby","is Green","is Austerlian ",'F');
        parrotbird.printInfo();
        EagleBird eagleBird=new EagleBird("is Steller","is black","is German ",'M');
        eagleBird.printInfo();
        OwlBird owlBird=new OwlBird("is Otus","is White","is African ",'F');
        owlBird.printInfo();
        FalconBird falconBird=new FalconBird("is Hawky","is Black","is USA ",'M');
        falconBird.printInfo();



    }
}
