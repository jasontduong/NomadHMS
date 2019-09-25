package login;

import java.util.Scanner;

public class Login {

    private static String admin = "adminuser";
    private static String adminpw = "admin$";

    public static void main(String[] args) {

        Scanner reader1 = new Scanner(System.in);

        while (true) {
            System.out.print("What do you want to do? Login, or Quit?: ");
            String choice1 = reader1.nextLine();

            if (choice1.equals("Quit")) {
                System.out.println("Okay bye!");
                break;
            }

            if (choice1.equals("Login")) {
                logmein();
                break;
            }
        }
    }

    // logs user in
    private static void logmein() {
        Scanner reader2 = new Scanner(System.in);

        System.out.print("Type your username: ");
        String id1 = reader2.nextLine();
        System.out.print("Type your password: ");
        String pw1 = reader2.nextLine();

        if (id1.equals(admin) && pw1.equals(adminpw)) {
            System.out.println(login(id1));
        }
        if (id1.equals("Poop") && pw1.equals("poop")) {
            System.out.println(login(id1));
        }
        invalid(id1, pw1);
    }

    // if username or password does not match
    private static void invalid(String id1, String pw1) {
        if (!id1.equals(admin)) {
            System.out.println("Your username is invalid!");
        } else if (!pw1.equals(adminpw)) {
            System.out.println("Your password is invalid!");
        }
    }

    // if login is successful
    private static String login(String id1) {
        return "Welcome to JasonHMS " + id1 + "!";
    }

}
