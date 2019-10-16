package ui;

import exceptions.LoginFail;
import login.StartScreen;

import javax.swing.*;
import java.io.IOException;
import java.util.Scanner;

public class LoginUI extends JFrame {
    //    public static String roomNo;
//    //    private static Room makeRoom;
//    public static MeetingRoom makeMR = new MeetingRoom(roomNo);
//    public static AmenitySpace makeAS = new AmenitySpace(roomNo);
    public static final int WIDTH = 600;
    public static final int HEIGHT = 300;

    public static void main(String[] args) {
        try {
            choice();
        } catch (IOException e) {
            System.out.println("Invalid choice!");
        }

    }

    public static void choice() throws IOException {
        StartScreen startScreenAttempt = new StartScreen();
        Scanner reader1 = new Scanner(System.in);

        while (true) {
            System.out.print("What do you want to do? Login, Register, or Quit?: ");
            String choice1 = reader1.nextLine();

            if (choice1.equals("Quit") || choice1.equals("quit")) {
                System.out.println("Okay bye!");
                break;
            }

            if (choice1.equals("Register") || choice1.equals("register")) {
                startScreenAttempt.attemptRegister();
            }
            if (choice1.equals("Login") || choice1.equals("login")) {
                loginHelper();
            }
            break;

        }
    }



    public static void loginHelper() throws IOException {
        StartScreen startScreenAttempt = new StartScreen();
        try {
            startScreenAttempt.attemptLogin();
        } catch (LoginFail loginFail) {
            System.out.println("Login is invalid!");
        } finally {
            System.out.println("Going back to start screen...");
            choice();

        }
    }
}
