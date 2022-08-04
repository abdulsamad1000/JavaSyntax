package com.syntax.Class30;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReadDemo {
    public static void main(String[] args) throws IOException {
        // get the path of a file
        String path="Files/Config.properties";
        // navigate to this location with the help of FileInputStream class
        // if we want to read the data or FileOutStream if we want to write the data to file
        FileInputStream fileInputStream= new FileInputStream(path);
        // now we need a class that understand how to read the data File type
        Properties properties= new Properties();
        // loading the data from the file inside the properties Object
        properties.load(fileInputStream);
        System.out.println(properties.getProperty("user"));
        // close this file to save system resources
        fileInputStream.close();


    }
}
