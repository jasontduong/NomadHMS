package login;

import java.util.Scanner;

public class Login {

    private static String admin = "adminuser";
    private static String adminpw = "admin$";

    public static void main(String[] args) {
        choice();
    }

    private static void choice() {
        Scanner reader1 = new Scanner(System.in);

        while (true) {
            System.out.print("What do you want to do? Login, or Quit?: ");
            String choice1 = reader1.nextLine();

            if (choice1.equals("Quit")) {
                System.out.println("Okay bye!");
                break;
            }

            if (choice1.equals("Login")) {
                attemptlogin();
                break;
            }
        }
    }

    // logs user in
    private static void attemptlogin() {
        Scanner reader2 = new Scanner(System.in);
        while (true) {
            System.out.print("Type your username: ");
            String id1 = reader2.nextLine();
            System.out.print("Type your password: ");
            String pw1 = reader2.nextLine();

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

    // if username or password does not match
    private static void invalid(String id1, String pw1) {
        if (!id1.equals(admin)) {
            System.out.println("Your username is invalid! Try again!");
        } else if (!pw1.equals(adminpw)) {
            System.out.println("Your password is invalid! Try again!");
        }
    }

    // if login is successful
    private static String login(String id1) {
        return "Welcome to JasonHMS " + id1 + "!";
    }

}
