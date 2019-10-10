//package login;
//
//import java.util.ArrayList;
//
//public class UserList {
//
//    ArrayList<String> userList;
//
//    public UserList() {
//        userList = new ArrayList<String>();
//    }
//
//    //MODIFIES: this
//    //EFFECTS: adds user to list if not already there. Otherwise, do nothing
//    public void addUser(String user) {
//        if (!userList.contains(user)) {
//            userList.add(user);
//        }
//    }
//
//    //MODIFIES: this
//    //EFFECTS: if the user is already in the list, remove it from the list. Otherwise, do nothing.
//    public void removeUser(String user) {
//        if (userList.contains(user)) {
//            userList.remove(user);
//        }
//
//    }
//
//    //EFFECTS: if the user is contained in the list, return true. Otherwise return false.
//    public boolean containsUser(String user) {
//        return userList.contains(user);
//    }
//
//    //EFFECTS: returns how many users are in the list.
//    public int userSize() {
//        return userList.size();
//    }
//}
