package com.syntax.Class29;

import java.util.HashMap;

public class Task4 {
    public static void main(String[] args) {
        /**
         * Create a Set collection that will hold Objects of Student Type.
         * In this set we do not care about the insertion order.
         * Each student object should have name and studentID. Display name of each student.
         */
        HashMap<String, Integer> Student=new HashMap<>();
        Student.put("Bila",14);
        Student.put("Arif",12);
        Student.put("Aimal",15);
        Student.put("Jason",22);
        Student.put("Hamid",18);
        Student.put("Zameer",20);
        Student.put("Ahamd",8);
        System.out.println(Student.keySet());
    }
}
