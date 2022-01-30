package jsonBody;

import net.minidev.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {

        //Creating a JSONObject object
            JSONObject jsonObject = new JSONObject();
            //Inserting key-value pairs into the json object
            jsonObject.put("createdAt", "#ignore");
            jsonObject.put("name", "Zenity");
            jsonObject.put("id", "#ignore");
            jsonObject.put("job", "Developper");
            try {
                FileWriter file = new FileWriter("src/test/java/jsonBody/output.json");
                file.write(jsonObject.toJSONString());
                file.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        System.out.println("JSON file created: "+jsonObject);
    }
}
