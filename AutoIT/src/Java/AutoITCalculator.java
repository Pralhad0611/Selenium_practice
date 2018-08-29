package Java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;

public class AutoITCalculator {

    WebDriver w;
    String filelocation=System.getProperty("user.dir");
    String URL = filelocation + File.separator + "Docs_files" + File.separator + "HtmlCssJs" + File.separator + "FileUploads.html";
    String AutoITFile = filelocation + File.separator + "Docs_files" + File.separator + "AutoITFiles" + File.separator + "File_Upload.exe";

    @Test
    public void AutoIT_Calculator() throws Exception
    {
        String ChrmDrvr=filelocation+File.separator+"Drivers"+File.separator+"chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",ChrmDrvr);
        w=new ChromeDriver();
        w.manage().window().maximize();
        w.navigate().to("");
        w.manage().deleteAllCookies();
        Thread.sleep(2000);
    }
}
