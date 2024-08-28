package at.mklestil.notepad;

import at.mklestil.notepad.control.MyController;
import at.mklestil.notepad.view.Window;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // In this Example, i create a notepad.

        Window view = new Window();
        MyController controller = new MyController(view);
        Scene scene = new Scene(view.getRoot(), 320, 440);
        stage.setTitle("Notepad");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}