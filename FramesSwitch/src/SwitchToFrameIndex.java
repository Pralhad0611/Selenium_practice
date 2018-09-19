import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;

public class SwitchToFrameIndex
{
    private String filelocation=System.getProperty("user.dir");

    @Test
    public void SwitchToFrameIndex() throws Exception
    {
             String ChrmDrvr = filelocation + File.separator + "Drivers" + File.separator + "chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", ChrmDrvr);
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/guru99home/");

    //driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    int size = driver.findElements(By.tagName("iframe")).size();

      for(int i=0; i<=size; i++){
          System.out.println("_+"+i);
   driver.switchTo().frame(i);
   Thread.sleep(2000);
    int total=driver.findElements(By.xpath("html/body/a/img")).size();
    System.out.println(total);
    System.out.println("_"+i);
          driver.switchTo().frame(0);

   // driver.switchTo().defaultContent();
	    }
    }
}

