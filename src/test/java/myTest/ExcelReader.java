package myTest;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utilities.ConfigReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelReader  {



    @Test

    public void excelTets() throws IOException {

        String path = "src/main/resources/Capitals/Capitals.xlsx";

        FileInputStream fis = new FileInputStream(path);

        Workbook workbook = WorkbookFactory.create(fis);


        workbook.getSheet("Sheet1").getRow(1).createCell(0).setCellValue("BENLIK");

        FileOutputStream fileOutputStream = new FileOutputStream(path);
        workbook.write(fileOutputStream);
        fileOutputStream.close();
        workbook.close();

        String country = workbook.getSheet("Sheet1").getRow(1).getCell(0).toString();

        System.out.println(country);

    }
}
