package login;

import java.util.Scanner;

public class BookRoom {

    private String roomNum;

    public String bookRoom() {
        Scanner reader4 = new Scanner(System.in);
        System.out.println("What room do you want to book? A, B, or C.");
        String input = reader4.nextLine();
        if (input.equals("A") || input.equals("B") || input.equals("C")) {
            setRoomNum(input);
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
