package test;

import login.PhoneNumberList;
import org.junit.Before;
import org.junit.Test;


import static org.junit.jupiter.api.Assertions.*;

public class TestPhoneNumberList {
    PhoneNumberList testPhone;

    @Before
    public void setup() {
        testPhone = new PhoneNumberList();
    }

    @Test
    public void testAddPhoneNotThere() {
        //check that the phone # is not already in the list
        checkEmptyDoesntContain(604333222);
        //add phone # into the list
        testPhone.addPhone(604333222);
        //check the the phone # is only in the list once
        checkListContainsOnce(604333222);

    }

    @Test
    public void testAddPhoneAlreadyThere() {
        //check that the phone # is not already in the list
        checkEmptyDoesntContain(604333222);
        //add phone # into the list
        testPhone.addPhone(604333222);
        //check the the phone # is only in the list once
        checkListContainsOnce(604333222);
        //add phone # again
        testPhone.addPhone(604333222);
        //check the the phone # is only in the list once
        checkListContainsOnce(604333222);

    }

    @Test
    public void testRemovePhoneAlreadyThere() {
        //add user into the list
        testPhone.addPhone(604333222);
        //check the the phone # is only in the list once
        checkListContainsOnce(604333222);
        //remove phone # from list
        testPhone.removePhone(604333222);
        //check that the phone # is not already in the list
        checkEmptyDoesntContain(604333222);
    }

    @Test
    public void testRemovePhoneNotThere() {
        //check that the phone # is not already in the list
        checkEmptyDoesntContain(604333222);
        //remove phone # from list
        testPhone.removePhone(604333222);
        //check that the phone # is not already in the list
        checkEmptyDoesntContain(604333222);
    }

    private void checkEmptyDoesntContain(Integer num) {
        assertEquals(testPhone.phoneSize(), 0);
        assertFalse(testPhone.containsUser(num));
    }

    private void checkListContainsOnce(Integer num) {
        assertEquals(testPhone.phoneSize(), 1);
        assertTrue(testPhone.containsUser(num));
    }
}
