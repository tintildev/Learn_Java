package at.mklestil.listviewexample.view;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.TextFieldListCell;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.util.ArrayList;

public class MyView {

    private HBox root = new HBox(40);
    private Scene scene = new Scene(root, 600, 400);
    private ListView<String> listView;
    private ArrayList<MyButton> buttons;

    public MyView() {

        //ListView - create list
        listView = new ListView<String>();

        //create list - obersvableList
        ObservableList<String> observableList = FXCollections.observableArrayList();
        observableList.addAll("Wien", "St.Pölten", "Linz", "Granz", "Bregenz", "Insbruch", "Villach");

        //ListView methods
        listView.setItems(observableList);
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        //Editable
        listView.setEditable(true);
        listView.setCellFactory(TextFieldListCell.forListView());

        //VBox
        VBox vBox = new VBox();

        //Buttons
        buttons = new ArrayList<>();
        buttons.add(new MyButton("Select All", "all"));
        buttons.add(new MyButton("Select Nothing", "nothing"));
        buttons.add(new MyButton("Select First", "first"));
        buttons.add(new MyButton("Select Last", "last"));


        //add Element VBox
        for(MyButton myButton : buttons){
            vBox.getChildren().add(myButton);
        }

        // CSS
        root.setStyle("-fx-padding: 10;" );

        //add element to root
        root.getChildren().add(listView);
        root.getChildren().add(vBox);
    }

    public Scene getScene() {
        return scene;
    }

    public ListView<String> getListView() {
        //This is my HBox
        return listView;
    }

    public ArrayList<MyButton> getButtons() {
        return buttons;
    }
}

