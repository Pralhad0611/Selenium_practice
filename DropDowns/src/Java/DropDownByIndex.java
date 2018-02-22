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
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class DropDownByIndex {

    JFrame f;
    WebDriver w;
    String filelocation = System.getProperty("user.dir");

    @Test
    public void DropDown_ByIndex() throws UnhandledAlertException, Exception, NumberFormatException {

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

        WebElement WebElementDropDown = w.findElement(By.id("countries"));
        Select sElementDropDown = new Select(WebElementDropDown);

        List<WebElement> optins = sElementDropDown.getOptions();
        String CountryIndex;

        CountryIndex = JOptionPane.showInputDialog(f, "Enter Index value between 0 and " + optins.size() + "");
        Pattern p = Pattern.compile("[A-Z,a-z,&%$#@!()*^]");
        Matcher m = p.matcher(CountryIndex);
        if (CountryIndex.isEmpty()) {
            JOptionPane.showMessageDialog(f, "Not gave Index value");
        } else {
            if (m.find()) {
                JOptionPane.showMessageDialog(null, "Entered String");
            } else {

                int iDropElement = 1;
                for (int k = 0; k <= optins.size(); k++) {
                    if (k == Integer.parseInt(CountryIndex)) {
                        sElementDropDown.selectByIndex(Integer.parseInt(CountryIndex));
                        Thread.sleep(1000);
                        JOptionPane.showMessageDialog(f, sElementDropDown.getFirstSelectedOption().getText().toString() + " is Country Name Selected in Drop down");
                        break;
                    } else {
                        if (iDropElement == optins.size()) {
                            JOptionPane.showMessageDialog(f, "Wrong Index value ");

                        }
                    }
                    iDropElement++;
                }
            }
        }
        Thread.sleep(1000);
        w.close();


    }
}
