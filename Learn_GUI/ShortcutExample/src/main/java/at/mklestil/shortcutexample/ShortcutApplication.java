package at.mklestil.shortcutexample;

import at.mklestil.shortcutexample.controll.MyController;
import at.mklestil.shortcutexample.view.ShortCutView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ShortcutApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        ShortCutView view = new ShortCutView();
        MyController controller = new MyController(view);
        Scene scene = new Scene(view.getRoot(), 400, 90);
        //Add CSS
        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

        // Set Stage
        stage.setTitle("Shortcut Application");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}