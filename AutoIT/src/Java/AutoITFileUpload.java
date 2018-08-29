package Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;

public class AutoITFileUpload {

    WebDriver w;
    String filelocation = System.getProperty("user.dir");
    String URL = filelocation + File.separator + "Docs_files" + File.separator + "HtmlCssJs" + File.separator + "FileUploads.html";
    String AutoITFile = filelocation + File.separator + "Docs_files" + File.separator + "AutoITFiles" + File.separator + "File_Upload.exe";

    @Test
    public void AutoIT_FileUpload() throws InterruptedException, IOException {
        String ChrmDrvr = filelocation + File.separator + "Drivers" + File.separator + "chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", ChrmDrvr);
        w = new ChromeDriver();
        w.manage().window().maximize();
        w.navigate().to(URL);
        w.manage().deleteAllCookies();
        Thread.sleep(3000);

        w.findElement(By.id("myFile")).click();
        Thread.sleep(2000);

        Runtime.getRuntime().exec(AutoITFile);
        Thread.sleep(5000);

        w.findElement(By.xpath("//html/body/button")).click();
        Thread.sleep(3000);
        w.close();

    }
}
