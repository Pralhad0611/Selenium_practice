import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class ImplicitWait
{

    private String filelocation=System.getProperty("user.dir");

    @Test
    public void  Implicit_Wait()
    {
        String ChrmDrvr = filelocation + File.separator + "Drivers" + File.separator + "chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", ChrmDrvr);
        WebDriver driver=new ChromeDriver();
          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
    }
}
