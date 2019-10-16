package login;

import exceptions.LoginFail;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class StartScreenTest {
    StartScreen testStartScreen1;

    @BeforeEach
    public void setup() {
        testStartScreen1 = new StartScreen();
    }

    @Test
    void attemptRegister() {
    }

    @Test
    void attemptLogin() {
    }

    @Test
    public void testSelectRoom() {
        String roomNo = "AS";
        MeetingRoom makeMR = new MeetingRoom(roomNo);
        AmenitySpace makeAS = new AmenitySpace(roomNo);
        assertEquals(makeAS.bookRoom(), "Thank you!");
    }

    @Test
    public void testLoadNotThere() {
        assertEquals(testStartScreen1.load("will", "fail"), false);
        assertEquals(testStartScreen1.load("wont", "pass"), false);
        assertFalse(testStartScreen1.load("failfailfail", "lololol"));

    }

    @Test
    public void testLoadThere() {
        assertEquals(testStartScreen1.load("Jason", "Jason"), true);
        assertEquals(testStartScreen1.load("Adminuser", "admin$"), true);
        assertEquals(testStartScreen1.load("save123", "save123"), true);
    }

    @Test
    public void testSave() throws IOException {
        assertEquals(testStartScreen1.save("newuser1", "newpass1"), "newuser1:newpass1");
        assertEquals(testStartScreen1.save("testuser6", "password"), "testuser6:password");
    }

    @Test
    public void testLoadFromTestSave() {
        assertEquals(testStartScreen1.load("newuser1", "newpass1"), true);
        assertEquals(testStartScreen1.load("testuser6", "password"), true);
    }

    @Test
    public void attemptLoginThrows() {
        StartScreen testStart = new StartScreen();
        try {
            testStart.attemptLogin();
        } catch (LoginFail e) {
        } //nothing to do here

    }

    @Test
    public void doesNotThrow() {
        StartScreen testStart = new StartScreen();
        try {
            testStart.attemptLogin();
        } catch (LoginFail ee) {
            fail();
        }
    }
}

