package at.mklestil.pomodorotimer;

import at.mklestil.pomodorotimer.control.MyController;
import at.mklestil.pomodorotimer.view.MainWindow;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        MainWindow view = new MainWindow();
        MyController controller = new MyController(view);
        Scene scene = new Scene(view.getRoot(), 320, 240);
        Image icon = new Image(getClass().getResourceAsStream("/images/Icon.png"));
        stage.getIcons().add(icon);
        stage.setTitle("Pomodoro Timer");
        stage.setScene(scene);
        stage.show();



    }

    public static void main(String[] args) {
        launch();
    }
}