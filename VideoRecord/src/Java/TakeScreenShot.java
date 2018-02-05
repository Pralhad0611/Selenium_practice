package Java;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class TakeScreenShot {

    WebDriver w;

    @Test
    public void TakeScreenShot () throws InterruptedException, IOException
    {
        System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
        w = new ChromeDriver();
        w.manage().window().maximize();
        w.navigate().to("http://localhost:9000");
        w.manage().deleteAllCookies();

        //Capture entire page screenshot and then store it to destination drive
        File screenshot = ((TakesScreenshot)w).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("F:\\screenshot.jpg"));
        System.out.print("Screenshot is captured");
    }

}
