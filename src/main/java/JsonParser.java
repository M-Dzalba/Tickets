
import com.fasterxml.jackson.databind.ObjectMapper;
import model.Root;

import java.io.FileInputStream;
import java.io.IOException;

public class JsonParser  {
    public static Root jsonParse(){
        String filePath="D:\\JAVA_projects\\Work_tasks\\Tickets\\tickets.json";
        Root root ;
        ObjectMapper objectMapper = new ObjectMapper();
        {
            try {
                root = objectMapper.readValue(new FileInputStream(filePath),Root.class);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return root;
    }

}
