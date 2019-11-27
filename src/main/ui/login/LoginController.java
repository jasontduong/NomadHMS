package ui.login;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.stage.StageStyle;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;
import model.LoadSave;

public class LoginController implements Initializable {

    @FXML
    public TextField username1;
    @FXML
    public PasswordField password1;
    private double mouseX = 0;
    private double mouseY = 0;

    LoadSave loadSave = new LoadSave();

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
        if (loadSave.load(user, pass)) {
            JOptionPane.showMessageDialog(null, "Great Success!");
            Parent root;
            try {
                root = FXMLLoader.load(getClass().getResource("../dashboard/dashboard.fxml"));
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
//                stage.initStyle(StageStyle.UNDECORATED);
                stage.show();
                ((Node) (event.getSource())).getScene().getWindow().hide();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect!");
        }
    }
}


