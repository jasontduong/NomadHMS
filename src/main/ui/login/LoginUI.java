package ui.login;

import model.Suite;

import java.io.IOException;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import ui.login.LoginChoice;

public class LoginUI {

    private static LoginChoice loginChoiceAttempt;


    public static void main(String[] args) {
        try {
            choice();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Invalid choice!");
        }

    }

    private static void choice() throws IOException, ClassNotFoundException {
        loginChoiceAttempt = new LoginChoice();
        Scanner reader1 = new Scanner(System.in);

        System.out.print("What do you want to do? Login, Register, or Quit?: ");
        String choice1 = reader1.nextLine();

        if (choice1.equals("Quit") || choice1.equals("quit")) {
            System.out.println("Okay bye!");
        }

        if (choice1.equals("Register") || choice1.equals("register")) {
            loginChoiceAttempt.attemptRegister();
        }
        if (choice1.equals("Login") || choice1.equals("login")) {
            loginHelper();
        }

    }


    private static void loginHelper() throws IOException, ClassNotFoundException {
        loginChoiceAttempt = new LoginChoice();
        loginChoiceAttempt.attemptLogin();
        System.out.println("Going back to start screen...");
        choice();
    }
}

//    private static void parse() {
//        System.out.println("Printing out list of top hotels in Downtown Vancouver from TripAdvisor...");
//        try {
//            Document doc = Jsoup.connect("https://www.tripadvisor.ca/HotelsList-Vancouver-Downtown-Hotels-zfp10838232.html").userAgent("Mozilla/17.0").get();
//            Elements temp = doc.select("div.listing_title");
//            int i = 0;
//            for (Element hotelList : temp) {
//                i++;
//                System.out.println(i + " " + hotelList.getElementsByTag("a").first().text());
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
