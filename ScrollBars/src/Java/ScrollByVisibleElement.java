package Java;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ScrollByVisibleElement {

    WebDriver w;

    @Test
    public void ScrollBy_VisibleElement() throws Exception {

        System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
        w = new ChromeDriver();
        w.manage().window().maximize();
        w.navigate().to("http://automationpractice.com");
        w.manage().deleteAllCookies();
        Thread.sleep(3000);

        JavascriptExecutor js = (JavascriptExecutor) w;

        w.findElement(By.linkText("T-SHIRTS")).click();
        Thread.sleep(3000);

        WebElement Element = w.findElement(By.linkText("INFORMATION"));
        // WebElement slider = w.findElement(By.xpath("//html/body/div[1]/div[2]/div/div[3]/div[1]/div[1]/div[1]/form/div/div[10]/ul/div/div/a[1]"));
        js.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(2000);




    }
}
