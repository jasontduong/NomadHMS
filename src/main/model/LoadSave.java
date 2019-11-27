package model;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class LoadSave implements Serializable {
    private BufferedReader bufferedReader;
    private String input;

    public boolean load(String user, String pass) {
        try {
            String filePath = ("data/accounts.txt");
            bufferedReader = new BufferedReader(new FileReader(filePath));
            boolean loginExists = false;
            while ((input = bufferedReader.readLine()) != null) {
                if (input.equals(user + ":" + pass)) {
                    loginExists = true;
                    break;
                }
            }
            return loginExists;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public String save(String user1, String pass1) throws IOException {
        BufferedWriter out = new BufferedWriter(new FileWriter("data/accounts.txt", true));
        out.write(user1 + ":" + pass1);
        out.newLine();
        out.close();
        return "Success!";
    }
}
