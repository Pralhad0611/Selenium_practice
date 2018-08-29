package Main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class FileUplaod {
    WebDriver w;
    String filelocation = System.getProperty("user.dir");
    String URL = filelocation + File.separator + "Docs_files" + File.separator + "HtmlCssJs" + File.separator + "FileUploads.html";
    String filepath = filelocation + File.separator + "Docs_files" + File.separator + "Excels" + File.separator + "LoginCredentials.xlsx";

    @Test
    public void File_Uplaod() throws InterruptedException, IOException, AWTException {
        String ChrmDrvr = filelocation + File.separator + "Drivers" + File.separator + "chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", ChrmDrvr);
        w = new ChromeDriver();
        w.manage().window().maximize();
        w.navigate().to(URL);
        w.manage().deleteAllCookies();
        Thread.sleep(3000);

        WebElement webElement = w.findElement(By.id("myFile"));
        webElement.sendKeys(filepath);


    }
}
