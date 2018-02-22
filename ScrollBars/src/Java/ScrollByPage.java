package Java;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;

public class ScrollByPage

{
    WebDriver w;
    String filelocation = System.getProperty("user.dir");

    @Test
    public void ScrollBy_Page() throws Exception {

        String ChrmDrvr = filelocation + File.separator + "Drivers" + File.separator + "chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", ChrmDrvr);
        w = new ChromeDriver();
        w.manage().window().maximize();
        w.navigate().to("http://demoqa.com/");
        w.manage().deleteAllCookies();
        Thread.sleep(3000);

        JavascriptExecutor js = (JavascriptExecutor) w;

        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }
}
