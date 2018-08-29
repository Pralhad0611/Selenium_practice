package Main.Java;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class ExcelWriteData {
    public static void main(String[] args) throws Exception {
        String filelocation = System.getProperty("user.dir");
        try {
            String filepath = filelocation + File.separator + "Docs_files" + File.separator + "Excels" + File.separator + "ExcelWrite.xlsx";
            FileInputStream file = new FileInputStream(new File(filepath));
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheetAt(0);

            Cell searchText3 = sheet.getRow(0).getCell(0);
            searchText3.setCellValue("Test Search Keyword");

            file.close();

            FileOutputStream outFile = new FileOutputStream(new File(filepath));
            workbook.write(outFile);
            outFile.close();

        }
        catch (FileNotFoundException fnfe)
        {
            fnfe.printStackTrace();
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
    }
}
