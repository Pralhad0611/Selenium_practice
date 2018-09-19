import com.google.common.base.Function;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Wait;
import java.io.File;
import java.util.concurrent.TimeUnit;

public class FluentWait<W extends SearchContext> {
    private String filelocation=System.getProperty("user.dir");
    protected WebDriver driver;
    @Test
    public void  Fluent_Wait()
    {
        String eTitle = "Demo Guru99 Page";
        String aTitle = "" ;
        String ChrmDrvr = filelocation + File.separator + "Drivers" + File.separator + "chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", ChrmDrvr);
         driver=new ChromeDriver();
        // launch Chrome and redirect it to the Base URL
        driver.get("http://demo.guru99.com/test/guru99home/" );
        //Maximizes the browser window
        driver.manage().window().maximize() ;
        //get the actual value of the title
        aTitle = driver.getTitle();
        //compare the actual title with the expected title
        if (aTitle.contentEquals(eTitle))
        {
            System.out.println( "Test Passed") ;
        }
        else
            {
            System.out.println( "Test Failed" );
        }

       /* Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(30, TimeUnit.SECONDS)
                .pollingEvery(5, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);
        WebElement clickseleniumlink = wait.until(new Function<WebDriver, WebElement>(){

            public WebElement apply(WebDriver driver )
            {
                return driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/div/a/i"));
            }
        });
        //click on the selenium link
        clickseleniumlink.click();*/
        //close~ browser
        driver.close() ;
}}
