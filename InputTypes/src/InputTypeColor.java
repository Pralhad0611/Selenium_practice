import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class InputTypeColor {
    WebDriver w;
    String filelocation = System.getProperty("user.dir");
    String URL = filelocation + File.separator + "Docs_files" + File.separator + "HtmlCssJs" + File.separator + "AllInputTypes.html";
    String AutoITFile = filelocation + File.separator + "Docs_files" + File.separator + "AutoITFiles" + File.separator + "File_Upload.exe";

    @Test
    public void InputType_Color() throws InterruptedException, IOException {
        String ChrmDrvr = filelocation + File.separator + "Drivers" + File.separator + "chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", ChrmDrvr);
        w = new ChromeDriver();
        w.manage().window().maximize();
        w.navigate().to(URL);
        w.manage().deleteAllCookies();
        Thread.sleep(3000);

       /* String colorq = w.findElement(By.name("PicColor")).getCssValue("color");
        String colorq1 = w.findElement(By.name("PicColor")).getAttribute("value");
        System.out.println(colorq);
        System.out.println(colorq1);*/

        JavascriptExecutor js = (JavascriptExecutor) w;
       // WebElement element = w.findElement(By.name("PicColor"));
        WebElement ColorElement = w.findElement(By.cssSelector("input[type='color']"));
        js.executeScript("arguments[0].setAttribute('value', '#FF0000')",ColorElement);

    }
}
