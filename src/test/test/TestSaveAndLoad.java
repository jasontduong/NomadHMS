package test;

import login.Login;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class TestSaveAndLoad {

    Login testLogin;

    @BeforeEach
    public void setup() {
        testLogin = new Login();
    }

    @Test
    public void testLoadNotThere() {
        assertEquals(testLogin.load("test", "test"), false);
        assertEquals(testLogin.load("will", "fail"), false);
        assertEquals(testLogin.load("wont", "pass"), false);

    }

    @Test
    public void testLoadThere() {
        assertEquals(testLogin.load("Jason", "Jason"), true);
        assertEquals(testLogin.load("Adminuser", "admin$"), true);
        assertEquals(testLogin.load("save123", "save123"), true);
    }

    @Test
    public void testSave() throws IOException {
        assertEquals(testLogin.save("newuser1", "newpass1"), "newuser1:newpass1");
    }


}
