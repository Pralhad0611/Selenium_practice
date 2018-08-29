package Java;

import org.openqa.selenium.Alert;

public class AlertHandling
{
    private Alert alert;
    private static DriverDataSource driverDataSource;

    public AlertHandling(DriverDataSource driverDataSource)
    {
        this.driverDataSource = driverDataSource;
    }

    public void AlertAccept()throws Exception
    {
        Thread.sleep(2000);
        this.alert=driverDataSource.getDriver().switchTo().alert();
        this.alert.accept();
    }


    public void AlertDismiss()throws Exception
    {
        this.alert=driverDataSource.getDriver().switchTo().alert();
        this.alert.dismiss();
    }

    public String AlertSendText(String AlertTxt) throws Exception
    {
        this.alert=driverDataSource.getDriver().switchTo().alert();
        AlertTxt=(this.alert.getText()).toString();
        return AlertTxt;
    }

    public void AlertGetText(String AlertSendTxt)
    {

        this.alert=driverDataSource.getDriver().switchTo().alert();
        this.alert.sendKeys(AlertSendTxt);
    }
}
