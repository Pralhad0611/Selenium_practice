package Java;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;

public class ScrollByVisibleElement {

    WebDriver w;
    String  filelocation = System.getProperty("user.dir");

    @Test
    public void ScrollBy_VisibleElement() throws Exception {

        String ChrmDrvr = filelocation + File.separator + "Drivers" + File.separator + "chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", ChrmDrvr);
        w = new ChromeDriver();
        w.manage().window().maximize();
        w.navigate().to("http://automationpractice.com");
        w.manage().deleteAllCookies();
        Thread.sleep(3000);

        JavascriptExecutor js = (JavascriptExecutor) w;

        w.findElement(By.linkText("T-SHIRTS")).click();
        Thread.sleep(3000);

        WebElement Element = w.findElement(By.linkText("INFORMATION"));
        js.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(2000);




    }
}
