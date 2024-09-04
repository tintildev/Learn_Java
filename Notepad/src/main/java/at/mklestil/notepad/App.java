package at.mklestil.notepad;

import at.mklestil.notepad.control.MyController;
import at.mklestil.notepad.view.MainWindow;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // In this Example, i create a notepad.
        Image icon = new Image(getClass().getResourceAsStream("/images/Notpad.png"));

        MainWindow view = new MainWindow();
        MyController controller = new MyController(view);
        Scene scene = new Scene(view.getRoot(), 320, 440);
        stage.setTitle("Notepad");
        stage.setScene(scene);
        stage.getIcons().add(icon);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}