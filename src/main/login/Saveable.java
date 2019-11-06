package login;

import java.io.IOException;
import java.util.HashMap;

public interface Saveable {

    // REQUIRES: .txt file
    // MODIFIES: this
    // EFFECTS: saves any string input into a text file
    void save(HashMap<String, String> users) throws IOException;
}
