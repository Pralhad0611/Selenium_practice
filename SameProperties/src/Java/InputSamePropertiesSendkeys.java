package Java;

import org.openqa.selenium.By;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.io.File;
import java.util.List;

public class InputSamePropertiesSendkeys {
    WebDriver w;
    String filelocation = System.getProperty("user.dir");

    @Test
    public void Inputs_SameProperties() throws Exception {

        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);

        String URL = filelocation + File.separator + "Docs_files" + File.separator + "HtmlCssJs" + File.separator + "Inputs.html";

        String ChrmDrvr = filelocation + File.separator + "Drivers" + File.separator + "chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", ChrmDrvr);
        w = new ChromeDriver(capabilities);
        w.manage().window().maximize();
        w.navigate().to(URL);
        w.manage().deleteAllCookies();
        Thread.sleep(3000);

        String[] Mickey_Mouse = {"Mickey", "Donald Duck", "Daisy", "Goofy", "Max Goof", "Minnie", "Pete",
                "Huey", "Dewey", "Louie", "Pluto", "Blot", "Chip", "Dale",
                "Oswald", "Scrooge", "Angela", "Giselle", "Mildred", "Casey"};


        String cssSelectorsOfSameElements = "input[type='text']";
        List<WebElement> WebInput = w.findElements(By.cssSelector(cssSelectorsOfSameElements));
        System.out.println(WebInput.size());

        for (int i = 0; i < WebInput.size(); i++) {
            WebInput.get(i).sendKeys(Mickey_Mouse[i]);
        }
        Thread.sleep(2000);
        w.close();

    }

}
