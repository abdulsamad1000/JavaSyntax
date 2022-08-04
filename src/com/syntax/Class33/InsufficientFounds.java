package com.syntax.Class33;

public class InsufficientFounds extends RuntimeException{
    // to create a custom exception simple create a class and extend it from Runtime Exception or any other
    // Exception if you want to create a checked exception extend from Exception class otherwise
    // RuntimeException
    InsufficientFounds(String message){
        super(message);
    }
}
