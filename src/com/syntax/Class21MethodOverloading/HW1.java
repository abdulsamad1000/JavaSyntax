package com.syntax.Class21MethodOverloading;

public class HW1 {

}
/*
  Create a class named 'Programming'. While creating an object of the class,
   if nothing is passed to it, then the message "I love programming languages" should be printed.
    If some String is passed to it, then in place of "programming languages" the value variable should be printed.
     Example, if we pass "Java", then "I love Java" should be printed.
   */
class Programming {
    Programming() {
        System.out.println(" i love programming languages");
    }
    Programming(String Abdul) {
        System.out.println("Programming languages " + Abdul);
    }
    public static void main(String[] args) {
        Programming programming = new Programming("java");
        Programming programming1 = new Programming();
    }
}
