package Java;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import javax.swing.*;
import java.io.File;
import java.util.List;

public class DropDownByVisibleText {

    JFrame f;
    WebDriver w;
    String filelocation = System.getProperty("user.dir");
    Thread trd = new Thread();

    @Test
    public void DropDownBy_VisibleText() throws UnhandledAlertException, Exception {

        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);

        String URL = filelocation + File.separator + "Docs_files" + File.separator + "HtmlCssJs" + File.separator + "DropDowns.html";

        String ChrmDrvr = filelocation + File.separator + "Drivers" + File.separator + "chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", ChrmDrvr);
        w = new ChromeDriver(capabilities);
        w.manage().window().maximize();
        w.navigate().to(URL);
        w.manage().deleteAllCookies();
        Thread.sleep(3000);


        f = new JFrame();
        String CountryName = JOptionPane.showInputDialog(f, "Enter Country Name");

        WebElement WebElementDropDown = w.findElement(By.id("countries"));
        Select sElementDropDown = new Select(WebElementDropDown);


        List<WebElement> optins = sElementDropDown.getOptions();
        System.out.println(optins.size());
        int iDropElement = 1;
        for (WebElement ww : optins) {
            if (ww.getText().trim().equalsIgnoreCase(CountryName)) {

                sElementDropDown.selectByVisibleText(ww.getText());
                Thread.sleep(1000);
                JOptionPane.showMessageDialog(f, "Country Name Selected in Drop down");
            } else {
                if (iDropElement == optins.size()) {
                    JOptionPane.showMessageDialog(f, "Wrong Country Name");

                }
            }
            iDropElement++;
        }
        Thread.sleep(3000);

        w.close();
    }
}
