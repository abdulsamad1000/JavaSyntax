package com.syntax.Class27CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {
        List<String> legends = new ArrayList<>(); // recommended
        legends.add("Hamid");
        legends.add("Karla");
        legends.add("Naveed");
        legends.add("Tara");
        legends.add("Yusuf");
        ArrayList<String> moreStudents = new ArrayList<>();
        moreStudents.add("Jason");
        moreStudents.add("Handan");

        ArrayList<String> allStudents=new ArrayList<>();
        allStudents.addAll(legends);
        allStudents.addAll(moreStudents);
        System.out.println(allStudents);
        allStudents.removeAll(legends);
        System.out.println(allStudents);
        allStudents.clear();
        System.out.println(allStudents);
    }
}
