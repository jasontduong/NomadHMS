package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookRoomTest {
    BookRoom testBookRoom;

    @BeforeEach
    void setup() { testBookRoom = new BookRoom();
    }

    @Test
    void bookMeeting() {
        assertEquals("Thank you!", testBookRoom.bookMeeting());
    }

    @Test
    void bookSuite() {
        assertEquals("Thank you!", testBookRoom.bookSuite());
    }

    @Test
    void getInformation() {
        testBookRoom.setRoomNum("101");
        testBookRoom.setFirstName("Jason");
        testBookRoom.setLastName("Duong");
        testBookRoom.setPhoneNum("7785527071");
        testBookRoom.setEmail("email@email.com");
        testBookRoom.setNights("6");
        assertEquals("Your information booked is...\nJason\nDuong\n7785527071\nemail@email.com\n6", testBookRoom.getInformation());
    }

    @Test
    void bookInformation() {

    }

    @Test
    void getRoomNum() {
        testBookRoom.setRoomNum("101");
        assertEquals(testBookRoom.getRoomNum(), "101");
    }

    @Test
    void getFirstName() {
        testBookRoom.setFirstName("Jason");
        assertEquals(testBookRoom.getFirstName(), "Jason");
    }

    @Test
    void getLastName() {
        testBookRoom.setLastName("Duong");
        assertEquals(testBookRoom.getLastName(), "Duong");
    }

    @Test
    void getPhoneNum() {
        testBookRoom.setPhoneNum("7785527071");
        assertEquals(testBookRoom.getPhoneNum(), "7785527071");
    }

    @Test
    void getEmail() {
        testBookRoom.setEmail("email@email.com");
        assertEquals(testBookRoom.getEmail(), "email@email.com");
    }

    @Test
    void getNights() {
        testBookRoom.setNights("6");
        assertEquals(testBookRoom.getNights(), "6");
    }

    @Test
    void setRoomNum() {
        testBookRoom.setRoomNum("202");
    }

    @Test
    void setFirstName() {
        testBookRoom.setFirstName("Jason");
    }

    @Test
    void setLastName() {
        testBookRoom.setLastName("Duong");
    }

    @Test
    void setPhoneNum() {
        testBookRoom.setPhoneNum("7785527071");
    }

    @Test
    void setEmail() {
        testBookRoom.setEmail("email@email.com");
    }

    @Test
    void setNights() {
        testBookRoom.setNights("6");
    }
}