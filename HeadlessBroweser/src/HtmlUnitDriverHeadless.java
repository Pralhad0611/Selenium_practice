import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import java.util.concurrent.TimeUnit;

public class HtmlUnitDriverHeadless
{
    @Test
    public void htmlUnitHead()
    {
        WebDriver driver=  new HtmlUnitDriver();
        driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
        driver.get("http://www.google.com");
    }
}
