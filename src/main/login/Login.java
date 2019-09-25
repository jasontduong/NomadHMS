package login;

import java.util.ArrayList;
import java.util.Scanner;

public class Login {

    LoginDatabase logMeIn = new LoginDatabase();
    UserList newUserList = new UserList();
    PhoneNumberList newPhone = new PhoneNumberList();


    // asks user for a choice
    public void choice() {
        Scanner reader1 = new Scanner(System.in);

        while (true) {
            System.out.print("What do you want to do? Login, Register, or Quit?: ");
            String choice1 = reader1.nextLine();

            if (choice1.equals("Quit")) {
                System.out.println("Okay bye!");
                break;
            }

            if (choice1.equals("Login")) {
                attemptLogin();
                break;
            }

            if (choice1.equals("Register")) {
                attemptRegister();
                break;
            }
        }
    }

    public ArrayList<String> listAllUsers() {
        return newUserList.userList;
    }

    public void attemptRegister() {
        Scanner reader3 = new Scanner(System.in);

        System.out.println("Pick one of the two: Bob, or Molly");
        String regUser = reader3.nextLine();

        if (regUser.equals("Bob")) {
            newUserList.addUser("Bob");
        } else if (regUser.equals("Molly")) {
            newUserList.addUser("Molly");
        }
        System.out.println("Success! Registered ID: " + regUser);

        System.out.println("Would you like to add a phone number to your account? Yes or No? ");

        String phoneChoice = reader3.nextLine();

        if (phoneChoice.equals("Yes")) {
            registerPhone();
        } else {
            System.out.println("Goodbye " + regUser + "!");
        }
    }


    public void registerPhone() {
        Scanner reader4 = new Scanner(System.in);
        System.out.println("Please input your number now: ");
        Integer regPhone = Integer.parseInt(reader4.nextLine());
        newPhone.addPhone(regPhone);
        System.out.println("You have added the number " + regPhone + " to your account!");
    }

    // logs user in
    public void attemptLogin() {
        Scanner reader2 = new Scanner(System.in);
        while (true) {
            System.out.print("Type your username: ");
            String id1 = reader2.nextLine();
            System.out.print("Type your password: ");
            String pw1 = reader2.nextLine();

            if (id1.contains(logMeIn.usernames()) && pw1.equals(logMeIn.passwords())) {
                System.out.println(loginSuccess(id1));
                break;
            }
            invalid(id1, pw1);
        }
    }

    // if username or password does not match
    public void invalid(String id1, String pw1) {
        if (!id1.contains(logMeIn.usernames())) {
            System.out.println("Your username is invalid! Try again!");
        } else if (!pw1.contains(logMeIn.passwords())) {
            System.out.println("Your password is invalid! Try again!");
        }
    }

    public String loginSuccess(String id1) {
        return "Welcome to JasonHMS " + id1 + "!";
    }

}
