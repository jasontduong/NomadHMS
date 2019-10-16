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



    public void attemptRegister() throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Registration Page");
        System.out.println("Your username is a unique one so it cannot be changed.");
        System.out.print("Username: ");
        String user = input.next();
        System.out.print("Password: ");
        String pass = input.next();
        System.out.println("Registration successful!");

        save(user, pass);
    }

    public void attemptLogin() throws LoginFail {
        String filePath = ("accounts.txt");
        Scanner reader2 = new Scanner(System.in);
        while (true) {
            System.out.print("Type your username: ");
            String user = reader2.nextLine();
            System.out.print("Type your password: ");
            String pass = reader2.nextLine();
            if (load(user, pass)) {
                System.out.println("Login Success!");
                selectRoom();
            } else if (!load(user, pass)) {
                throw new LoginFail();
            }
            break;
        }
    }


    public static void selectRoom() {
        Scanner reader2 = new Scanner(System.in);
        System.out.println("What room do you want to book? Suite (S), Amenity Space (AS), or Meeting Room (MR)?");
        String selectR = reader2.nextLine();
        if (selectR.equals("AS")) {
            makeAS.bookRoom();
        } else if (selectR.equals("MR")) {
            makeMR.bookRoom();
        }
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
        } catch (FileNotFoundException e) {
            e.printStackTrace();
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



