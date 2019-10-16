package login;

import java.util.Scanner;

public abstract class Room {

    private int roomID;
    private String roomNum;
    private int bedNumber;


    public Room(String roomNo) {
        roomNum = roomNo;
    }

    public int getRoomID() {
        return roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }


    public String bookRoom() {
        Scanner reader4 = new Scanner(System.in);
        System.out.println("What room do you want to book?");
        String bookRx = reader4.nextLine();
        if (bookRx.equals("A") || bookRx.equals("B") || bookRx.equals("C")) {
            System.out.println("Your suite has been booked! You have booked suite " + bookRx);
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

    public void amenitySpace() {}

    public void smallBoardRoom() {}

    public void largeBoardRoom() {}


}
