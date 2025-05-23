package at.mklestil.mysnakegame;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import at.mklestil.mysnakegame.control.SceneManager;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        SceneManager.getInstance(stage);
        
        stage.setTitle("Hello World!");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}