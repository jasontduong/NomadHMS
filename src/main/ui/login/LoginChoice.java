package ui.login;

import model.Suite;
import model.LoadSave;
import model.BookRoom;

import java.io.*;
import java.util.*;


public class LoginChoice {
    private BookRoom bookroom = new BookRoom();
    private LoadSave loadsave = new LoadSave();

    public void attemptRegister() throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Registration Page");
        System.out.println("Your username is a unique one so it cannot be changed.");
        System.out.print("Username: ");
        String user = input.nextLine();
        System.out.print("Password: ");
        String pass = input.nextLine();
        if (!loadsave.load(user, pass)) {
            loadsave.save(user, pass);
            System.out.println("Registered successfully!");
        } else {
            System.out.println("Login already exists");
        }
    }

    public void attemptLogin() throws IOException {
        Scanner reader2 = new Scanner(System.in);
        System.out.print("Type your username: ");
        String user = reader2.nextLine();
        System.out.print("Type your password: ");
        String pass = reader2.nextLine();
        if (loadsave.load(user, pass)) {
            System.out.println("Login Success!");
            selectRoom();
        } else {
            System.out.println("Failed!");
        }

    }

    public String selectRoom() throws IOException {
        Scanner reader2 = new Scanner(System.in);
        System.out.println("Do you want to book a suite (S)?");
        String selectR = reader2.nextLine();
        if (selectR.equals("S")) {
            bookroom.bookSuite();
        }
//        if (selectR.equals("V")) {
//            bookroom.viewAll();
//        }
        return "Sure!";
    }


}



