package com.syntax.PracticeClass;

public interface Animal {
    void eat();
    void walk();
    void sleep();
    void milk();

}
interface Cow extends Animal{
    void drink();
}
class Redcow implements Cow{

    @Override
    public void eat() {
        System.out.println("cow eat");
    }

    @Override
    public void walk() {
        System.out.println("cow walk");
    }

    @Override
    public void sleep() {
        System.out.println("cow sleep");
    }

    @Override
    public void milk() {
        System.out.println("cow milk");
    }

    @Override
    public void drink() {
        System.out.println("cow drink");
    }
}
