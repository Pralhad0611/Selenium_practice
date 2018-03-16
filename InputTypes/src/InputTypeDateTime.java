import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class InputTypeDateTime {
    WebDriver w;
    String filelocation = System.getProperty("user.dir");
    String URL = filelocation + File.separator + "Docs_files" + File.separator + "HtmlCssJs" + File.separator + "AllInputTypes.html";
    String AutoITFile = filelocation + File.separator + "Docs_files" + File.separator + "AutoITFiles" + File.separator + "File_Upload.exe";

    @Test
    public void InputType_CheckBox() throws InterruptedException, IOException {
        String ChrmDrvr = filelocation + File.separator + "Drivers" + File.separator + "chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", ChrmDrvr);
        w = new ChromeDriver();
        w.manage().window().maximize();
        w.navigate().to(URL);
        w.manage().deleteAllCookies();
        Thread.sleep(3000);

        WebElement dateTimeField = w.findElement(By.name("DateTime"));

        dateTimeField.sendKeys("09252013");
        dateTimeField.sendKeys(Keys.TAB);
        dateTimeField.sendKeys("0245PM");

    }
}
