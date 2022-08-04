package com.syntax.Class30;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelDemo1st {
    public static void main(String[] args) throws IOException {
        // location of file on the computer
        String path = "C:\\Users\\samad\\OneDrive\\Desktop\\SDETBatch13.xlsx";
        // navigate to this file
        FileInputStream fileInputStream = new FileInputStream(path);
        // class that understand how Excel files work
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        // Excel files are didvied in sheets we can access any sheet by providing its name
        Sheet sheet = xssfWorkbook.getSheet("Sheet1");
        //sheet have rows and cells columns we need to specify the row number and create
        //rows and columns tehy aslo start from index zero
        //Number of rows that contain the data
        int noOfRows = sheet.getPhysicalNumberOfRows();
        for (int i = 0; i < noOfRows; i++) {
            // getting all the rows one by one with help of loop
            Row row = sheet.getRow(i);
           int noOfCells= row.getPhysicalNumberOfCells();
           for (int j=0; j<noOfCells; j++){
               System.out.println(row.getCell(j)+"  ");
           }
            System.out.println();
        }
        fileInputStream.close();
    }
}
