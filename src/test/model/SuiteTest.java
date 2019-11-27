package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SuiteTest {
    private Suite testSuite;

    @BeforeEach
    private void setup() {
        testSuite = new Suite("Jason", "Duong", "000000", "101", "1BED");
    }

    @Test
    void getFname() {
        testSuite.setFname("Jason");
        assertEquals("Jason", testSuite.getFname());
    }

    @Test
    void setFname() {
        testSuite.setFname("Jason");
    }

    @Test
    void getLname() {
        testSuite.setLname("Duong");
        assertEquals("Duong", testSuite.getLname());
    }

    @Test
    void setLname() {
        testSuite.setLname("Duong");
    }

    @Test
    void getConf() {
        testSuite.setConf("000000");
        assertEquals("000000", testSuite.getConf());
    }

    @Test
    void setConf() {
        testSuite.setConf("000000");
    }

    @Test
    void getRoom() {
        testSuite.setRoom("101");
        assertEquals("101", testSuite.getRoom());
    }

    @Test
    void setRoom() {
        testSuite.setRoom("101");
    }

    @Test
    void getSuite() {
        testSuite.setSuite("1BED");
        assertEquals("1BED", testSuite.getSuite());
    }

    @Test
    void setSuite() {
        testSuite.setSuite("1BED");
    }

    @Test
    void getStatus() {
        testSuite.setStatus(true);
        assertTrue(testSuite.getStatus());
    }

    @Test
    void setStatus() {
        testSuite.setStatus(true);
    }
}