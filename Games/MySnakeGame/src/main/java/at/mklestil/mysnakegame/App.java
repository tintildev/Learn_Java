package at.mklestil.mysnakegame;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

import at.mklestil.mysnakegame.control.SceneManager;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        SceneManager.getInstance(stage).showStartView();;
       
    }

    public static void main(String[] args) {
        launch();
    }
}