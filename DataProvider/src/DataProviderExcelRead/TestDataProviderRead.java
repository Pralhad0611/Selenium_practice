package DataProviderExcelRead;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataProviderRead
{
    DataProviderExcelReadUtility dataProviderExcelRead = new DataProviderExcelReadUtility();
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


        System.out.println(one+" | "+two+" | "+three+" | "+four+" | "+five+" | "+six+" | "+seven+" | "+eight+" | "+nine+" | "+ten);

    }
}
