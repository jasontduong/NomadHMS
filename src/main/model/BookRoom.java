package model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Scanner;

public class BookRoom extends LoadSave {
    private BufferedReader bufferedReader;
    private String input;
    private Scanner bookRoomReader = new Scanner(System.in);
    private List<Suite> suitesBooked = new ArrayList<>();

    public String bookSuite() throws IOException {
        System.out.println("What room do you want to book? 101, 102, 201, 202, 301, 302?");
        String input = "101";
        System.out.println("First name?");
        String input1 = "Jason";
        System.out.println("Last name?");
        String input2 = "Duong";
        System.out.println("Suite type? 1BED or 2BED");
        String input4 = "2BED";
        suitesBooked.add(new Suite(input1, input2, "645321", input, input4));
        System.out.println("Your suite has been booked! You have booked suite " + input + ".");
        save();
        return "Thank you!";
    }


//    public void load() {
//        try {
//            FileInputStream fis = new FileInputStream("data/bookings.txt");
//            ObjectInputStream ois = new ObjectInputStream(fis);
//            ois.readObject();
//            ois.close();
//        } catch (ClassNotFoundException | IOException e) {
//            e.printStackTrace();
//        }
//    }

    public String save() {
        try {
            FileOutputStream fos = new FileOutputStream("data/bookings.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(suitesBooked);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "Saved successfully!";
    }
}