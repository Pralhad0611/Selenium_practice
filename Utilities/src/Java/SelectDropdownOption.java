package Java;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SelectDropdownOption
{
    public static Select SelectOption;

    public static void CompareOption(WebElement DropDownElement, String DropDownOptionValue) throws Exception
    {
        SelectOption =new Select(DropDownElement);
        List<WebElement> DropdownOptions=SelectOption.getOptions();

        for(WebElement DropDownEachValue:DropdownOptions)
        {
            if(DropDownEachValue.getText().trim().toString().equalsIgnoreCase(DropDownOptionValue.toString()))
            {
                SelectOption.selectByVisibleText(DropDownOptionValue.toString());
            }
        }
    }

    public static void VerifyOption(WebElement DropDownElement, WebDriver driver)throws Exception
    {
        SelectOption =new Select(DropDownElement);
        if(SelectOption.getFirstSelectedOption().getAttribute("label").equalsIgnoreCase("-Please Select-"))
        /*if(SelectOption.getFirstSelectedOption().getAttribute("label").equalsIgnoreCase("-Please Select-")||
        (!SelectOption.getFirstSelectedOption().isSelected()))*/
        {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("alert('Wrong Drop down option selected.Closing Browser')");
            Thread.sleep(2000);
            Alert alert = driver.switchTo().alert();
            alert.accept();
            Thread.sleep(3000);
            driver.close();
        }
    }
}
