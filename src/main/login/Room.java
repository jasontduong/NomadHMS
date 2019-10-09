package login;

import java.util.Scanner;

public abstract class Room {

    private int roomID;
    private String roomNum;
    private int bedNumber;

    public boolean hasTV;
    public boolean hasInternet;
    public boolean hasPhone;


    public Room(String roomNo) {
        roomNum = roomNo;
    }

    public int getRoomID() {
        return roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    Scanner reader = new Scanner(System.in);

    public String bookRoom() {
        System.out.println("What room do you want to book?");
        String bookR = reader.nextLine();
        if (bookR.equals("A") || bookR.equals("B") || bookR.equals("C")) {
            System.out.println("Your suite has been booked! You have booked suite " + bookR);
        }
        return "Thank you!";
    }

    public String getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(String roomNum) {
        this.roomNum = roomNum;
    }

    public int getBedNumber() {
        return bedNumber;
    }

    public void setBedNumber(int bedNumber) {
        this.bedNumber = bedNumber;
    }

    public boolean isHasTV() {
        return hasTV;
    }

    public void setHasTV(boolean hasTV) {
        this.hasTV = hasTV;
    }

    public boolean isHasInternet() {
        return hasInternet;
    }

    public void setHasInternet(boolean hasInternet) {
        this.hasInternet = hasInternet;
    }

    public boolean isHasPhone() {
        return hasPhone;
    }

    public void setHasPhone(boolean hasPhone) {
        this.hasPhone = hasPhone;
    }

    public void amenitySpace() {}

    public void smallBoardRoom() {}

    public void largeBoardRoom() {}


}
