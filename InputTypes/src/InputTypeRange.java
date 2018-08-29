import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class InputTypeRange {
    WebDriver w;
    String filelocation = System.getProperty("user.dir");
    String URL = filelocation + File.separator + "Docs_files" + File.separator + "HtmlCssJs" + File.separator + "AllInputTypes.html";

    @Test
    public void InputType_Range() throws InterruptedException, IOException {
        String ChrmDrvr = filelocation + File.separator + "Drivers" + File.separator + "chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", ChrmDrvr);
        w = new ChromeDriver();
        w.manage().window().maximize();
        w.navigate().to(URL);
        w.manage().deleteAllCookies();
        Thread.sleep(3000);

        JavascriptExecutor js = (JavascriptExecutor) w;
        WebElement RangeElement = w.findElement(By.name("RangePoints"));
        js.executeScript("arguments[0].stepUp(-50)", RangeElement);
        Thread.sleep(500);
        js.executeScript("arguments[0].stepUp(100)", RangeElement);
        Thread.sleep(3000);

        JavascriptExecutor js1 = (JavascriptExecutor) w;
        WebElement RangeElement1 = w.findElement(By.cssSelector("input[list='tickmarks']"));
        js1.executeScript("arguments[0].stepUp(-50)", RangeElement1);
        Thread.sleep(500);
        js1.executeScript("arguments[0].stepUp(100)", RangeElement1);
        Thread.sleep(3000);
        w.close();

    }
}
