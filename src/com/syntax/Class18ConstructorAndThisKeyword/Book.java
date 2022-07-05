package com.syntax.Class18ConstructorAndThisKeyword;

public class Book {
    String name;
    String color;
    int weight;
    int size;

    public Book(String bookName,String bookColor,int bookWeight,int bookSize){
        name=bookName;
        color=bookColor;
        weight=bookWeight;
        size=bookSize;
        }
        public Book(int bookSize){
        size=bookSize;
        }

        void printBookSize(){
            System.out.println("Size"+size);
        }
    void printInfo() {
        System.out.println("Name of a book is " + name + " Color of a book is " + color + " Weight of a book is  " + weight+"lb"+ " page Size is "+size);

    }
    }




