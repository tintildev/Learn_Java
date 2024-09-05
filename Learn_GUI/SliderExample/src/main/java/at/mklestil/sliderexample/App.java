package at.mklestil.sliderexample;

import at.mklestil.sliderexample.control.MyController;
import at.mklestil.sliderexample.view.MyView;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //MVC
        MyView view = new MyView();
        MyController controller = new MyController(view);

        //JavaFX Stage, scene
        Scene scene = new Scene(view.getRoot(), 500, 500);
        stage.setTitle("Hello World!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}