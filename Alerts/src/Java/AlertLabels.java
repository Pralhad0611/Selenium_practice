package Java;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;


public class AlertLabels {
    WebDriver w;
    String filelocation = System.getProperty("user.dir");
    String URL = filelocation + File.separator + "Docs_files" + File.separator + "HtmlCssJs" + File.separator + "AlertLabel.html";

    @Test
    public void Alert_Labels() throws InterruptedException, IOException {

        String ChrmDrvr = filelocation + File.separator + "Drivers" + File.separator + "chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", ChrmDrvr);
        w = new ChromeDriver();
        w.manage().window().maximize();
        w.navigate().to(URL);
        w.manage().deleteAllCookies();
        Thread.sleep(3000);

        w.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(5000);

        JavascriptExecutor js1 = (JavascriptExecutor) w;
        System.out.println(js1.executeScript("function GetLabelName()" +
                "{ " +
                " return document.getElementById('AccountText').nextSibling.innerHTML;" +
                "}" +
                "return GetLabelName();"));    //return GetLabelName is important

        Thread.sleep(3000);

        w.quit();
    }
}

