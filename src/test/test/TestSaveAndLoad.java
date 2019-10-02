package test;

import login.Login;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestSaveAndLoad {

    Login testLogin;

    @BeforeEach
    public void setup() {
        testLogin = new Login();
    }

    @Test
    public void testAddUserNotThere(String id1, String pw1) {

    }


}
