package at.mklestil.calculatorjavafx;

import at.mklestil.calculatorjavafx.control.CalculatorController;
import at.mklestil.calculatorjavafx.view.CalculatorScene;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        // Erstelle die Hauptansicht
        CalculatorScene viewCalc = new CalculatorScene();
        CalculatorController controller = new CalculatorController(viewCalc);

        Scene scene = new Scene(viewCalc.getGridPane(), 250, 300);

        // Setze die Szene
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        // Starte die JavaFX-Anwendung
        launch();
    }
}