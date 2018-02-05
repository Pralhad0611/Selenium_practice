package Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseOver {

    WebDriver w;


    @Test
    public void Login_Excel() throws Exception {


        System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
        w = new ChromeDriver();
        w.manage().window().maximize();
        w.navigate().to("http://www.seleniumframework.com/demo-sites/");
        w.manage().deleteAllCookies();

        Thread.sleep(2000);


        WebElement WebElementFirst=w.findElement(By.linkText("TUTORIALS"));
        Actions ActionFirst=new Actions(w);
        ActionFirst.moveToElement(WebElementFirst).build().perform();
        Thread.sleep(2000);

        WebElement w2=w.findElement(By.linkText("Java"));
        Actions a2=new Actions(w);
        ActionFirst.moveToElement(w2).build().perform();
        Thread.sleep(2000);
        w.findElement(By.linkText("Selenium & Cucumber Basic Tutorial")).click();

    }
}