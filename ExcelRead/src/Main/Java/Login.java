package Main.Java;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login
{
    WebDriver w;


    @Test
    public void Login_Excel() throws Exception
    {


        ExcelRead excelReadData =new ExcelRead();
        excelReadData.ExcelReading();
        System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
        w = new ChromeDriver();
        w.manage().window().maximize();
        w.navigate().to("http://192.168.6.56:9000");
        w.manage().deleteAllCookies();

        Thread.sleep(2000);

        w.findElement(By.id("userName")).clear();
        Thread.sleep(200);
        System.out.println("formatCellValue(excelRead3.getEmail()).toString()"+new DataFormatter().formatCellValue(excelReadData.getEmail()));
        w.findElement(By.id("userName")).sendKeys(new DataFormatter().formatCellValue(excelReadData.getEmail()).toString());
        System.out.println(new DataFormatter().formatCellValue(excelReadData.getEmail()).toString());
        Thread.sleep(200);

        w.findElement(By.id("password")).clear();
        Thread.sleep(200);

        w.findElement(By.id("password")).sendKeys(new DataFormatter().formatCellValue(excelReadData.getPwd()).toString());
        Thread.sleep(200);

        w.findElement(By.xpath("//html/body/div[2]/div/div/div/div/form/button")).click();
        Thread.sleep(5000);

    }

}
