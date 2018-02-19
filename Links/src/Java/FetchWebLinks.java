package Java;

import org.openqa.selenium.By;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.io.File;

public class FetchWebLinks {
    WebDriver w;
    String filelocation = System.getProperty("user.dir");

    @Test
    public void Fetch_WebLinks() throws  Exception {

        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);

        String URL = filelocation+ File.separator+"Docs_files"+ File.separator+"HtmlCssJs"+File.separator+ "links.html";

        String ChrmDrvr = filelocation + File.separator + "Drivers" + File.separator + "chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", ChrmDrvr);
        w = new ChromeDriver(capabilities);
        w.manage().window().maximize();
        w.navigate().to(URL);
        w.manage().deleteAllCookies();
        Thread.sleep(3000);

        int Linksount=w.findElements(By.tagName("a")).size();  //get total no of links
   //     System.out.println(Linksount);

        for(WebElement WebLinks : w.findElements(By.tagName("a")))
        {
            System.out.println(WebLinks.getText());

        }
        Thread.sleep(2000);
        w.close();
    }
}
