package at.mklestil.widgetprogramicon;

import at.mklestil.widgetprogramicon.view.MyView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        MyView view = new MyView();
        Scene scene = new Scene(view.getRoot(), 320, 240);
        stage.setTitle("Hello World!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}