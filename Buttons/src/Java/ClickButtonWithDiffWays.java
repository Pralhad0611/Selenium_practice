package Java;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.security.Credentials;
import org.testng.annotations.Test;

import java.io.File;

public class ClickButtonWithDiffWays {
    WebDriver w;
    String filelocation = System.getProperty("user.dir");

    @Test
    public void ClickButton_WithDiffWays() throws Exception {

        String URL = filelocation + File.separator + "Docs_files" + File.separator + "HtmlCssJs" + File.separator + "AlertDemo.html";

        String ChrmDrvr = filelocation + File.separator + "Drivers" + File.separator + "chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", ChrmDrvr);
        w = new ChromeDriver();
        w.manage().window().maximize();
        w.navigate().to(URL);
        w.manage().deleteAllCookies();
        Thread.sleep(3000);

        w.findElement(By.cssSelector(".button_Key")).click();
        Thread.sleep(2000);
        w.findElement(By.cssSelector(".button_Key[value='buttonKey']")).click();
        Thread.sleep(2000);
        w.findElement(By.xpath("//input[@type='submit' and @value='buttonKey']")).click();
        Thread.sleep(2000);
        w.findElement(By.xpath("//input[@type='submit' and @value='buttonKey']")).click();
        Thread.sleep(2000);
        w.findElement(By.xpath("//*[contains(text(), 'Try it')]")).click();
        Alert ButtonAlert = w.switchTo().alert();
        Thread.sleep(3000);
        ButtonAlert.accept();
        w.findElement(By.xpath("//*[contains(text(), 'Try it') and @onclick='myFunction()']")).click();
        Alert ButtonAlert1 = w.switchTo().alert();
        Thread.sleep(1000);
        ButtonAlert1.accept();
        w.findElement(By.xpath("//*[starts-with(text(), 'Try it') and @onclick='myFunction()']")).click();
        Alert ButtonAlert2 = w.switchTo().alert();
        Thread.sleep(1000);
        ButtonAlert2.accept();

        Thread.sleep(2000);
        w.close();

    }

}
