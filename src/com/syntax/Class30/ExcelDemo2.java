package com.syntax.Class30;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelDemo2 {
    public static void main(String[] args) throws IOException {
        /*
        how to create Excel files using apache poi and java
         */

        // path of the file
        String path = "C:\\Users\\samad\\OneDrive\\Desktop\\SDETBatch13.xlsx";
        // navigate to the file location
        // specail class that knows how to handel Excel files
        XSSFWorkbook xssfWorkbook= new XSSFWorkbook();
        Sheet sheet=xssfWorkbook.createSheet("abdul");
        Row row= sheet.createRow(0);
        Cell cell=row.createCell(0);
        cell.setCellValue("samad");

        FileOutputStream fileOutputStream= new FileOutputStream(path);
        xssfWorkbook.write(fileOutputStream);
        fileOutputStream.close();

    }
}
