package at.mklestil.propertyexample;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.property.SimpleStringProperty;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;

public class PropertyApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        SimpleStringProperty textProperty = new SimpleStringProperty("Hello");

        Label infoLabel = new Label("This label is automatically updated by a property.");
        Label label = new Label();
        label.setTextFill(Color.RED);
        label.textProperty().bind(textProperty);

        TextField textField = new TextField();
        textProperty.bind(textField.textProperty());

        //create circle and panel
        Label infoLabel2 = new Label("Circle size updated by a property.");
        Circle circle = new Circle();
        Pane pane = new Pane();
        pane.setPrefHeight(100);

        // circle center, bind its properties to the size of the panel
        circle.centerXProperty().bind(pane.widthProperty().divide(2));
        circle.centerYProperty().bind(pane.heightProperty().divide(2));
        circle.radiusProperty().bind(Bindings.min(pane.widthProperty(), pane.heightProperty()).divide(2));

        // set color of circle
        circle.setFill(Color.LIGHTBLUE);
        circle.setStroke(Color.DARKBLUE);
        circle.setStrokeWidth(3);

        //add
        pane.getChildren().add(circle);

        VBox root = new VBox(infoLabel, label, textField, infoLabel2, pane);
        root.setSpacing(10);
        root.setPadding(new Insets(10));

        //Set the growth of the panel within the VBox
        VBox.setVgrow(pane, Priority.ALWAYS);

        Scene scene = new Scene(root, 300, 200);

        primaryStage.setTitle("Property Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}