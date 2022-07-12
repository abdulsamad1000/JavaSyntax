package com.syntax.PracticeClass;

import java.util.ArrayList;

public class DemoPractice1 {
    public static void main(String[] args) {
        ArrayList<String> subject=new ArrayList<>();
        subject.add("SDLC");
        subject.add("Manual Testing");
        subject.add("Java");
        subject.add("Git");
        subject.add("Jira");
        subject.add("Selenium");
        subject.add(1,"TestNg");
        System.out.println(subject.indexOf("Selenium"));
        System.out.println(subject.size()); // this method will tell as the total number of elements
        System.out.println(subject.remove("Jira"));
        System.out.println("subject = " + subject); // this is soutv a method we can print all the elements names
        // i want to creat an array of i will use this method iter and the soutv it will create an array for as

        for (String s : subject) {
            System.out.println("s = " + s);
        }
        // ritar is anthor method which can write a loop for as in reverse order
        System.out.println(subject.contains("Selenium"));



    }
}
