import org.openqa.selenium.By;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.io.File;

public class PhantomHeadless
{
    @Test
    public static void Phantom()
    {
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);

        String filelocation = System.getProperty("user.dir");

        String phantomDrvr = filelocation + File.separator + "Drivers" + File.separator +"phantomjs.exe";
        System.setProperty("phantomjs.binary.path", phantomDrvr);
        // System.setProperty("phantomjs.binary.path", file.getAbsolutePath());
        WebDriver driver = new PhantomJSDriver();
        driver.get("http://www.google.com");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Guru99");
        element.submit();
        System.out.println("Page title is: " + driver.getTitle());
        driver.quit();

    }
}
