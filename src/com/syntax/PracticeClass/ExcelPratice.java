package com.syntax.PracticeClass;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelPratice {
    public static void main(String[] args) throws IOException {
        String path="Files/DataSheet.xlsx";
        FileInputStream fileInputStream= new FileInputStream(path);
        XSSFWorkbook xssfWorkbook= new XSSFWorkbook(fileInputStream);
        Sheet sheet= xssfWorkbook.getSheet("Sheet1");
        int noOfRows=sheet.getPhysicalNumberOfRows();
        for (int i=0; i<noOfRows; i++) {
            Row row = sheet.getRow(i);
            int noOfCells=row.getPhysicalNumberOfCells();
            for (int j=0; j<noOfCells; j++){
                System.out.println(row.getCell(j)+" ");
            }
            System.out.println();
        }
    }
}
