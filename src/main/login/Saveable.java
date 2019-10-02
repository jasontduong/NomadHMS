package login;

import java.io.IOException;

public interface Saveable {

    // REQUIRES: .txt file
    // MODIFIES: this
    // EFFECTS: saves any string input into a text file
    public void save(String user1, String pass1) throws IOException;
}