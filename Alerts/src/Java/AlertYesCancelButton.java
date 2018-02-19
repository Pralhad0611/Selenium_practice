package Java;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;

public class AlertYesCancelButton {

    WebDriver w;
    String filelocation = System.getProperty("user.dir");

    @Test
    public void Alert_YesCancelButton() throws Exception {
        String URL = filelocation+ File.separator+"Docs_files"+ File.separator+"HtmlCssJs"+File.separator+ "AlertYesNo.html";

        String ChrmDrvr = filelocation + File.separator + "Drivers" + File.separator + "chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", ChrmDrvr);
        w = new ChromeDriver();
        w.manage().window().maximize();
        w.navigate().to(URL);
        w.manage().deleteAllCookies();
        Thread.sleep(3000);


        w.findElement(By.xpath("//html/body/button")).click();
        Thread.sleep(3000);
        Alert alert = w.switchTo().alert();
        alert.accept();

        Thread.sleep(3000);
        w.findElement(By.xpath("//html/body/button")).click();
        Thread.sleep(3000);
        Alert alert2 = w.switchTo().alert();
        alert2.dismiss();
        Thread.sleep(3000);

        w.close();

    }
}