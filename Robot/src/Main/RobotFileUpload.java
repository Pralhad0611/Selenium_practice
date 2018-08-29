package Main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;

public class RobotFileUpload {

    WebDriver w;
    String filelocation=System.getProperty("user.dir");
    String URL = filelocation + File.separator + "Docs_files" + File.separator + "HtmlCssJs" + File.separator + "FileUploads.html";


    @Test
    public void Robot_FileUpload() throws Exception
    {
        String ChrmDrvr = filelocation + File.separator + "Drivers" + File.separator + "chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",ChrmDrvr);
        w=new ChromeDriver();
        w.manage().window().maximize();
        w.navigate().to(URL);
        w.manage().deleteAllCookies();
        Thread.sleep(2000);

    }
}
