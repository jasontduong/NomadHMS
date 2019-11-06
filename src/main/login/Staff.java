package login;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Staff implements Information {
    private Map<Staff, ArrayList<Integer>> staffID = new HashMap<>();

    public void addUniqueID(Staff staff) {
        staffID.put(staff, new ArrayList<>());
    }

    public void addUniqueID(Staff s, Integer id) {
        ArrayList<Integer> idNumbers = staffID.get(s);
        idNumbers.add(id);
    }

    @Override
    public void username(String user) {

    }

    @Override
    public void password(String pass) {

    }

    @Override
    public void uniqueID(int uniqueID) {

    }

    @Override
    public void name(String name) {

    }

    @Override
    public void isMale(Boolean male) {

    }

    @Override
    public void isFemale(Boolean female) {

    }

    @Override
    public void streetAddress(String streetAddress) {

    }

    @Override
    public void country(String country) {

    }

    @Override
    public void postalCode(String postalCode) {

    }

    @Override
    public void province(String province) {

    }

    @Override
    public void phoneNumber(String phoneNumber) {

    }
}
