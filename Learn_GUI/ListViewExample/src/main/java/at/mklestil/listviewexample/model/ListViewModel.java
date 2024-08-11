package at.mklestil.listviewexample.model;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

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

        //Edit List
        listView.setOnEditCommit(new EventHandler<ListView.EditEvent<String>>() {
            @Override
            public void handle(ListView.EditEvent<String> stringEditEvent) {
                //only when pressing Enter
                String newValue = stringEditEvent.getNewValue();
                int index = stringEditEvent.getIndex();
                //Observerbale List
                listView.getItems().set(index, newValue);

                Stage stage = new Stage();
                StackPane root = new StackPane();
                Button button = new Button("Are you sure?");
                button.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        stage.close();
                    }
                });
                root.getChildren().add(button);

                Scene scene = new Scene(root, 200, 100);
                stage.setScene(scene);
                stage.show();

            }
        });

        listView.setOnEditStart(new EventHandler<ListView.EditEvent<String>>() {
            @Override
            public void handle(ListView.EditEvent<String> stringEditEvent) {
                System.out.println("start edit");
            }
        });

        listView.setOnEditCancel(new EventHandler<ListView.EditEvent<String>>() {
            @Override
            public void handle(ListView.EditEvent<String> stringEditEvent) {
                System.out.println("ende edit");

            }
        });
    }
}
