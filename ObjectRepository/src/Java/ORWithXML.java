package Java;

import org.dom4j.Document;
import org.dom4j.io.SAXReader;
import org.openqa.selenium.By;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.File;


public class ORWithXML {
    WebDriver w;
    String filelocation = System.getProperty("user.dir");

    @Test
    public void OR_XML() throws Exception {


        String PropertiesFile = filelocation + File.separator + "Docs_files" + File.separator + "Object Repository" + File.separator + "OrXml.xml";

        SAXReader saxReader = new SAXReader();
        Document XMLdocument = saxReader.read(PropertiesFile);


        String UsrName = XMLdocument.selectSingleNode("//menu/name").getText();
        String UsrNameValue = XMLdocument.selectSingleNode("//menu/nameValue").getText();

        String UsrMail = XMLdocument.selectSingleNode("//menu/email").getText();
        String UsrMailValue = XMLdocument.selectSingleNode("//menu/emailValue").getText();

        String UsrGender = XMLdocument.selectSingleNode("//menu/gender").getText();

        String UsrAddress = XMLdocument.selectSingleNode("//menu/address").getText();
        String UsrAddressValue = XMLdocument.selectSingleNode("//menu/addressValue").getText();

        String Subttn = XMLdocument.selectSingleNode("//menu/submitBttn").getText();

        String UsrTimeDelay = XMLdocument.selectSingleNode("//menu/timedelay").getText();


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

        w.findElement(By.id(UsrName)).sendKeys(UsrNameValue);
        Thread.sleep(Long.parseLong(UsrTimeDelay));

        w.findElement(By.id(UsrMail)).sendKeys(UsrMailValue);
        Thread.sleep(Long.parseLong(UsrTimeDelay));

        w.findElement(By.cssSelector(UsrGender)).click();
        Thread.sleep(Long.parseLong(UsrTimeDelay));

        w.findElement(By.id(UsrAddress)).sendKeys(UsrAddressValue);
        Thread.sleep(Long.parseLong(UsrTimeDelay));

        w.findElement(By.xpath(Subttn)).click();
        Thread.sleep(Long.parseLong(UsrTimeDelay));

        w.findElement(By.linkText("Back")).click();
        Thread.sleep(Long.parseLong(UsrTimeDelay));
        Thread.sleep(Long.parseLong(UsrTimeDelay));


        w.close();
    }
}
