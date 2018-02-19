import org.openqa.selenium.By;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.io.File;
import java.util.List;

public class InputSamePropertiesDeleteWithoutclick {
    WebDriver w;
    String filelocation = System.getProperty("user.dir");


    @Test
    public void InputSameProperties_DeleteWithoutclick() throws  Exception {

        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);

        String URL = filelocation + File.separator + "Docs_files" + File.separator + "HtmlCssJs" + File.separator + "Inputs.html";

        String ChrmDrvr = filelocation + File.separator + "Drivers" + File.separator + "chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", ChrmDrvr);
        w = new ChromeDriver(capabilities);
        w.manage().window().maximize();
        w.navigate().to(URL);
        w.manage().deleteAllCookies();
        Thread.sleep(3000);

        String cssSelectorsOfSameElements = "input[type='text']";
        List<WebElement> WebInput = w.findElements(By.cssSelector(cssSelectorsOfSameElements));

        System.out.println(WebInput.size());



        JavascriptExecutor js = (JavascriptExecutor)w;
       for(int i=0;i<WebInput.size();i++)
        {
            js.executeScript("arguments[0].parentNode.removeChild(arguments[0])", WebInput.get(i));

        }
        Thread.sleep(5000);
        w.close();
    }
}
