package Java;

import org.openqa.selenium.JavascriptExecutor;

public class PageScrollUpDown
{
    private static DriverDataSource driverDataSource;

    public PageScrollUpDown(DriverDataSource driverDataSource)
    {
        this.driverDataSource = driverDataSource;
    }


    public void ScrollDown()throws Exception
    {
        JavascriptExecutor js = (JavascriptExecutor) driverDataSource.getDriver();
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

    }

}
