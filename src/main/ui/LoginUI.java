package ui;

import exceptions.LoginFail;
import login.StartScreen;

import javax.swing.*;
import java.io.IOException;
import java.util.Scanner;

public class LoginUI {

    public static final int WIDTH = 600;
    public static final int HEIGHT = 300;
    public static String user;
    public static String pass;
    public static StartScreen startScreenAttempt;



    public static void main(String[] args) {
        try {
            choice();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Invalid choice!");
        }

    }

    public static void choice() throws IOException, ClassNotFoundException {
        startScreenAttempt = new StartScreen();
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


    public static void loginHelper() throws IOException, ClassNotFoundException {
        startScreenAttempt = new StartScreen();
        try {
            startScreenAttempt.attemptLogin(user, pass);
        } catch (LoginFail loginFail) {
            System.out.println("Login is invalid!");
        } finally {
            System.out.println("Going back to start screen...");
            choice();

        }
    }
}
