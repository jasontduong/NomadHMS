package ui;

import exceptions.LoginFail;
import login.LoadSave;
import login.BookRoom;

import java.io.*;
import java.util.*;


public class StartScreen {
    Map<String, String> userpass = new HashMap<>();
    BookRoom bookroom = new BookRoom();
    LoadSave loadsave = new LoadSave();

    public void attemptRegister() throws IOException, ClassNotFoundException {
        HashMap<String, String> reload = loadsave.load();
        Scanner input = new Scanner(System.in);
        System.out.println("Registration Page");
        System.out.println("Your username is a unique one so it cannot be changed.");
        System.out.print("Username: ");
        String user = input.nextLine();
        System.out.print("Password: ");
        String pass = input.nextLine();
        if (!reload.containsKey(user)) {
            userpass.put(user, pass);
            loadsave.save(userpass);
            System.out.println("Registration successful!");
        } else if (reload.containsKey(user)) {
            System.out.println("Already registered!");
        }

    }

    public void attemptLogin() throws LoginFail, IOException, ClassNotFoundException {
        Scanner reader2 = new Scanner(System.in);
        userpass.put("admin", "admin");
        while (true) {
            System.out.print("Type your username: ");
            String user = reader2.nextLine();
            System.out.print("Type your password: ");
            String pass = reader2.nextLine();
            HashMap result = loadsave.load();
            userpass.put("admin", "admin");
            if (result.containsKey(user)) {
                System.out.println("Login Success!");
                selectRoom();
            } else if (!result.containsKey(user)) {
                throw new LoginFail();
            }
            break;
        }
    }

    public String selectRoom() {
        Scanner reader2 = new Scanner(System.in);
        System.out.println("What suite do you want to book? Suite (S), Amenity Space (AS), or Meeting Room (MR)?");
        String selectR = reader2.nextLine();
        if (selectR.equals("AS") || selectR.equals("MR") || selectR.equals("S")) {
            bookroom.bookRoom();
        }
        return "Sure!";
    }


}



