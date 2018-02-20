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
import java.io.FileInputStream;
import java.util.Properties;

public class ORWithPropertiesFile {

    WebDriver w;
    String filelocation = System.getProperty("user.dir");

    @Test
    public void OR_WithPropertiesFile() throws Exception {

        Properties obj = new Properties();
        String PropertiesFile = filelocation + File.separator + "Docs_files" + File.separator + "Object Repository" + File.separator + "application.properties";
        FileInputStream objfile = new FileInputStream(PropertiesFile);
        obj.load(objfile);

        obj.getProperty("Name");
        obj.getProperty("Mail");
        obj.getProperty("Gender");
        obj.getProperty("Address");
        obj.getProperty("TimeDelay");


        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);

        String URL = filelocation + File.separator + "Docs_files" + File.separator + "HtmlCssJs" + File.separator + "Forms.html";

        String ChrmDrvr = filelocation + File.separator + "Drivers" + File.separator + "chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", ChrmDrvr);
        w = new ChromeDriver(capabilities);
        w.manage().window().maximize();
        w.navigate().to(URL);
        w.manage().deleteAllCookies();
        Thread.sleep(3000);

        w.findElement(By.id("name")).sendKeys(obj.getProperty("Name"));
        Thread.sleep(Long.parseLong(obj.getProperty("TimeDelay")));

        w.findElement(By.id("email")).sendKeys(obj.getProperty("Mail"));
        Thread.sleep(Long.parseLong(obj.getProperty("TimeDelay")));

        w.findElement(By.cssSelector("input[id='" + obj.getProperty("Gender") + "']")).click();
        Thread.sleep(Long.parseLong(obj.getProperty("TimeDelay")));

        w.findElement(By.id("description")).sendKeys(obj.getProperty("Address"));
        Thread.sleep(Long.parseLong(obj.getProperty("TimeDelay")));

        w.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(Long.parseLong(obj.getProperty("TimeDelay")));
        w.findElement(By.linkText("Back")).click();
        Thread.sleep(Long.parseLong(obj.getProperty("TimeDelay")));
        w.close();
    }
}
