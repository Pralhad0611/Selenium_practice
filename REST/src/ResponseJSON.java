import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.List;

public class ResponseJSON
{
    @Test
    public void JsonPathUsage() throws MalformedURLException
    {
        RestAssured.baseURI = "http://192.168.6.178:9000/common/addressBook/getAll";
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.get("");

        // First get the JsonPath object instance from the Response interface
        JsonPath jsonPathEvaluator = response.jsonPath();

        // Read all the books as a List of String. Each item in the list
        // represent a book node in the REST service Response
        List<String> allBooks = jsonPathEvaluator.getList("nickName");

        // Iterate over the list and print individual book item
        for(String book : allBooks)
        {
            System.out.println("Book: " + book);
        }
}}
