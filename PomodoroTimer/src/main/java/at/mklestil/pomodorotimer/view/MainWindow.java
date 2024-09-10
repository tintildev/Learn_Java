package at.mklestil.pomodorotimer.view;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class MainWindow {
    private BorderPane root;
    private Label status;
    private Label plus = new Label("+");
    private Label minus = new Label("-");
    private ProgressIndicator progressIndicator;
    private Button startButton = new Button("Start");
    private Button breakButton = new Button("Break");
    private Button resetButton = new Button("Rest");
    private int timeValue = 25;

    public MainWindow() {
        root = new BorderPane();

        //Timer
        VBox vBox = new VBox(5);
        HBox hbox = new HBox(5);
        progressIndicator = new ProgressIndicator();
        hbox.getChildren().addAll(plus, progressIndicator, minus);
        HBox buttonBox = new HBox(5);
        buttonBox.getChildren().addAll(startButton, breakButton, resetButton);
        vBox.getChildren().addAll(hbox, buttonBox);


        //Status and Time
        status = new Label("Wait");
        Label time = new Label("25:00");

        //Add root
        root.setTop(status);
        root.setCenter(vBox);
        root.setBottom(time);

        //Center Elements
        hbox.setStyle("-fx-alignment: center;");
        buttonBox.setStyle("-fx-alignment: center;");
        vBox.setStyle("-fx-alignment: center;");
        BorderPane.setAlignment(status, Pos.CENTER);
        BorderPane.setAlignment(time, Pos.CENTER);
    }

    public BorderPane getRoot() {
        return root;
    }
}
