package at.mklestil.notepad.model;

import at.mklestil.notepad.view.MainWindow;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;

import java.util.ArrayList;

public class EditModel {

    private MainWindow view;

    public EditModel(Menu menu, MainWindow view) {
        this.view = view;
        ArrayList<MenuItem> menu1 = new ArrayList<MenuItem>(menu.getItems());
        menu1.get(0).setOnAction(listenerCut());
        menu1.get(1).setOnAction(listenerCopy());
        menu1.get(2).setOnAction(listenerPast());
        menu1.get(3).setOnAction(listenerDelete());
    }

    public EventHandler<ActionEvent> listenerCut(){
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                view.getTextArea().cut();
            }
        };
        return event;
    }

    public EventHandler<ActionEvent> listenerCopy(){
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                view.getTextArea().copy();
            }
        };
        return event;
    }

    public EventHandler<ActionEvent> listenerPast(){
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                view.getTextArea().paste();
            }
        };
        return event;
    }

    public EventHandler<ActionEvent> listenerDelete(){
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                //Todo: Delet Text
                //view.getTextArea().deleteText();
            }
        };
        return event;
    }
}
