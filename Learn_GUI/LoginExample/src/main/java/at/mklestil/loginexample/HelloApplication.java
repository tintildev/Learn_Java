package at.mklestil.loginexample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        GridPane root = new GridPane();

        Scene scene = new Scene(root, 400, 400);

        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}