package login;

import java.util.ArrayList;
import java.util.List;

public class LoginDatabase {

    public static String usernames() {
        List<String> userList;
        userList = new ArrayList<String>();
        userList.add("adminuser");
        userList.add("manager");
        userList.add("guestservices");
        userList.add("teamlead");
        return userList.get(0);
    }

    public static String passwords() {
        List<String> userPass;
        userPass = new ArrayList<String>();
        userPass.add("adminuser$");
        userPass.add("manager$");
        userPass.add("guestservices$");
        userPass.add("teamlead$");
        return userPass.get(0);
    }

}
