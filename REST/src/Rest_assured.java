import Main.Java.DataProviderExcelRead;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Rest_assured
{
    @Test
    public void Mouse_Over() throws Exception
    {
      /*  RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
        RequestSpecification requestSpecification=RestAssured.given();
        Response response=requestSpecification.request(Method.GET,"/Mumbai");
        String responseBody=response.getBody().asString();

        System.out.println(response);
        System.out.println(responseBody);*/

        RestAssured.baseURI="http://192.168.6.53:9004";
        RequestSpecification requestSpecification=RestAssured.given();
        Response response=requestSpecification.request(Method.GET,"/assets/images/browserAlert.png");
        String responseBody=response.getBody().asString();

        System.out.println(response);
        System.out.println(responseBody);

    }
}
