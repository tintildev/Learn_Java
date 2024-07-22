package at.mklestil.widgetprogramicon;

import at.mklestil.widgetprogramicon.control.MyController;
import at.mklestil.widgetprogramicon.view.MyView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //MVC
        MyView view = new MyView();
        MyController controller = new MyController(view);

        //JavaFX
        Scene scene = new Scene(view.getRoot(), 520, 240);
        stage.setTitle("Hello World!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}