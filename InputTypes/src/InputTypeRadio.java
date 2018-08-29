import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class InputTypeRadio {

    WebDriver w;
    String filelocation = System.getProperty("user.dir");
    String URL = filelocation + File.separator + "Docs_files" + File.separator + "HtmlCssJs" + File.separator + "AllInputTypes.html";

    @Test
    public void InputType_Radio() throws InterruptedException, IOException {
        String ChrmDrvr = filelocation + File.separator + "Drivers" + File.separator + "chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", ChrmDrvr);
        w = new ChromeDriver();
        w.manage().window().maximize();
        w.navigate().to(URL);
        w.manage().deleteAllCookies();
        Thread.sleep(3000);

        List<WebElement> radioBtn = w.findElements(By.name("gender"));

        radioBtn.get(1).click();
        Thread.sleep(500);
        radioBtn.get(2).click();
        Thread.sleep(500);
        radioBtn.get(0).click();
        Thread.sleep(500);
        radioBtn.get(1).click();
        Thread.sleep(500);
        radioBtn.get(2).click();
        Thread.sleep(2000);

        w.close();


    }
}
