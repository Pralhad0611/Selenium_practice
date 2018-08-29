package Java;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
    private static DriverDataSource dataSource;

    static {
        dataSource = new DriverDataSource();
    }

    public BrowserFactory() {

    }


    public static DriverDataSource getOpenChrome() throws Exception {
        System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
        dataSource.setDriver(new ChromeDriver());
        dataSource.getDriver().manage().window().maximize();
        dataSource.getDriver().navigate().to(ConstantData.URL);
        Thread.sleep(5000);

        return dataSource;
    }


    public static DriverDataSource getOpenIE() throws Exception
    {
        System.setProperty("webdriver.ie.driver", "F:/iedriver.exe");
        dataSource.setDriver(new InternetExplorerDriver());
        dataSource.getDriver().manage().window().maximize();
        dataSource.getDriver().navigate().to(ConstantData.URL);
        Thread.sleep(5000);

        return dataSource;
    }

    public static DriverDataSource getOpenFireFox() throws Exception
    {
        dataSource.setDriver(new FirefoxDriver());
        dataSource.getDriver().manage().window().maximize();
        dataSource.getDriver().navigate().to(ConstantData.URL);
        Thread.sleep(5000);
        return dataSource;
    }

    public static DriverDataSource closeBrowser() throws Exception
    {
        Thread.sleep(5000);
        dataSource.getDriver().close();
        return  dataSource;
    }
}
