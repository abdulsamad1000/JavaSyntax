package com.syntax.Class26Interfaces;

import java.util.ArrayList;

public class Demo5 {
    public static void main(String[] args) {
        ArrayList<String>subjects=new ArrayList<>();
        subjects.add("SDLC");
        subjects.add("Manual Testing");
        subjects.add("Git");
        subjects.add("Java");
        System.out.println(subjects.indexOf("Git"));
    }
}
