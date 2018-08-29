package Java;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ExlUtility
{
    private static XSSFWorkbook ExlWorkBook;
    private static XSSFSheet ExlSheet;
    private static XSSFCell ExlCell;
    private static XSSFRow ExlRow;

    public static void setExlFile(String ExlFilePath,int ExlFileSheet) throws Exception
    {
        FileInputStream ExlFile = new FileInputStream(ExlFilePath);
        ExlWorkBook = new XSSFWorkbook(ExlFile);
        ExlSheet = ExlWorkBook.getSheetAt(ExlFileSheet);
    }

    public static String getExlCellData(int RowNum, int ColNum) throws Exception
    {
        try
        {
        /*DataFormatter formatter = new DataFormatter();*/
            ExlCell = ExlSheet.getRow(RowNum).getCell(ColNum);
            String CellData = ExlCell.getStringCellValue();

            return CellData;
        }
        catch (Exception e)
        {
            return "Error";
        }
    }

    public static void setExlCellData(String Result,  int RowNum, int ColNum) throws Exception
    {
        try
        {
            ExlRow=ExlSheet.getRow(RowNum);
            ExlCell=ExlRow.getCell(ColNum, ExlRow.RETURN_BLANK_AS_NULL);

            if(ExlCell==null)
            {
                ExlCell = ExlRow.createCell(ColNum);
                ExlCell.setCellValue(Result);
            }
            else
            {
                ExlCell.setCellValue(Result);
            }

            FileOutputStream ExlFileOutput = new FileOutputStream(ConstantData.TestDataPath + ConstantData.TestDataExlFile);
            ExlWorkBook.write(ExlFileOutput);
            ExlFileOutput.flush();
            ExlFileOutput.close();
        }
        catch( Exception e)
        {
            throw (e);
        }
    }
}
