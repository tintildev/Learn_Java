package at.mklestil.pomodorotimer.view;

import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

public class MainWindow {
    private BorderPane root;
    private Label status;
    private Label plus = new Label("+");
    private Label minus = new Label("-");
    private ProgressIndicator progressIndicator;

    public MainWindow() {
        root = new BorderPane();

        //Timer
        HBox hbox = new HBox();
        progressIndicator = new ProgressIndicator();
        hbox.getChildren().addAll(plus, progressIndicator, minus);

        //Status
        status = new Label("Wait");

        //Add root
        root.setTop(status);
        root.setCenter(hbox);
    }

    public BorderPane getRoot() {
        return root;
    }
}
