package com.syntax.Class30;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesCreateFilesDemo1 {
    public static void main(String[] args) throws IOException {
        // this is the path where we want to create the file
        String path="Files/Trump.properties";
        // we need to go to that path to create that file
        // programmatically this is how we do that
        FileOutputStream fileOutputStream= new FileOutputStream(path);
        // create the objects of properties class to store properties inside the file
        Properties properties= new Properties();
        // store key value pari inside the objects
        properties.setProperty("Funny","true");
        // store the data in the form of a file on our hard dirve
        properties.store(fileOutputStream,"A new property has been added");
        // close the file
        fileOutputStream.close();





    }
}
