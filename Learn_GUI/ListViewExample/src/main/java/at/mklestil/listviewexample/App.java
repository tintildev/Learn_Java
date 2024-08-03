package at.mklestil.listviewexample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import at.mklestil.listviewexample.view.MyView;
import at.mklestil.listviewexample.control.MyController;

import java.io.IOException;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //MVC
        MyView view = new MyView();
        MyController controller = new MyController(view);

        //JavaFX
        stage.setTitle("ListView Example");
        stage.setScene(view.getScene());
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}