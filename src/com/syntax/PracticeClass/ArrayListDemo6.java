package com.syntax.PracticeClass;

import java.util.ArrayList;

public class ArrayListDemo6 {
    public static void main(String[] args) {
        ArrayList<String> subjectsThought=new ArrayList<>();
        subjectsThought.add("SDLC");
        subjectsThought.add("Manula Testing");
        subjectsThought.add("Java");
        subjectsThought.add("Jira");
        subjectsThought.add("Git");
        subjectsThought.add("Selenium");

        ArrayList<String> futureSubjects=new ArrayList<>();
        futureSubjects.add("TestNG");
        futureSubjects.add("Cucumber");
        futureSubjects.add("SQL");
        futureSubjects.add("API");
        futureSubjects.add("Jenkins");
        futureSubjects.add("AWS");
        futureSubjects.add("Docker");
        futureSubjects.add("APIUM");
        // now we want to add the above list and bottom list to gather to the allthesubjects ArrayList
        ArrayList<String> SeenANDfututeSubject=new ArrayList<>();
        SeenANDfututeSubject.addAll(subjectsThought);
        SeenANDfututeSubject.addAll(1,futureSubjects);
        System.out.println("SeenANDfutureSubject ="+ SeenANDfututeSubject);





    }
}
