package login;

import java.util.Scanner;

public class Login {

    private static String admin = "adminuser";
    private static String adminpw = "admin$";

    // asks user for a choice
    public void choice() {
        Scanner reader1 = new Scanner(System.in);

        while (true) {
            System.out.print("What do you want to do? Login, or Quit?: ");
            String choice1 = reader1.nextLine();

            if (choice1.equals("Quit")) {
                System.out.println("Okay bye!");
                break;
            }

            if (choice1.equals("Login")) {
                attemptLogin();
                break;
            }
        }
    }

    // logs user in
    public void attemptLogin() {
        Scanner reader2 = new Scanner(System.in);
        while (true) {
            System.out.print("Type your username: ");
            String id1 = reader2.nextLine();
            System.out.print("Type your password: ");
            String pw1 = reader2.nextLine();

            if (id1.equals(admin) && pw1.equals(adminpw)) {
                System.out.println(loginSuccess(id1));
                break;
            }
            if (id1.equals("Poop") && pw1.equals("poop")) {
                System.out.println(loginSuccess(id1));
                break;
            }
            invalid(id1, pw1);
        }
    }

    // if username or password does not match
    public void invalid(String id1, String pw1) {
        if (!id1.equals(admin)) {
            System.out.println("Your username is invalid! Try again!");
        } else if (!pw1.equals(adminpw)) {
            System.out.println("Your password is invalid! Try again!");
        }
    }

    public String loginSuccess(String id1) {
        return "Welcome to JasonHMS " + id1 + "!";
    }

}
