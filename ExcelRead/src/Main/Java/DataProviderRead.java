package Main.Java;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

import java.io.File;

public class DataProviderRead
{
    String ello;
    DataProviderExcelRead dataProviderExcelRead = new DataProviderExcelRead();
   public static String SheetName= "sheet1";


        @DataProvider
        public Object[][] getData()
        {
            Object data[][] = dataProviderExcelRead.getTestData(SheetName);
            return data;
        }

    @Test(dataProvider="getData")
    public void validateCreateNewContact(String one, String two, String three, String four,String five,
                                         String six, String seven, String eight, String nine,String ten ){

        //contactsPage.createNewContact("Mr.", "Tom", "Peter", "Google");
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
        System.out.println(five);
        System.out.println(six);
        System.out.println(seven);
        System.out.println(eight);
        System.out.println(nine);
        System.out.println(ten);

    }


}
