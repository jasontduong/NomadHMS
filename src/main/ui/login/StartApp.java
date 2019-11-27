package ui.login;

import ui.dashboard.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import static javafx.scene.paint.Color.TRANSPARENT;

public class StartApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent fxml = FXMLLoader.load(getClass().getResource("login.fxml"));

        Scene scene = new Scene(fxml);

        scene.setFill(TRANSPARENT);

        primaryStage.setScene(scene);

        primaryStage.initStyle(StageStyle.TRANSPARENT);

        primaryStage.show();
    }

    public static void main(String... args) {
        launch(args);
    }
}
