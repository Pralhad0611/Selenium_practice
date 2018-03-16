package Java;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class DeleteoneCharacter {
    WebDriver w;
    String filelocation = System.getProperty("user.dir");
    String URL = filelocation + File.separator + "Docs_files" + File.separator + "HtmlCssJs" + File.separator + "AllInputTypes.html";


    @Test
    public void InputType_Date() throws InterruptedException, IOException {
        String ChrmDrvr = filelocation + File.separator + "Drivers" + File.separator + "chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", ChrmDrvr);
        w = new ChromeDriver();
        w.manage().window().maximize();
        w.navigate().to(URL);
        w.manage().deleteAllCookies();
        Thread.sleep(3000);


        w.findElement(By.name("Text")).sendKeys("Longest");
        Thread.sleep(2000);
        w.findElement(By.name("Text")).clear();
        Thread.sleep(2000);

        w.findElement(By.name("Text")).sendKeys("Longest");
        Thread.sleep(2000);
        String OldString= w.findElement(By.name("Text")).getAttribute("value");
        String  SortedString = OldString.replaceAll("L", "");
        System.out.println(SortedString);
        w.findElement(By.name("Text")).clear();
        w.findElement(By.name("Text")).sendKeys(SortedString);
        Thread.sleep(2000);

    /*  w.findElement(By.name("Text")).clear();
        Thread.sleep(2000);


        w.findElement(By.name("Text")).sendKeys("Longest");
        Thread.sleep(2000);
        w.findElement(By.name("Text")).sendKeys("\u0008");
        Thread.sleep(2000);
        w.findElement(By.name("Text")).sendKeys("\u0008");
        Thread.sleep(2000);
        w.findElement(By.name("Text")).sendKeys(Keys.BACK_SPACE);
        Thread.sleep(2000);


        w.findElement(By.name("Text")).sendKeys(Keys.CONTROL,"a");
        Thread.sleep(1000);
        w.findElement(By.name("Text")).sendKeys(Keys.DELETE);
        Thread.sleep(2000);
*/



    }
}
