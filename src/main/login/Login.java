package login;

import java.util.Scanner;

public class Login {

    private static String admin = "adminuser";
    private static String adminpw = "admin$";

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.print("What do you want to do? Login, Register, or Quit?: ");
            String choice1 = reader.nextLine();

            if (choice1.equals("Quit")) {
                System.out.println("Okay bye!");
                break;
            }

            if (choice1.equals("Login")) {

                System.out.print("Type your username: ");
                String id1 = reader.nextLine();
                System.out.print("Type your password: ");
                String pw1 = reader.nextLine();

                if (id1.equals(admin) && pw1.equals(adminpw)) {
                    System.out.println(login(id1));
                    break;
                }
                if (id1.equals("Poop") && pw1.equals("poop")) {
                    System.out.println(login(id1));
                    break;
                }
                invalid(id1, pw1);
            }
        }
    }

    // if login is successful
    private static String login(String id1) {
        return "Welcome to JasonHMS " + id1 + "!";
    }

    // if username or password does not match
    private static void invalid(String id1, String pw1) {
        if (!id1.equals(admin)) {
            System.out.println("Your username is invalid!");
        } else if (!pw1.equals(adminpw)) {
            System.out.println("Your password is invalid!");
        }
    }

    //  public void register() {
    //  String id2 = "Poop"; //needs to take user input
    //  String pw2 = "poop"; //needs to take user input
    //  System.out.println("Registered successfully!");
    //  }
}
