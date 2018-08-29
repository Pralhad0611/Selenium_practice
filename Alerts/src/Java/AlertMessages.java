package Java;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;

public class AlertMessages {
    WebDriver w;
    String filelocation = System.getProperty("user.dir");
    String URL = filelocation + File.separator + "Docs_files" + File.separator + "HtmlCssJs" + File.separator + "AllInputTypes.html";


    @Test
    public void InputType_Date() throws InterruptedException, IOException {
        Reporter.log("gfgdd",true);
        String ChrmDrvr = filelocation + File.separator + "Drivers" + File.separator + "chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", ChrmDrvr);
        w = new ChromeDriver();
        w.manage().window().maximize();
        w.navigate().to(URL);
        w.manage().deleteAllCookies();
        Thread.sleep(3000);

        w.findElement(By.id("subutton")).click();
        Thread.sleep(700);
        System.out.println("Input Required message:- " + (w.findElement(By.name("Text")).getAttribute("validationMessage")));
        Thread.sleep(5000);
        w.findElement(By.name("Text")).sendKeys("1234");
        Thread.sleep(2000);

        w.findElement(By.name("Email")).sendKeys("1234");
        Thread.sleep(700);
        w.findElement(By.id("subutton")).click();
        Thread.sleep(700);
        System.out.println("Wrong Email message:- " + (w.findElement(By.name("Email")).getAttribute("validationMessage")));
        Thread.sleep(5000);
        w.findElement(By.name("Email")).clear();
        Thread.sleep(2000);

        w.findElement(By.name("Date")).sendKeys("01");
        Thread.sleep(700);
        w.findElement(By.id("subutton")).click();
        Thread.sleep(700);
        System.out.println("Invalid or Incomplete Date message:- " + (w.findElement(By.name("Date")).getAttribute("validationMessage")));
        Thread.sleep(5000);
        w.findElement(By.name("Date")).sendKeys(Keys.DELETE);
        Thread.sleep(2000);

        w.findElement(By.name("dateMinRange")).sendKeys("01/01/1985");
        Thread.sleep(700);
        w.findElement(By.id("subutton")).click();
        Thread.sleep(700);
        System.out.println("Minimum Range Date message:- " + (w.findElement(By.name("dateMinRange")).getAttribute("validationMessage")));
        Thread.sleep(5000);
        w.findElement(By.name("dateMinRange")).sendKeys(Keys.DELETE, Keys.TAB, Keys.DELETE, Keys.TAB, Keys.DELETE);
        Thread.sleep(2000);

        w.findElement(By.name("dateMaxRange")).sendKeys("01/01/1985");
        Thread.sleep(700);
        w.findElement(By.id("subutton")).click();
        Thread.sleep(700);
        System.out.println("Maximum Range Date message:- " + (w.findElement(By.name("dateMaxRange")).getAttribute("validationMessage")));
        Thread.sleep(5000);
        w.findElement(By.name("dateMaxRange")).sendKeys(Keys.DELETE, Keys.TAB, Keys.DELETE, Keys.TAB, Keys.DELETE);
        Thread.sleep(2000);

        w.findElement(By.name("bdaymonth")).sendKeys("September");
        Thread.sleep(700);
        w.findElement(By.id("subutton")).click();
        Thread.sleep(700);
        System.out.println("Incomplete Month message:- " + (w.findElement(By.name("bdaymonth")).getAttribute("validationMessage")));
        Thread.sleep(5000);
        w.findElement(By.name("bdaymonth")).sendKeys(Keys.DELETE);
        Thread.sleep(2000);

        w.findElement(By.name("points")).sendKeys("-100");
        Thread.sleep(700);
        w.findElement(By.id("subutton")).click();
        Thread.sleep(700);
        System.out.println("Wrong Number message:- " + (w.findElement(By.name("points")).getAttribute("validationMessage")));
        Thread.sleep(5000);
        w.findElement(By.name("points")).clear();
        Thread.sleep(2000);

        w.findElement(By.name("week_year")).sendKeys("10");
        Thread.sleep(700);
        w.findElement(By.id("subutton")).click();
        Thread.sleep(700);
        System.out.println("Wrong Week message:- " + (w.findElement(By.name("week_year")).getAttribute("validationMessage")));
        Thread.sleep(5000);
        w.findElement(By.name("week_year")).sendKeys(Keys.DELETE);
        Thread.sleep(5000);

        w.close();

    }
}
