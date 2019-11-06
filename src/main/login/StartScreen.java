package login;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;


import exceptions.LoginFail;

public class StartScreen implements Loadable, Saveable, Serializable {
    Map<String, String> userpass = new HashMap<>();
    public static MeetingRoom makeMR;
    public static AmenitySpace makeAS;
    String filePath = ("data/accounts3.txt");

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StartScreen that = (StartScreen) o;
        return userpass.equals(that.userpass) &&
                filePath.equals(that.filePath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userpass, filePath);
    }

    public void attemptRegister() throws IOException, ClassNotFoundException {
        HashMap<String, String> reload = load();
        Scanner input = new Scanner(System.in);
        System.out.println("Registration Page");
        System.out.println("Your username is a unique one so it cannot be changed.");
        System.out.print("Username: ");
        String user = input.nextLine();
        System.out.print("Password: ");
        String pass = input.nextLine();
        if (!reload.containsKey(user)) {
            userpass.put(user, pass);
            save(userpass);
            System.out.println("Registration successful!");
        } else if (reload.containsKey(user)) {
            System.out.println("Already registered!");
        }

    }

    public String attemptLogin(String user, String pass) throws LoginFail, IOException, ClassNotFoundException {
        Scanner reader2 = new Scanner(System.in);
        userpass.put("admin","admin");
        while (true) {
            System.out.print("Type your username: ");
            user = reader2.nextLine();
            System.out.print("Type your password: ");
            pass = reader2.nextLine();
            HashMap result = load();
            userpass.put("admin","admin");
            if (result.containsKey(user)) {
                System.out.println("Login Success!");
                selectRoom();
            } else if (!result.containsKey(user)) {
                System.out.println("Incorrect, let us register you!");
                attemptRegister();
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
            HashMap loginInfo = new HashMap<String, String>();
            try (ObjectInputStream is = new ObjectInputStream(new FileInputStream(filePath))) {
                while (loginInfo.isEmpty()) {
                    loginInfo = (HashMap) is.readObject();
                }
                return loginInfo;
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
    public void save(Map<String, String> users) throws IOException {
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



