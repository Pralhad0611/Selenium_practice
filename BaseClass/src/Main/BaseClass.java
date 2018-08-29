package Main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;

public class BaseClass {

    WebDriver w;
    String filelocation = System.getProperty("user.dir");

    @BeforeClass
    public void setupApplication() throws Exception{

        Reporter.log("=====Browser Session Started=====", true);
        String URL = filelocation + File.separator + "Docs_files" + File.separator + "HtmlCssJs" + File.separator + "Forms.html";

        String ChrmDrvr = filelocation + File.separator + "Drivers" + File.separator + "chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", ChrmDrvr);
        w = new ChromeDriver();
        w.manage().window().maximize();
        w.navigate().to("http://192.168.6.53:9004/");
        w.manage().deleteAllCookies();
        Reporter.log("=====Application Started=====", true);
        Thread.sleep(5000);
        w.findElement(By.linkText("Login")).click();
    }


    @AfterClass
    public void closeApplication() {
        w.quit();
        Reporter.log("=====Browser Session End=====", true);

    }
}



