package login;

import java.io.IOException;
import java.util.HashMap;

public interface Loadable {

    // REQUIRES: .txt file
    // MODIFIES: this
    // EFFECTS: loads and reads any text files
    HashMap<String, String> load() throws IOException, ClassNotFoundException;
}
