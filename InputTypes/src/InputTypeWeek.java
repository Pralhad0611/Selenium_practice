import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class InputTypeWeek {
    WebDriver w;
    String filelocation = System.getProperty("user.dir");
    String URL = filelocation + File.separator + "Docs_files" + File.separator + "HtmlCssJs" + File.separator + "AllInputTypes.html";
    String AutoITFile = filelocation + File.separator + "Docs_files" + File.separator + "AutoITFiles" + File.separator + "File_Upload.exe";

    @Test
    public void InputType_Week() throws InterruptedException, IOException {
        String ChrmDrvr = filelocation + File.separator + "Drivers" + File.separator + "chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", ChrmDrvr);
        w = new ChromeDriver();
        w.manage().window().maximize();
        w.navigate().to(URL);
        w.manage().deleteAllCookies();
        Thread.sleep(3000);

        JavascriptExecutor js = (JavascriptExecutor) w;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(2000);

        w.findElement(By.name("week_year")).sendKeys("11,2001");
        Thread.sleep(2000);


        WebElement WeekElement = w.findElement(By.name("week_year"));
        JavascriptExecutor js1 = (JavascriptExecutor) w;
        js1.executeScript("arguments[0].setAttribute('value', '1994-W10,')",WeekElement);


        String colorq = w.findElement(By.name("week_year")).getCssValue("week_year");
        String colorq1 = w.findElement(By.name("week_year")).getAttribute("value");
        System.out.println(colorq+"1");
        System.out.println(colorq1);


    }
}
