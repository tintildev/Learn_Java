package at.mklestil.listviewexample.view;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class MyView {

    private HBox root = new HBox(40);
    private Scene scene = new Scene(root, 600, 400);
    private ListView<String> listView;

    public MyView() {

        //ListView - create list
        listView = new ListView<String>();

        //create list - obersvableList
        ObservableList<String> observableList = FXCollections.observableArrayList();
        observableList.addAll("Wien", "St.Pölten", "Linz", "Granz", "Bregenz", "Insbruch", "Villach");

        //ListView methods
        listView.setItems(observableList);
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        //VBox
        VBox vBox = new VBox();

        //Buttons
        Button selectAll = new Button("Select All");
        Button selectNothing = new Button("Select Nothing");
        Button selectFirst = new Button("Select First");
        Button selectLast = new Button("Select Last");

        //add Element VBox
        vBox.getChildren().addAll(selectAll, selectFirst, selectLast, selectNothing);

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
}

