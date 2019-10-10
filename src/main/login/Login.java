package login;

import java.io.*;
import java.util.*;

public class Login implements Loadable, Saveable {
    public String txt;
    ArrayList<String> newUserList = new ArrayList<String>();

//    public void choice() throws IOException {
//        //   List<String> loginAccounts = Files.readAllLines(Paths.get("accounts.txt"));;
//        Scanner reader1 = new Scanner(System.in);
//
//        while (true) {
//            System.out.print("What do you want to do? Login, Register, or Quit?: ");
//            String choice1 = reader1.nextLine();
//
//            if (choice1.equals("Quit") || choice1.equals("quit")) {
//                System.out.println("Okay bye!");
//                break;
//            }
//
//            if (choice1.equals("Login") || choice1.equals("login")) {
//                attemptLogin();
//                break;
//            }
//
//            if (choice1.equals("Register") || choice1.equals("register")) {
//                attemptRegister();
//            }
//            break;
//        }
//    }


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

    public void attemptLogin() {
        String filePath = ("accounts.txt");
        Scanner reader2 = new Scanner(System.in);
        while (true) {
            System.out.print("Type your username: ");
            String user = reader2.nextLine();
            System.out.print("Type your password: ");
            String pass = reader2.nextLine();
            if (load(user, pass)) {
                System.out.println("Login Success!");
            } else {
                System.out.println("Invalid!");
            }
            break;

        }

    }

    @Override
    public boolean load(String user, String pass) {
        String filePath = ("accounts.txt");
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
        BufferedWriter out = new BufferedWriter(new FileWriter("accounts.txt", true));
        out.write(user1 + ":" + pass1);
        out.newLine();
        out.close();
        return (user1 + ":" + pass1);
    }


}



