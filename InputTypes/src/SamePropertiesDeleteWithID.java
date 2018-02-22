import org.openqa.selenium.By;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.io.File;
import java.util.List;

public class SamePropertiesDeleteWithID {
    WebDriver w;
    String filelocation = System.getProperty("user.dir");

    @Test
    public void SameProperties_DeleteWithID() throws Exception {

        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);

        String URL = filelocation + File.separator + "Docs_files" + File.separator + "HtmlCssJs" + File.separator + "SameProperties.html";

        String ChrmDrvr = filelocation + File.separator + "Drivers" + File.separator + "chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", ChrmDrvr);
        w = new ChromeDriver(capabilities);
        w.manage().window().maximize();
        w.navigate().to(URL);
        w.manage().deleteAllCookies();
        Thread.sleep(3000);

        for (int ii = 0; ii <= 10; ii++) {
            w.findElement(By.id("btn1")).click();
        }
        Thread.sleep(5000);

        String cssSelectorsOfSameElements1 = "i[class='fa fa-remove']";
        List<WebElement> WebInput = w.findElements(By.cssSelector(cssSelectorsOfSameElements1));


        for (int i = 0; i < WebInput.size(); i++) {
            w.findElement(By.id("Icon_" + i + "")).click();
        }
        Thread.sleep(2000);
        w.close();
    }
}
