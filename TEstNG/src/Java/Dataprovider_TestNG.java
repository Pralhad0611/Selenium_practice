package Java;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider_TestNG {
    @DataProvider(name = "StateCapital")
    public Object[][] login() {
        return new String[][]{
                {"Maharashtra", "Mumbai"}, {"Goa", "Panji"}, {"Karnataka", "Banglore"}};
    }


    @Test(dataProvider = "StateCapital")
    public void login1(String State, String Capital) {
        System.out.println(State + " " + Capital);

    }

}
