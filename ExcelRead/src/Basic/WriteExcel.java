package Basic;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class WriteExcel {

    String FileLocation=System.getProperty("user.dir");
    WebDriver weBdriver;

    @Test
    public void Write_Excel() throws Exception{

        String filepath = FileLocation + File.separator + "Docs_files" + File.separator + "Excels" + File.separator + "ExcelWrite.xlsx";
        FileInputStream fileInputStream=new FileInputStream(filepath);
        XSSFWorkbook workbook=new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet=workbook.getSheetAt(0);

        sheet.getRow(1).getCell(0).getStringCellValue();
        sheet.getRow(1).getCell(0).setCellValue("1");

        FileOutputStream fileOutputStream=new FileOutputStream(new File(filepath));

        fileOutputStream.close();

    }
}
