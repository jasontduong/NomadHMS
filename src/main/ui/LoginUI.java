package ui;

import login.Login;
import login.AmenitySpace;
import login.MeetingRoom;
import login.Room;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class LoginUI extends JFrame {
    public static String roomNo;
    //    private static Room makeRoom;
    public static MeetingRoom makeMR = new MeetingRoom(roomNo);
    public static AmenitySpace makeAS = new AmenitySpace(roomNo);
    public static final int WIDTH = 600;
    public static final int HEIGHT = 300;

    public static void main(String[] args) throws IOException {
        choice();


    }

    public static void choice() throws IOException {
        Login loginAttempt = new Login();
        Scanner reader1 = new Scanner(System.in);

        while (true) {
            System.out.print("What do you want to do? Login, Register, or Quit?: ");
            String choice1 = reader1.nextLine();

            if (choice1.equals("Quit") || choice1.equals("quit")) {
                System.out.println("Okay bye!");
                break;
            }

            if (choice1.equals("Login") || choice1.equals("login")) {
                loginAttempt.attemptLogin();
                selectRoom();
                break;
            } else if (choice1.equals("Register") || choice1.equals("register")) {
                loginAttempt.attemptRegister();
            }
            break;
        }

    }

    public static void selectRoom() {
        Scanner reader2 = new Scanner(System.in);
        System.out.println("What room do you want to book? Suite (S), Amenity Space (AS), or Meeting Room (MR)?");
        String selectR = reader2.nextLine();
        if (selectR.equals("AS")) {
            makeMR.bookRoom();
        } else if (selectR.equals("MR")) {
            makeMR.bookRoom();
        }
    }
}