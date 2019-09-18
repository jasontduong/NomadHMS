package login;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import javax.sound.sampled.Line;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Login {

    public static String admin = "adminuser";
    public static String adminpw = "admin$";

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
                }
                if (id1.equals(id1.equals("Poop")) && pw1.equals("poop")) {
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
        } else if (id1.equals(admin) && !pw1.equals(adminpw)) {
            System.out.println("Your password is invalid!");

        }

    }

    public void Register(String id1, String pw1) {
        id1 = "Poop"; //needs to take user input
        pw1 = "poop"; //needs to take user input
        System.out.println("Registered successfully!");
    }

}
