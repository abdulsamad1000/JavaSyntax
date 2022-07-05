package com.syntax.Class18ConstructorAndThisKeyword;

public class BookTester {
    public static void main(String[] args) {
        Book book1=new Book("Algibra","DarkRed",2,200);
        book1.printInfo();
        Book book2=new Book("Chemistery","Blue",3,150);
        book2.printInfo();
        Book book3=new Book("Art","Brown",4,250);
        book3.printInfo();
        Book book=new Book(250);
        book.printInfo();
    }
}
