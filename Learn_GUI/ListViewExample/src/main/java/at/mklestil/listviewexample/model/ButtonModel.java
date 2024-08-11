package at.mklestil.listviewexample.model;

import at.mklestil.listviewexample.view.MyButton;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.ListView;

public class ButtonModel {
    public ButtonModel(ListView listView, MyButton button) {
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                switch (button.getType()){
                    case "all":
                        listView.getSelectionModel().selectAll();
                        break;
                    case "nothing":
                        listView.getSelectionModel().clearSelection();
                        break;
                    case "first":
                        listView.getSelectionModel().selectFirst();
                        break;
                    case "last":
                        listView.getSelectionModel().selectLast();
                        break;
                    case "":
                        listView.getSelectionModel().clearSelection();
                        System.out.println("Empty Button type!");
                        break;
                }
            }
        });
    }
}
