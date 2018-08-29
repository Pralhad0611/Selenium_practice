package Java;

import org.openqa.selenium.WebDriver;

public class DriverDataSource
{
    private WebDriver driver;

    public DriverDataSource()
    {
    }

    public DriverDataSource(WebDriver driver)
    {
        this.driver = driver;
    }

    public WebDriver    getDriver()
    {
        return driver;
    }

    public void setDriver(WebDriver driver)
    {
        this.driver = driver;
    }
}
