package ui.login;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.PasswordField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    @FXML
    public TextField username1;
    @FXML
    public PasswordField password1;
    private double mouseX = 0;
    private double mouseY = 0;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    void dragged(MouseEvent event) {
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();

        stage.setX(event.getScreenX() - mouseX);
        stage.setY(event.getScreenY() - mouseY);

    }

    @FXML
    void pressed(MouseEvent event) {
        mouseX = event.getSceneX();
        mouseY = event.getSceneY();

    }

    @FXML
    void enterPressed(MouseEvent event) {
        String user = username1.getText();
        String pass = password1.getText();
        if (user.equals("foopa") && pass.equals("boopa")) {
            JOptionPane.showMessageDialog(null, "Great Success!");
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect!");
        }
    }
}


