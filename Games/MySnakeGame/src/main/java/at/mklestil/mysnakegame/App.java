package at.mklestil.mysnakegame;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import at.mklestil.mysnakegame.control.MainController;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        MainController.getInstance();
        
        stage.setTitle("Hello World!");
        stage.setScene(MainController.getInstance().getScene());
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}