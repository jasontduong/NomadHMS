package login;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String admin = "adminuser";
        String adminpw = "admin$";

        while (true) {
            System.out.print("Type your username: ");
            String id1 = reader.nextLine();
            System.out.print("Type your password: ");
            String pw1 = reader.nextLine();

            if (id1.equals(admin) && pw1.equals(adminpw)) {
                System.out.println("Welcome to JasonHMS " + id1 + "!");
                break;
            } else if (!id1.equals(admin)) {
                System.out.println("Your username is invalid!");
            } else if (id1.equals(admin) && !pw1.equals(adminpw)) {
                System.out.println("Your password is invalid!");
            }
        }
    }
}
