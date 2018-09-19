import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.File;

public class ExplicitWait
{
    private  String filelocation=System.getProperty("user.dir");
    //String filelocation = ;

    @Test
    public void Explicit_Wait() throws Exception
    {
        String ChrmDrvr = filelocation + File.separator + "Drivers" + File.separator + "chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", ChrmDrvr);
        WebDriver driver=new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("someid")));
    }
}
