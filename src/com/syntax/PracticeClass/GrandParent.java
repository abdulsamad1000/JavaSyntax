package com.syntax.PracticeClass;

public class GrandParent {
    String name="Abdulsamad";
}
class Parent extends GrandParent{
    void printInfo(){
        System.out.println("Name of my father is "+name);
    }
}
class Child extends Parent{
    void printInfo(){
        System.out.println("Name of my grand pa is "+name);
    }
}
class GrandChild extends Child{
    void printInfo(){
        System.out.println("Name of my grand grandpa is "+name);
    }

    public static void main(String[] args) {
        GrandChild grandChild=new GrandChild();
        grandChild.printInfo();
        Child child=new Child();
        child.printInfo();
        Parent parent=new Parent();
        parent.printInfo();

    }
}
