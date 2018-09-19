package Java;


import org.json.JSONException;
import org.json.JSONTokener;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import java.io.*;
import java.util.Iterator;


public class JsonRead {

        WebDriver w;
            String filelocation = System.getProperty("user.dir");
            String JsonFile = filelocation + File.separator + "Docs_files" + File.separator + "Jsons" + File.separator + "colors.json";

            @Test
            public void Json_Read() throws InterruptedException, IOException,JSONException   {

                JSONParser parser = new JSONParser();

                try {

                    Object obj = parser.parse(new FileReader(JsonFile));

                    JSONObject jsonObject = (JSONObject) obj;
                    System.out.println(jsonObject);

                    String color = (String) jsonObject.get("color");
                    System.out.println(color);

                    String category = (String) jsonObject.get("category");
                    System.out.println(category);

                    String type = (String) jsonObject.get("type");
                    System.out.println(type);

                    // loop array
                    JSONArray code = (JSONArray) jsonObject.get("code");
                    Iterator<String> iterator = code.iterator();
                    while (iterator.hasNext()) {
                        System.out.println(iterator.next());
                    }

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (ParseException e) {
                    e.printStackTrace();
                }
        }
}
