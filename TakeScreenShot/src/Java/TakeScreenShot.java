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
    String filelocation = System.getProperty("user.dir");
    String filepath = filelocation+ File.separator+"Docs_files"+File.separator+"Snaps&Videos"+File.separator+"screenshot.jpg";

    @Test
    public void Take_ScreenShot() throws InterruptedException, IOException {
        String ChrmDrvr = filelocation + File.separator + "Drivers" + File.separator + "chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", ChrmDrvr);
        w = new ChromeDriver();
        w.manage().window().maximize();
        w.navigate().to("http://localhost:9000");
        w.manage().deleteAllCookies();

        //Capture entire page screenshot and then store it to destination drive
        File screenshot = ((TakesScreenshot) w).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File(filepath));
        System.out.print("Screenshot is captured");
        Thread.sleep(2000);
        w.close();
    }

}
