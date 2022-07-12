package com.syntax.PracticeClass;

import java.util.ArrayList;

public class ArraylistDemo3 {
    public static void main(String[] args) {
        ArrayList<String> SDETsubjects=new ArrayList<>();
        SDETsubjects.add("SDLC");
        SDETsubjects.add("Manula Testing");
        SDETsubjects.add("Java");
        SDETsubjects.add("Jira");
        SDETsubjects.add("Git");
        System.out.println(SDETsubjects.indexOf("Git"));

    }
}
