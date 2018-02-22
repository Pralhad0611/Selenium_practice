package Java;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.io.File;

public class FetchWebTable {


    WebDriver w;
    String filelocation = System.getProperty("user.dir");

    @Test
    public void Fetch_WebTable() throws Exception {

        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);

        String URL = filelocation + File.separator + "Docs_files" + File.separator + "HtmlCssJs" + File.separator + "tables.html";

        String ChrmDrvr = filelocation + File.separator + "Drivers" + File.separator + "chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", ChrmDrvr);
        w = new ChromeDriver(capabilities);
        w.manage().window().maximize();
        w.navigate().to(URL);
        w.manage().deleteAllCookies();
        Thread.sleep(3000);


        int rowCount = w.findElements(By.tagName("tr")).size();                       //Row Count

        int colCount = w.findElements(By.xpath("//tr/th")).size();                   // Column Count


        for (WebElement tableData : w.findElements(By.tagName("tr"))) {
            System.out.println(tableData.getText());
        }

        Thread.sleep(2000);
        w.quit();
    }
}
