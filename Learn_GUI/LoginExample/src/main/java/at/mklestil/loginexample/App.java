package at.mklestil.loginexample;

import at.mklestil.loginexample.view.MyView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        MyView view = new MyView();


        Scene scene = new Scene(view.getRoot(), 250, 150);

        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}