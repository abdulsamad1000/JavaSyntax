package com.syntax.PracticeClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class AbdulsamadPropertyDemo {
    public static void main(String[] args) throws IOException {
        String path="Files/SDETStudents.properties";
        FileInputStream fileInputStream= new FileInputStream(path);
        Properties properties= new Properties();
        properties.load(fileInputStream);
        System.out.println(properties.getProperty("FirstName"));
        System.out.println(properties.getProperty("LastName"));
        System.out.println(properties.getProperty("ID#"));
        System.out.println(properties.getProperty("Class"));
        System.out.println(properties.getProperty("PhoneNumber"));
        System.out.println(properties.getProperty("Address"));
        System.out.println(properties.getProperty("SchoolName"));
        System.out.println(properties.getProperty("UserName"));
        System.out.println(properties.getProperty("Password"));
        System.out.println(properties.getProperty("browser"));
        System.out.println(properties.getProperty("Url"));
        fileInputStream.close();
    }
}
