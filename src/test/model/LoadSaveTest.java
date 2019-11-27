package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class LoadSaveTest {
    private LoadSave testloadsave;

    @BeforeEach
    private void setup() {
        testloadsave = new LoadSave();
    }

    @Test
    void load() {
        assertTrue(testloadsave.load("admin", "admin"));
        assertFalse(testloadsave.load("123123", "adm12in"));
    }

    @Test
    void save() throws IOException {
        assertEquals("Success!", testloadsave.save("123", "123"));
    }

    @Test
    void exceptiontest() {
        try {
            testloadsave.load("12351251515", "15125125125125");
            throw new IOException();
        } catch (IOException e) {
            System.out.println("hehe");
        }
    }
}