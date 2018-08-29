package Java;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;

public class ClickDiv
{
    WebDriver w;
    String filelocation = System.getProperty("user.dir");

    @Test
    public void Click_Div() throws Exception {

        String URL = filelocation + File.separator + "Docs_files" + File.separator + "HtmlCssJs" + File.separator + "LabelsHideShow.html";

        String ChrmDrvr = filelocation + File.separator + "Drivers" + File.separator + "chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", ChrmDrvr);
        w = new ChromeDriver();
        w.manage().window().maximize();
        w.navigate().to(URL);
        w.manage().deleteAllCookies();
        Thread.sleep(3000);

            w.findElement(By.className("ClickHi")).click();
            Thread.sleep(500);
            w.findElement(By.className("ClickHow")).click();
            Thread.sleep(500);
            w.findElement(By.className("ClickAre")).click();
            Thread.sleep(500);
            w.findElement(By.className("ClickYou")).click();
            Thread.sleep(500);
            w.findElement(By.className("ClickQM")).click();
            Thread.sleep(500);
            w.findElement(By.className("ClickFine")).click();
            Thread.sleep(3000);
            w.findElement(By.className("ClickYes")).click();
            Thread.sleep(5000);
            w.findElement(By.className("ClickRemember")).click();
            Thread.sleep(500);
            w.findElement(By.className("ClickOne")).click();
            Thread.sleep(500);
            w.findElement(By.className("ClickThing")).click();
            Thread.sleep(500);
            w.findElement(By.className("ClickOnly")).click();
            Thread.sleep(500);
            w.findElement(By.className("ClickONE")).click();
            Thread.sleep(500);
            w.findElement(By.className("ClickThing2")).click();
            Thread.sleep(500);
            w.findElement(By.className("ClickNever")).click();
            Thread.sleep(500);
            w.findElement(By.className("ClickNever2")).click();
            Thread.sleep(500);
            w.findElement(By.className("ClickEver")).click();
            Thread.sleep(500);
            w.findElement(By.className("ClickExpose")).click();
            Thread.sleep(500);
            w.findElement(By.className("ClickYour2")).click();
            Thread.sleep(500);
            w.findElement(By.className("ClickLove")).click();
            Thread.sleep(500);

        Thread.sleep(5000);
        w.close();

    }
}
