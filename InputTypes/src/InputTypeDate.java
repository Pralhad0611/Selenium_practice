import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class InputTypeDate
{
    WebDriver w;
    String filelocation = System.getProperty("user.dir");
    String URL = filelocation + File.separator + "Docs_files" + File.separator + "HtmlCssJs" + File.separator + "AllInputTypes.html";


    @Test
    public void InputType_Date() throws InterruptedException, IOException {
        String ChrmDrvr = filelocation + File.separator + "Drivers" + File.separator + "chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", ChrmDrvr);
        w = new ChromeDriver();
        w.manage().window().maximize();
        w.navigate().to(URL);
        w.manage().deleteAllCookies();
        Thread.sleep(3000);

        w.findElement(By.name("Date")).sendKeys("01/01/1985");
        Thread.sleep(2000);

        w.findElement(By.name("dateMinRange")).sendKeys("01/01/1985");
        Thread.sleep(2000);

        w.findElement(By.id("subutton")).click();
        Thread.sleep(700);

        WebElement WebElementSelect = w.findElement(By.name("dateMinRange"));

        /*JavascriptExecutor js = (JavascriptExecutor) w;
        System.out.println(js.executeScript("var items = {}; for (index = 0; index < arguments[0].attributes.length; ++index) { items[arguments[0].attributes[index].name] = arguments[0].attributes[index].value }; return items;", WebElementSelect));*/


        System.out.println(w.findElement(By.name("dateMinRange")).getAttribute("validationMessage"));
        Thread.sleep(5000);
        w.close();


    }
    }
