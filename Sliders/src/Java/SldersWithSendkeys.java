package Java;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SldersWithSendkeys
{
    WebDriver w;

    @Test
    public void SldersWith_Sendkeys() throws Exception {

        System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
        w = new ChromeDriver();
        w.manage().window().maximize();
        w.navigate().to("http://automationpractice.com");
        w.manage().deleteAllCookies();
        Thread.sleep(3000);

        JavascriptExecutor js = (JavascriptExecutor) w;

        w.findElement(By.linkText("T-SHIRTS")).click();
        Thread.sleep(3000);

        WebElement slider1 = w.findElement(By.xpath("//*[@id='layered_price_slider']/a[1]"));

        for (int i = 1; i <= 100 ; i++) {
            slider1.sendKeys(Keys.ARROW_RIGHT);
        }
        Thread.sleep(300);
        for (int i = 1; i <= 100 ; i++) {
            slider1.sendKeys(Keys.ARROW_LEFT);
        }

        Thread.sleep(300);
        WebElement slider2 = w.findElement(By.xpath("//*[@id='layered_price_slider']/a[2]"));
        for (int i = 1; i <= 100 ; i++) {
            slider2.sendKeys(Keys.ARROW_LEFT);
        }

}
}

