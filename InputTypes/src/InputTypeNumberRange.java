import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class InputTypeNumberRange {
    WebDriver w;
    String filelocation = System.getProperty("user.dir");
    String URL = filelocation + File.separator + "Docs_files" + File.separator + "HtmlCssJs" + File.separator + "AllInputTypes.html";
    String AutoITFile = filelocation + File.separator + "Docs_files" + File.separator + "AutoITFiles" + File.separator + "File_Upload.exe";

    @Test
    public void InputType_Password() throws InterruptedException, IOException {
        String ChrmDrvr = filelocation + File.separator + "Drivers" + File.separator + "chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", ChrmDrvr);
        w = new ChromeDriver();
        w.manage().window().maximize();
        w.navigate().to(URL);
        w.manage().deleteAllCookies();
        Thread.sleep(3000);


        String MinRange = w.findElement(By.name("points")).getAttribute("min");
        String MaxRange = w.findElement(By.name("points")).getAttribute("max");


        for (int i = Integer.parseInt(MinRange); i <= Integer.parseInt(MaxRange); i++) {

            w.findElement(By.name("points")).sendKeys(Keys.UP);
            Thread.sleep(50);
        }

        Thread.sleep(3000);
        w.close();

    }
}
