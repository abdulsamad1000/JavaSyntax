package com.syntax.PracticeClass;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteFileDemo {
    public static void main(String[] args) throws IOException {
        // path where we want to create the file
        String path="Files/Abdulsamad.properties";
        // we need to go to that path to create this file programmatically this is how we do that.
        FileOutputStream fileOutputStream= new FileOutputStream(path);
        // create the object of properties class to stroe properties inside the file
        Properties properties=new Properties();
        // store key value pair inside the object
        properties.setProperty("You are really good with Java","That is true");
        // stoe this data in the form of a file on our hard dirve
        properties.store(fileOutputStream,"A new data has been added to the database");
        // close the file
        fileOutputStream.close();



    }
}
