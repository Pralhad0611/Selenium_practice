package Java;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import javax.swing.*;
import java.io.File;


public class DropDownOnPoup
{

    JFrame f;
    WebDriver w;

    String filelocation = System.getProperty("user.dir");

    @Test
    public void DropDown_ByValue() throws Exception
    {
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);

        String URL = filelocation + File.separator + "Docs_files" + File.separator + "HtmlCssJs" + File.separator + "DropDowns.html";

        String ChrmDrvr = filelocation + File.separator + "Drivers" + File.separator + "chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", ChrmDrvr);
        w = new ChromeDriver(capabilities);
        w.manage().window().maximize();
        w.navigate().to(URL);
        w.manage().deleteAllCookies();
        Thread.sleep(3000);

        String pp = "hello";
        JavascriptExecutor js = (JavascriptExecutor) w;
        js.executeScript("function myFunction(" + pp + "){    Country = prompt('Please enter Country name:', '').toUpperCase();    return Country; var intro = document.createElement('p'); var s;      document.getElementsByTagName('p').innerHTML = myFunction(s);", "");

        Thread.sleep(3000);

        w.close();


    }

}
