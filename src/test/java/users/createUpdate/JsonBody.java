package users.createUpdate;

import net.minidev.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class JsonBody {
    public static String writeNotepad(String text){
        //Creating a JSONObject object
        JSONObject jsonObject = new JSONObject();
        //Inserting key-value pairs into the json object
        jsonObject.put("createdAt", "#ignore");
        jsonObject.put("name", "Zenity");
        jsonObject.put("id", "#ignore");
        jsonObject.put("job", "Developper");
        try {
            FileWriter file = new FileWriter("src/test/java/users/createUpdate/output.json");
            file.write(jsonObject.toJSONString());
            file.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("JSON file created: "+jsonObject);
       /* try {
            FileWriter fileWriter = new FileWriter("src/test/java/users/createUpdate/responseBody.txt", true);
            fileWriter.write("\r\n");
            fileWriter.write(text);
            fileWriter.close();
        } catch (Exception e){
            e.printStackTrace();
        }
        return "PASS";*/
        return text;
    }
}
