package Main.Java;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

import java.io.File;

public class DataProviderRead
{
    String filelocation = System.getProperty("user.dir");
    WebDriver driver;
    DataProviderExcelRead dataProviderExcelRead = new DataProviderExcelRead();
   public static String SheetName= "sheet1";
    String ChrmDrvr = filelocation + File.separator + "Drivers" + File.separator + "chromedriver.exe";


        @DataProvider
        public Object[][] getData()
        {
            Object data[][] = dataProviderExcelRead.getTestData(SheetName);
            return data;
        }

    @Test(dataProvider="getData")
    public void validateCreateNewContact(String one, String two, String three, String four,String five,
                                         String six, String seven, String eight, String nine,String ten ){
        System.setProperty("webdriver.chrome.driver", ChrmDrvr);
        driver=new ChromeDriver();


        //contactsPage.createNewContact("Mr.", "Tom", "Peter", "Google");
        System.out.println(one+" "+two+" "+three+" "+four+" "+five+" "+six+" "+seven+" "+eight+" "+nine+""+ten);

    }


}
