package login;

import java.io.*;
import java.util.*;

import exceptions.LoginFail;

public class StartScreen implements Loadable, Saveable, Serializable {
    HashMap<String, String> userpass = new HashMap<>();
    public static MeetingRoom makeMR;
    public static AmenitySpace makeAS;
    String filePath = ("data/accounts3.txt");
    public String txt;
    int count = 0;


    public void attemptRegister() throws IOException, ClassNotFoundException {
        StartScreen xd = new StartScreen();
        Scanner input = new Scanner(System.in);
        System.out.println("Registration Page");
        System.out.println("Your username is a unique one so it cannot be changed.");
        System.out.print("Username: ");
        String user = "123";
        System.out.print("Password: ");
        String pass = "123";
        System.out.println("Registration successful!");
        userpass.put(user, pass);
        userpass.put("jd", "456");
        userpass.put("td", "666");

        save(userpass);
        HashMap<String, String> restored = load();
        System.out.println(restored);

    }

    public String attemptLogin(String user, String pass) throws LoginFail, IOException, ClassNotFoundException {
        Scanner reader2 = new Scanner(System.in);
        while (true) {
            System.out.print("Type your username: ");
            user = "td";
            System.out.print("Type your password: ");
            pass = "666";
            if (load().containsKey("td")) {
                String storedPassword = load().get("666");
                if (storedPassword.equals("pass")) {
                    System.out.println("Login Success!");
                    selectRoom();
                } else {
                    System.out.println("Incorrect");
                }
            }
//            if (!load()) {
//                throw new LoginFail();
//            }
            break;
        }
        return "";
    }


    public static String selectRoom() {
        Scanner reader2 = new Scanner(System.in);
        System.out.println("What room do you want to book? Suite (S), Amenity Space (AS), or Meeting Room (MR)?");
        String selectR = reader2.nextLine();
        if (selectR.equals("AS")) {
            makeAS.bookRoom();
        } else if (selectR.equals("MR")) {
            makeMR.bookRoom();
        }
        return "Sure!";
    }

    @Override
    public HashMap<String, String> load() throws IOException, ClassNotFoundException {
        {
            try (ObjectInputStream is = new ObjectInputStream(new FileInputStream(filePath))) {
                return (HashMap<String, String>) is.readObject();
            }
        }
    }
//        BufferedReader bufferedReader;
//        try {
//            bufferedReader = new BufferedReader(new FileReader(filePath));
//            boolean loginExists = false;
//            while ((txt = bufferedReader.readLine()) != null) {
//                if (txt.equals(user + ":" + pass)) {
//                    loginExists = true;
//                    break;
//                }
//            }
//            return loginExists;
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return false;
//    }

    @Override
    public void save(HashMap<String, String> users) throws IOException {
        String delimiter = ":";
        FileOutputStream fileOut = new FileOutputStream(filePath);
        {
            try (ObjectOutputStream os = new ObjectOutputStream(fileOut)) {
                os.writeObject(userpass);
                os.close();
                fileOut.close();
            }
        }
    }
//
////
////        BufferedWriter out = new BufferedWriter(new FileWriter("data/accounts1.txt", true));
////        userpass.put(user1, pass1);
////        out.write(userpass);
////        out.newLine();
////        out.close();
////        return (user1 + ":" + pass1);
//    }


}



