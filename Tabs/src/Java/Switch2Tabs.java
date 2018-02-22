package Java;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.io.File;
import java.util.ArrayList;

public class Switch2Tabs {
    WebDriver w;
    String filelocation = System.getProperty("user.dir");

    @Test
    public void Switch_2Tabs() throws Exception {

        String ChrmDrvr = filelocation + File.separator + "Drivers" + File.separator + "chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", ChrmDrvr);
        w = new ChromeDriver();
        w.manage().window().maximize();
        w.navigate().to("http://demoqa.com/");
        w.manage().deleteAllCookies();
        Thread.sleep(3000);


        WebElement ElementTab = w.findElement(By.linkText("Tabs"));
        Actions actions = new Actions(w);
        actions.moveToElement(ElementTab);
        actions.contextClick(ElementTab).sendKeys(Keys.CONTROL).sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(3000);

        ArrayList<String> tabs2 = new ArrayList<String>(w.getWindowHandles());

        w.switchTo().window(tabs2.get(0));
        Thread.sleep(1000);
        w.switchTo().window(tabs2.get(1));

    }


}
