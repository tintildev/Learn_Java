package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
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
        Text txt = new Text("Hello World, Sup?");
        txt.setY(50);
        Button btn = new Button("Say Sup!");

        //add notes to Layout
        box.getChildren().addAll(txt, btn);

        root.getChildren().add(box);
        primaryStage.setTitle("Sup? Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
