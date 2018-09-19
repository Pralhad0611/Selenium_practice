import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class POST_Request
{
    @Test
    public void RegistrationSuccessful()
    {
        RestAssured.baseURI ="192.168.6.53:9004/assets/js/index.js";
        RequestSpecification request = RestAssured.given();

        JSONObject requestParams = new JSONObject();
        requestParams.put("username", "8369808142"); // Cast
       /* requestParams.put("LastName", "Singh");
        requestParams.put("UserName", "sdimpleuser2dd2011");*/
        requestParams.put("Password", "1234");

       // requestParams.put("Email",  "sample2ee26d9@gmail.com");
        request.body(requestParams.toJSONString());
        Response response = request.post("/register");

        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, "201");
        String successCode = response.jsonPath().get("SuccessCode");
        Assert.assertEquals( "Correct Success code was returned", successCode, "OPERATION_SUCCESS");
    }
}
