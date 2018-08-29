package Java;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class JsonWrite {
    WebDriver w;
    String filelocation = System.getProperty("user.dir");
    String JsonFile = filelocation + File.separator + "Docs_files" + File.separator + "Jsons" + File.separator + "colors.json";
    String JsonFileWrite = filelocation + File.separator + "Docs_files" + File.separator + "Jsons" + File.separator + "colors1.json";

    @Test
    public void Json_Write() throws Exception {
        JSONObject obj = new JSONObject();
        obj.put("name", "mkyong.com");
        obj.put("age", new Integer(100));

        JSONArray list = new JSONArray();
        list.put("msg 1");
        list.put("msg 2");
        list.put("msg 3");

        obj.put("messages", list);

        try (FileWriter file = new FileWriter(JsonFileWrite)) {

            file.write(obj.toString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print(obj);
    }
}
