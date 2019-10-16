package login;

import java.io.*;
import java.util.*;

import exceptions.LoginFail;
import login.AmenitySpace;
import login.MeetingRoom;

public class StartScreen implements Loadable, Saveable {
    public static String roomNo;
    public static MeetingRoom makeMR = new MeetingRoom(roomNo);
    public static AmenitySpace makeAS = new AmenitySpace(roomNo);
    public String txt;
    public String user;
    public String pass;



    public void attemptRegister() throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Registration Page");
        System.out.println("Your username is a unique one so it cannot be changed.");
        System.out.print("Username: ");
        String user = "653";
        System.out.print("Password: ");
        String pass = "653";
        System.out.println("Registration successful!");

        save(user, pass);
    }

    public String attemptLogin(String user, String pass) throws LoginFail {
        String filePath = ("accounts.txt");
        Scanner reader2 = new Scanner(System.in);
        while (true) {
            System.out.print("Type your username: ");
            user = "123";
            System.out.print("Type your password: ");
            pass = "123";
            if (load(user, pass)) {
                System.out.println("Login Success!");
                selectRoom();
            } else if (!load(user, pass)) {
                throw new LoginFail();
            }
            break;
        }
        return "";
    }


    public static String selectRoom() {
        Scanner reader2 = new Scanner(System.in);
        System.out.println("What room do you want to book? Suite (S), Amenity Space (AS), or Meeting Room (MR)?");
        String selectR = "AS";
        if (selectR.equals("AS")) {
            makeAS.bookRoom();
        } else if (selectR.equals("MR")) {
            makeMR.bookRoom();
        }
        return "Sure!";
    }

    @Override
    public boolean load(String user, String pass) {
        String filePath = ("data/accounts.txt");
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader(filePath));
            boolean loginExists = false;
            while ((txt = bufferedReader.readLine()) != null) {
                if (txt.equals(user + ":" + pass)) {
                    loginExists = true;
                    break;
                }
            }
            return loginExists;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public String save(String user1, String pass1) throws IOException {
        BufferedWriter out = new BufferedWriter(new FileWriter("data/accounts.txt", true));
        out.write(user1 + ":" + pass1);
        out.newLine();
        out.close();
        return (user1 + ":" + pass1);
    }


}



