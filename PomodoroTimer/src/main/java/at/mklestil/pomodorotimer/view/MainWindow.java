package at.mklestil.pomodorotimer.view;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class MainWindow {
    private BorderPane root;
    private Label status;
    private Button plus = new Button("+");
    private Button minus = new Button("-");
    private ProgressIndicator progressIndicator;
    private Button startButton = new Button("Start");
    private Button breakButton = new Button("Break");
    private Button resetButton = new Button("Rest");
    private Label time;

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
        status = new Label("Ready to start!");
        status.setFont(Font.font("Roboto"));
        time = new Label("25:00");

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

        // create Background
        BackgroundFill backgroundFill = new BackgroundFill(
                Color.web("#55C57A"),  // color
                null,  // Ecken (CornerRadii)
                null   // Rand (Insets)
        );

        // set Background
        root.setBackground(new Background(backgroundFill));
    }

    public BorderPane getRoot() {
        return root;
    }

    public Label getStatus() {
        return status;
    }

    public Button getPlus() {
        return plus;
    }

    public Button getMinus() {
        return minus;
    }

    public ProgressIndicator getProgressIndicator() {
        return progressIndicator;
    }

    public Button getStartButton() {
        return startButton;
    }

    public Button getBreakButton() {
        return breakButton;
    }

    public Button getResetButton() {
        return resetButton;
    }

    public Label getTimeLabel() {
        return time;
    }
}
