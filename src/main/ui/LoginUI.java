package ui;

import login.Login;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LoginUI extends JFrame {

    public static final int WIDTH = 600;
    public static final int HEIGHT = 300;

    public static void main(String[] args) throws IOException {
        Login loginAttempt = new Login();
        loginAttempt.choice();
    }
}