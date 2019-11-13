package login;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class LoadSave implements Serializable {
    Map<String, String> userpass = new HashMap<>();
    String filePath = ("data/accounts3.txt");

    public HashMap<String, String> load() throws IOException, ClassNotFoundException {
        {
            HashMap loginInfo = new HashMap<String, String>();
            try (ObjectInputStream is = new ObjectInputStream(new FileInputStream(filePath))) {
                while (loginInfo.isEmpty()) {
                    loginInfo = (HashMap) is.readObject();
                }
                return loginInfo;
            }
        }
    }

    public void save(Map<String, String> users) throws IOException {
        FileOutputStream fileOut = new FileOutputStream(filePath);
        {
            try (ObjectOutputStream os = new ObjectOutputStream(fileOut)) {
                os.writeObject(userpass);
                os.close();
                fileOut.close();
            }
        }
    }
}
