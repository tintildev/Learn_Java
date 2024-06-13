package at.mklestil.propertyexample;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
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

        VBox root = new VBox(infoLabel, label, textField);
        Scene scene = new Scene(root, 300, 200);

        primaryStage.setTitle("Property Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}