package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelSuiteTest {
    HotelSuite testHotelSuite;

    @BeforeEach
    public void setup() {
        testHotelSuite = new HotelSuite();
    }

    @Test
    void getRoomNumber() {
        testHotelSuite.setRoomNumber(5);
        assertEquals(testHotelSuite.getRoomNumber(), 5);
    }

    @Test
    void setRoomNumber() {
        testHotelSuite.setRoomNumber(5);
    }

    @Test
    void isAccessibleFriendly() {
        assertFalse(testHotelSuite.isAccessibleFriendly());
        testHotelSuite.setAccessibleFriendly(true);
        assertTrue(testHotelSuite.isAccessibleFriendly());

    }

    @Test
    void setAccessibleFriendly() {
        testHotelSuite.setAccessibleFriendly(true);
    }

    @Test
    void setAlleySide() {
        testHotelSuite.setAlleySide(true);
    }

    @Test
    void isAlleySide() {
        assertFalse(testHotelSuite.isAlleySide());
        testHotelSuite.setAlleySide(true);
        assertTrue(testHotelSuite.isAlleySide());

    }

    @Test
    void setDeluxeSuite() {
        testHotelSuite.setDeluxeSuite(true);
    }

    @Test
    void isDeluxeSuite() {
        assertFalse(testHotelSuite.isDeluxeSuite());
        testHotelSuite.setDeluxeSuite(true);
        assertTrue(testHotelSuite.isDeluxeSuite());

    }

}