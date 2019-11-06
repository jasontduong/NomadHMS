package login;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public interface Saveable {

    // REQUIRES: .txt file
    // MODIFIES: this
    // EFFECTS: saves any string input into a text file
    void save(Map<String, String> users) throws IOException;
}
