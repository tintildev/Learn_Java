package at.mklestil.listviewexample.model;

import javafx.event.EventHandler;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

import java.util.List;

public class ListViewModel {

    public ListViewModel(ListView<String> listView){
        listView.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                System.out.println("Index: " + listView.getSelectionModel().getSelectedIndex());
                System.out.println("Item: " + listView.getSelectionModel().getSelectedItem());
            }
        });
    }
}
