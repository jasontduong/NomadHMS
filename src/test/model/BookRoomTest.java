package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class BookRoomTest {
    private BookRoom testBookRoom;

    @BeforeEach
    private void setup() {
        testBookRoom = new BookRoom();
    }

    @Test
    void bookSuite() throws IOException {
        assertEquals("Thank you!", testBookRoom.bookSuite());
    }

    @Test
    void save() throws IOException {
        assertEquals("Saved successfully!", testBookRoom.save());
    }

    @Test
    void catchFail() {
        try {
            testBookRoom.save();
            throw new IOException();
        } catch (IOException e) {
        }
    }


}