package com.syntax.Class18ConstructorAndThisKeyword;

public class CowTester {
    public static void main(String[] args) {
        Cow cow=new Cow("Australian","Black",
                20,200);
        System.out.println(cow.getCowInfo());

        int x=15;
        x=x;
    }
}
