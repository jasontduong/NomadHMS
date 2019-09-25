package test;

import login.UserList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class TestUserList {
    UserList testList;

    @BeforeEach
    public void setup() {
        testList = new UserList();
    }

    @Test
    public void testAddUserNotThere() {
        //check that the user is not already in the list
        checkEmptyDoesntContain("Bob");
        //add user into the list
        testList.addUser("Bob");
        //check the the user is only in the list once
        checkListContainsOnce("Bob");

    }

    @Test
    public void testAddUserAlreadyThere() {
        //check that the user is not already in the list
        checkEmptyDoesntContain("Bob");
        //add user into the list
        testList.addUser("Bob");
        //check the the user is only in the list once
        checkListContainsOnce("Bob");
        //add user again
        testList.addUser("Bob");
        //check the the user is only in the list once
        checkListContainsOnce("Bob");

    }

    @Test
    public void testRemoveUserAlreadyThere() {
        //add user into the list
        testList.addUser("Bob");
        //check the the user is only in the list once
        checkListContainsOnce("Bob");
        //remove user from list
        testList.removeUser("Bob");
        //check that the user is not already in the list
        checkEmptyDoesntContain("Bob");
    }

    @Test
    public void testRemoveUserNotThere() {
        //check that the user is not already in the list
        checkEmptyDoesntContain("Bob");
        //remove user from list
        testList.removeUser("Bob");
        //check that the user is not already in the list
        checkEmptyDoesntContain("Bob");
    }

    private void checkEmptyDoesntContain(String user) {
        assertEquals(testList.userSize(), 0);
        assertFalse(testList.containsUser(user));
    }

    private void checkListContainsOnce(String user) {
        assertEquals(testList.userSize(), 1);
        assertTrue(testList.containsUser(user));
    }
}
