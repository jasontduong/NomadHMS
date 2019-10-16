package exceptions;

import com.sun.xml.internal.bind.v2.util.ByteArrayOutputStreamEx;
import login.StartScreen;
import org.junit.jupiter.api.Test;
import ui.LoginUI;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;

public class ExceptionsTest {

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
