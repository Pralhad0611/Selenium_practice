import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;

public class SwitchToFrame_ID
{
    private String filelocation=System.getProperty("user.dir");
    @Test
    public void SwitchToFrame_ID() throws Exception
    {
        String ChrmDrvr = filelocation + File.separator + "Drivers" + File.separator + "chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", ChrmDrvr);
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize() ;
        driver.get("http://demo.guru99.com/test/guru99home/");
        driver.manage().window().maximize();
        driver.switchTo().frame("a077aa5e"); //switching the frame by ID

        System.out.println("********We are switch to the iframe*******");
        driver.findElement(By.xpath("html/body/a/img")).click();
        Thread.sleep(5000);
        driver.switchTo().defaultContent();

    }

}
