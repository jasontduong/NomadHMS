package login;

public interface Loadable {

    // REQUIRES: .txt file
    // MODIFIES: this
    // EFFECTS: loads and reads any text files
    boolean load(String user, String pass);
}
