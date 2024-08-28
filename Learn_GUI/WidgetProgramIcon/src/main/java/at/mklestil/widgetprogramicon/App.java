package at.mklestil.widgetprogramicon;

import at.mklestil.widgetprogramicon.control.MyController;
import at.mklestil.widgetprogramicon.view.MyView;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

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


        //Transparent
        scene.setFill(Color.TRANSPARENT);
        stage.initStyle(StageStyle.TRANSPARENT);

        stage.show();

        //Position
        //Screen Size
        Rectangle2D screenSize = Screen.getPrimary().getVisualBounds();
        double x = (screenSize.getWidth() - stage.getWidth()) / 2;
        double y = screenSize.getHeight() - stage.getHeight() - 40;
        stage.setX(x);
        stage.setY(y);


    }

    public static void main(String[] args) {
        launch();
    }
}