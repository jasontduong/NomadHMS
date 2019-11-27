package ui.dashboard;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DashboardController implements Initializable {

    @FXML
    private VBox reservations = null;
    @FXML
    private Button signOut;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Node[] n = new Node[6];
        for (int i = 0; i < n.length; i++) {
            final int u = i;
            try {
                n[i] = FXMLLoader.load(getClass().getResource("reservation.fxml"));
                n[i].setOnMouseExited(event -> {
                    n[u].setStyle("-fx-background-color : #02030A");
                });
                n[i].setOnMouseEntered(event -> {
                    n[u].setStyle("-fx-background-color : #0A0E3F");
                });
                reservations.getChildren().add(n[i]);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


    public void handleClicks(ActionEvent actionEvent) {

        if (actionEvent.getSource() == signOut) {
            Platform.exit();
            System.exit(0);
        }

    }
}
