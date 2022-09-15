package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        //Container
        Group root = new Group();

        //Add Layout - Vertical Box
        VBox box = new VBox();

        //Add Nodes
        Text txt = new Text("Sup?");
        txt.setY(50);
        txt.setFont(new Font("Papyrus", 80));

        //Name input
        Label nameLabel = new Label("Name");
        TextField nameField = new TextField();
        Button btn = new Button("Say Sup!");
        GridPane grid = new GridPane();
        grid.add(nameLabel,0,0);
        grid.add(nameField,1, 0);
        grid.add(btn, 1, 1);
        grid.setHgap(20);

        //see Gridlines
        //grid.setGridLinesVisible(true);

        //Event
        btn.setOnAction(event -> System.out.printf("Sup %s!%n", nameField.getText()));

        //add notes to Layout
        box.getChildren().addAll(txt, grid);

        root.getChildren().add(box);
        primaryStage.setTitle("Sup? Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
