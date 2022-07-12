package com.syntax.PracticeClass;

import java.util.ArrayList;

public class ArrayLIstDemo5 {
    public static void main(String[] args) {
        ArrayList<String> subjects=new ArrayList<>();
        subjects.add("SDLC");
        subjects.add("Manula Testing");
        subjects.add("Java");
        subjects.add("Jira");
        subjects.add("Git");
        subjects.add(0,"Git");
        System.out.println(subjects.indexOf("Java"));
        System.out.println(subjects.size());
        System.out.println(subjects.remove("Jira"));
        System.out.println("subjects = " + subjects);
        System.out.println(subjects.contains("Git"));
        subjects.get(2);
        System.out.println(subjects.get(0));
        System.out.println(subjects.get(3));
        System.out.println(subjects);
        subjects.clear();
        System.out.println(subjects);
    }
}
