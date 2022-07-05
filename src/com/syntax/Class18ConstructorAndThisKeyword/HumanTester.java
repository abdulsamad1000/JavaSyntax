package com.syntax.Class18ConstructorAndThisKeyword;

public class HumanTester {
    public static void main(String[] args) {
        Human human1=new Human("Mike ",78,6.1,198,"white");
        human1.printInfo();
        Human human2=new Human("John",87,5.5,200,"black");
        human2.printInfo();

        Human human=new Human("Ahmad");
        human.printInfo();
    }
}
