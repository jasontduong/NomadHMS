package login;

import java.util.Scanner;

public class BookRoom {

    private String roomNum;
    private String firstName;
    private String lastName;
    private String phoneNum;
    private String email;
    private String nights;
    Scanner reader4 = new Scanner(System.in);


    public String bookMeeting() {
        System.out.println("What meeting room do you want to book? A, B, or C.");
        String input = reader4.nextLine();
        if (input.equals("A") || input.equals("B") || input.equals("C")) {
            setRoomNum(input);
            bookInformation();
            System.out.println("Your meeting room has been booked! You have booked suite " + getRoomNum());
            System.out.println(getInformation());
        } else {
            System.out.println("Invalid room choice, please pick A, B, or C.");
        }
        return "Thank you!";
    }

    public String bookSuite() {
        System.out.println("What room do you want to book? 101, 102, 201, 202, 301, 302?");
        String input = reader4.nextLine();
        if (input.equals("101") || input.equals("102") || input.equals("201") || input.equals("202")) {
            setRoomNum(input);
            bookInformation();
            System.out.println("Your suite has been booked! You have booked suite " + getRoomNum() + ".");
            System.out.println(getInformation());
        } else {
            System.out.println("Invalid room choice, please pick 101, 102, 103, 201, 202, 203, 301, 302, 303");
        }
        return "Thank you!";
    }

    public String getInformation() {
        return "Your information booked is...\n" + getFirstName() + "\n" + getLastName()
                + "\n" + getPhoneNum() + "\n" + getEmail() + "\n" + getNights();
    }

    public void bookInformation() {
        System.out.println("First name?");
        String input1 = reader4.nextLine();
        setFirstName(input1);
        System.out.println("Last name?");
        String input2 = reader4.nextLine();
        setLastName(input2);
        System.out.println("Phone number?");
        String input3 = reader4.nextLine();
        setPhoneNum(input3);
        System.out.println("E-mail?");
        String input4 = reader4.nextLine();
        setEmail(input4);
        System.out.println("How many nights starting from today?");
        String input5 = reader4.nextLine();
        setNights(input5);

    }

    public String getRoomNum() {
        return roomNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public String getNights() {
        return nights;
    }


    public void setRoomNum(String roomNum) {
        this.roomNum = roomNum;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNights(String nights) {
        this.nights = nights;
    }


}
