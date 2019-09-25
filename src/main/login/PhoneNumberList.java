package login;

import java.util.ArrayList;

public class PhoneNumberList {

    ArrayList<Integer> phoneList;

    public PhoneNumberList() {
        phoneList = new ArrayList<Integer>();
    }

    //MODIFIES: this
    //EFFECTS: adds phone number to list if not already there. Otherwise, do nothing
    public void addPhone(Integer num) {
        if (!phoneList.contains(num)) {
            phoneList.add(num);
        }
    }

    //MODIFIES: this
    //EFFECTS: if the phone number is already in the list, remove it from the list. Otherwise, do nothing.
    public void removePhone(Integer num) {
        if (phoneList.contains(num)) {
            phoneList.remove(num);
        }

    }

    //EFFECTS: if the phone number is contained in the list, return true. Otherwise return false.
    public boolean containsUser(Integer num) {
        return phoneList.contains(num);
    }

    //EFFECTS: returns how many phone numbers are in the list.
    public int phoneSize() {
        return phoneList.size();
    }
}


