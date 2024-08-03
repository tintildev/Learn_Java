package at.mklestil.listviewexample.view;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.HBox;

public class MyView {

    private HBox root = new HBox();
    private Scene scene = new Scene(root, 600, 400);

    public MyView() {

        //ListView - create list
        ListView<String> listView = new ListView<String>();

        //create list - obersvableList
        ObservableList<String> observableList = FXCollections.observableArrayList();
        observableList.addAll("Wien", "St.Pölten", "Linz", "Granz", "Bregenz", "Insbruch", "Villach");

        //ListView methods
        listView.setItems(observableList);
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        //add element to root
        root.getChildren().add(listView);
    }

    public Scene getScene() {
        return scene;
    }
}
