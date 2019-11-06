package login;

import java.util.Scanner;

public abstract class Room {

    private int roomID;
    private String roomNum;
    private int bedNumber;


    public Room(String roomNum) {
        roomNum = roomNum;
    }


    public String bookRoom() {
        Scanner reader4 = new Scanner(System.in);
        System.out.println("What room do you want to book? A, B, or C.");
        String bookRx = "A";
        if (bookRx.equals("A") || bookRx.equals("B") || bookRx.equals("C")) {
            setRoomNum(bookRx);
            System.out.println("Your suite has been booked! You have booked suite " + getRoomNum());
        } else {
            System.out.println("Invalid room choice, please pick A, B, or C.");
        }
        return "Thank you!";
    }

    public String getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(String roomNum) {
        this.roomNum = roomNum;
    }


}
