package Java;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HorizontalScroll
{
    WebDriver w;

    @Test
    public void Horizontal_Scroll() throws Exception {

        System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
        w = new ChromeDriver();
        Dimension d = new Dimension(420,500);
        w.manage().window().setSize(d);
        w.navigate().to("http://demoqa.com/");
        w.manage().deleteAllCookies();
        Thread.sleep(3000);

        WebElement Element = w.findElement(By.xpath("//html/body/div[1]/div/div[2]/aside[4]/div[2]/div/ul/li/a"));

        JavascriptExecutor js = (JavascriptExecutor) w;
        js.executeScript("arguments[0].scrollIntoView();", Element);


    }
}
