import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class JOB
{

    @Test
    public static void TestCase_011() throws Exception
    {
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        String url="http://125.18.224.122/ERP10Demo-EWA/ice.ewa.syslogin.aspx?Return=ice.ewa.shell.aspx";
        WebDriver w;
        String filelocation = System.getProperty("user.dir");
        String ChrmDrvr = filelocation + File.separator + "Drivers" + File.separator + "chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", ChrmDrvr);
        w = new ChromeDriver(capabilities);
        w.manage().window().maximize();

        w.navigate().to(url);
        w.manage().deleteAllCookies();
        Thread.sleep(3000);

        w.findElement(By.id("txtUserID")).sendKeys("manager");
        Thread.sleep(2000);
        w.findElement(By.id("txtPassword")).sendKeys("manager");
        Thread.sleep(3000);

        w.findElement(By.id("btnLogin")).click();
        Thread.sleep(25000);
        //w.findElement(By.id("company")).click();
        WebDriverWait wait = new WebDriverWait(w, 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("company")));
        /* wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Epicor Education, Main")));
        w.findElement(By.id("company")).click();*/
        //
        // WebElement ColorElement = w.findElement(By.cssSelector("a[id='company']"));
        WebElement ColorElement = w.findElement(By.cssSelector("a[outerText='Epicor Education, Main'}"));
        ColorElement.click();
        //Assert.assertTrue(w.findElement(By.id("company")).isDisplayed());
    }
}
