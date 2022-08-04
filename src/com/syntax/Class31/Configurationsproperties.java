package com.syntax.Class31;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configurationsproperties {
    public static void main(String[] args) throws IOException {

        String path="Files/Configurations.properties";

        FileInputStream fileInputStream= new FileInputStream(path);

        Properties Configurations= new Properties();
        Configurations.load(fileInputStream);
        System.out.println(Configurations.getProperty("username"));
        System.out.println(Configurations.getProperty("password"));
        System.out.println(Configurations.getProperty("url"));
        System.out.println(Configurations.getProperty("browser"));

        fileInputStream.close();

    }
}
