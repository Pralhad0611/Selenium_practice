package Java;

import org.monte.screenrecorder.ScreenRecorder;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TwoSliders {

    WebDriver w;

   @Test
    public void Two_Sliders() throws Exception {

        System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
        w = new ChromeDriver();
        w.manage().window().maximize();
        w.navigate().to("http://automationpractice.com");
        w.manage().deleteAllCookies();
        Thread.sleep(3000);

        JavascriptExecutor js = (JavascriptExecutor) w;

        w.findElement(By.linkText("T-SHIRTS")).click();
        Thread.sleep(3000);

        WebElement slider1 = w.findElement(By.xpath("//*[@id='layered_price_slider']/a[1]"));
       // WebElement slider = w.findElement(By.xpath("//html/body/div[1]/div[2]/div/div[3]/div[1]/div[1]/div[1]/form/div/div[10]/ul/div/div/a[1]"));
        js.executeScript("arguments[0].scrollIntoView();", slider1);
        Thread.sleep(2000);

        Actions move = new Actions(w);
        Action action = (Action) move.dragAndDropBy(slider1, 30, 0).build();
        action.perform();
        Thread.sleep(3000);


        WebElement slider2 = w.findElement(By.xpath("//*[@id='layered_price_slider']/a[2]"));
        Actions moveSecondSlider = new Actions(w);
        Action SecondSlider = (Action) moveSecondSlider.dragAndDropBy(slider2, -40, 0).build();
        SecondSlider.perform();


    }
}
